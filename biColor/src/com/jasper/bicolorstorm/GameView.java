package com.jasper.bicolorstorm;

import java.util.Stack;

import javax.security.auth.PrivateCredentialPermission;

import android.R.color;
import android.R.integer;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.Toast;

public class GameView extends SurfaceView implements Callback {
	private int screenW; // 屏幕宽度
	private int screenH; // 屏幕高度
	private final int cellNumberW = 6; // 每行6个方块
	private final int cellNumberH = 9; // 每列9个方块
	private float cellW; // 每个方块的宽度
	private float cellH; // 每个方块的高度

	private Paint paintMainPaint; // 定义主画笔
	private Paint paintSecPaint;
	private Paint paintMainNumberPaint;
	private Paint paintSecNumberPaint;
	// 定义颜色数组

	private int paintMainColor = Color.RED; // 定义主画笔默认颜色
	private int paintSecColor = Color.WHITE;

	private float currentCxFloat; // 当前触摸x点
	private float currentCyFloat; //
	private float priviousCxFloat;
	private float priviousCyFloat;

	private int currentPosition; // 当前的方块位置（6*行 + 列）
	private int priviousPosition; // 上一个方块位置

	private boolean gameSuccessful = false;
	private boolean gameValid = false;
	private boolean drawFlash = false;
	private boolean flashWithMainPaint = true;

	Stack<int[][]> colorDataStack = new Stack<int[][]>();
	Stack<int[][]> stepDataStack = new Stack<int[][]>();

	private int colorData[][] = new int[cellNumberH][cellNumberW];
	private int stepData[][] = new int[cellNumberH][cellNumberW];
	private ConstantData constantDataInfo;

	private Canvas canvas = null; // 定义画布
	private MysurfaceviewThread th = null; // 定义线程
	private SurfaceHolder sfh = null;

	private int gameLevel = 1;

	// only used for level 3 for two numbers guider
	private int level3Step = 0; // totally 9 steps

	private Game game;

	// add show off and next level
	float showOffLength = 0;
	float showOffLeft = 0;
	float showOffTop = 0;
	float showOffAscent = 0;

	float nextLength = 0;
	float nextLeft = 0;
	float nextTop = 0;
	float nextAscent = 0;

	// show off and next level

	public GameView(Context context) {
		super(context);
		this.game = (Game) context;
		constantDataInfo = game.constantDataInfo;
		gameLevel = game.gameLevel;
		int[][] tempColorData = (int[][]) constantDataInfo.colorDataList
				.get(gameLevel - 1);
		int[][] tempStepData = (int[][]) constantDataInfo.stepDataList
				.get(gameLevel - 1);
		for (int i = 0; i < cellNumberH; i++) {
			for (int j = 0; j < cellNumberW; j++) {
				colorData[i][j] = tempColorData[i][j];
			    
			}
			Log.e("YIJIN", ""+colorData[i][0] + colorData[i][1]+colorData[i][2] + 
					colorData[i][3] + colorData[i][4]+colorData[i][5]);
		}
		for (int i = 0; i < cellNumberH; i++) {
			for (int j = 0; j < cellNumberW; j++) {
				stepData[i][j] = tempStepData[i][j];
			}
			Log.e("YIJIN", ""+colorData[i][0] + colorData[i][1]+colorData[i][2] + 
					colorData[i][3] + colorData[i][4]+colorData[i][5]);
		}
		

		sfh = getHolder();
		sfh.addCallback(this);
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// 获取屏幕宽度
		screenW = getWidth();
		// 获取屏幕高度
		screenH = getHeight();
		cellW = (float) (screenW) / cellNumberW;
		cellH = (float) (screenH) / cellNumberH;
		// Log.e("YIJIN", "screenW, screenH, cellW, cellH is " + screenW + ","
		// + screenH + "," + cellW + "," + cellH);

		// 初始化画笔
		initPaint();
		// 启动绘图线程
		th = new MysurfaceviewThread();
		th.start();
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {

	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		if (th != null) {
			th.exit();
			th = null;
		}

	}

	private void initPaint() {
		// main: colorData is 1
		// sec : colorData is 0
		paintMainPaint = new Paint();
		paintSecPaint = new Paint();
		paintMainNumberPaint = new Paint();
		paintSecNumberPaint = new Paint();
		// 设置消除锯齿
		paintMainPaint.setAntiAlias(true);
		paintSecPaint.setAntiAlias(true);
		paintMainNumberPaint.setAntiAlias(true);
		paintSecNumberPaint.setAntiAlias(true);
		// 设置画笔字体大小
		float cellTextSize = cellH * 0.55f;
		paintMainNumberPaint.setTextSize(cellTextSize);
		paintSecNumberPaint.setTextSize(cellTextSize);

		// 设置画笔颜色
		paintMainColor = game.getLevelColor((gameLevel - 1) / 15 + 1);
		paintSecColor = game.getSecColor();
		/*
		 * if ((gameLevel - 1) / 15 == 0) { paintMainColor =
		 * constantDataInfo.colorArray[1]; // 定义主画笔默认颜色 paintSecColor =
		 * constantDataInfo.colorArray[0]; } else if ((gameLevel - 1) / 15 == 1)
		 * { paintMainColor = constantDataInfo.colorArray[2]; // 定义主画笔默认颜色
		 * paintSecColor = constantDataInfo.colorArray[0]; } else {
		 * paintMainColor = constantDataInfo.colorArray[1]; // 定义主画笔默认颜色
		 * paintSecColor = constantDataInfo.colorArray[0]; }
		 */

		paintMainPaint.setColor(paintMainColor);
		paintSecPaint.setColor(paintSecColor);
		paintMainNumberPaint.setColor(paintSecColor);
		paintSecNumberPaint.setColor(paintMainColor);
	}

	private void drawFlash() {
		if (getStepDate(priviousPosition) > 0) {
			float left = currentCxFloat - cellW / 2;
			float top = currentCyFloat - cellH / 2;
			float right = currentCxFloat + cellW / 2;
			float bottom = currentCyFloat + cellH / 2;
			int array1 = priviousPosition / cellNumberW;
			int array2 = priviousPosition % cellNumberW;

			int tempPosition = (int) (currentCxFloat / cellW)
					+ ((int) (currentCyFloat / cellH)) * cellNumberW;

			if (!moveValid()) { // 无效方向的拖动，在priviousPosition画动画方块
				float originX = array2 * cellW + cellW / 2;
				float originY = array1 * cellH + cellH / 2;
				float radius = cellW;
				if (cellW > cellH) {
					radius = cellH;
				}

				// 计算移动方向和距离
				float deltaX = 0;
				float deltaY = 0;

				// 只有不在(privousPosition 以及上下左右的位置时才需要重新计算 deltax, deltay)
				if ((tempPosition == priviousPosition + 1)
						|| (tempPosition == priviousPosition - 1)
						|| (tempPosition == priviousPosition - 6)
						|| (tempPosition == priviousPosition + 6)
						|| (tempPosition == priviousPosition)) {
					deltaX = 0;
					deltaY = 0;
				} else {
					double length = (currentCxFloat - originX)
							* (currentCxFloat - originX)
							+ (currentCyFloat - originY)
							* (currentCyFloat - originY);
					length = Math.sqrt(length) + 0.0001;
					if (length > 0) {
						deltaX = (float) (radius * (currentCxFloat - originX) / length);
						deltaY = (float) (radius * (currentCyFloat - originY) / length);
					}
					left = array2 * cellW + deltaX;
					right = (array2 + 1) * cellW + deltaX;
					top = array1 * cellH + deltaY;
					bottom = (array1 + 1) * cellH + deltaY;
				}

			}
			// 画方块
			if (flashWithMainPaint) {
				canvas.drawRect(left, top, right, bottom, paintSecPaint);
				canvas.drawRect(left + cellW / 20, top + cellH / 20, right
						- cellW / 20, bottom - cellH / 20, paintMainPaint);
			} else {
				canvas.drawRect(left, top, right, bottom, paintMainPaint);
				canvas.drawRect(left + cellW / 20, top + cellH / 20, right
						- cellW / 20, bottom - cellH / 20, paintSecPaint);
			}

			// 画数字
			int numberLeft1 = (int) ((cellW - paintMainNumberPaint
					.measureText("9")) / 2);
			int numberLeft2 = (int) ((cellW - paintMainNumberPaint
					.measureText("99")) / 2);
			int numberLeft = numberLeft1;
			int numberTop = (int) ((cellH - paintMainNumberPaint.getTextSize()) / 2);
			float numberAscent = paintMainNumberPaint.ascent();
			// Log.e("YIJIN", "stepData of privousData is "
			// +stepData[array1][array2]);
			if (stepData[array1][array2] != 0) {
				if (stepData[array1][array2] > 9) {
					numberLeft = numberLeft2;
				}
				if (flashWithMainPaint) { // draw main number with sec number
											// paint
					canvas.drawText(String.valueOf(stepData[array1][array2]),
							left + (float) (numberLeft), top
									+ (float) (numberTop - numberAscent),
							paintMainNumberPaint);
				} else {
					canvas.drawText(String.valueOf(stepData[array1][array2]),
							left + (float) (numberLeft), top
									+ (float) (numberTop - numberAscent),
							paintSecNumberPaint);
				}
			}
		}
	}

	private Path drawTriPatch(int i, int j, int arrow) {
		// arrow
		// right:1, left:2, up:3, down:4
		Path rPath = new Path();
		if (arrow == 1) { // right
			rPath.moveTo(j * cellW + cellW / 3, i * cellH + cellH / 3);// 此点为多边形的起点
			rPath.lineTo(j * cellW + cellW / 3, i * cellH + cellH * 2 / 3);
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH / 2);
			rPath.close(); // 使这些点构成封闭的多边形
		} else if (arrow == 2) { // left
			rPath.moveTo(j * cellW + cellW / 3, i * cellH + cellH / 2);// 此点为多边形的起点
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH / 3);
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH * 2 / 3);
			rPath.close(); // 使这些点构成封闭的多边形
		} else if (arrow == 3) { // up
			rPath.moveTo(j * cellW + cellW / 2, i * cellH + cellH / 3);// 此点为多边形的起点
			rPath.lineTo(j * cellW + cellW / 3, i * cellH + cellH * 2 / 3);
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH * 2 / 3);
			rPath.close(); // 使这些点构成封闭的多边形
		} else if (arrow == 4) {// down
			rPath.moveTo(j * cellW + cellW / 3, i * cellH + cellH / 3);// 此点为多边形的起点
			rPath.lineTo(j * cellW + cellW / 2, i * cellH + cellH * 2 / 3);
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH / 3);
			rPath.close(); // 使这些点构成封闭的多边形
		} else { // using arrow =1
			rPath.moveTo(j * cellW + cellW / 3, 3 * cellH + cellH / 3);// 此点为多边形的起点
			rPath.lineTo(j * cellW + cellW / 3, i * cellH + cellH * 2 / 3);
			rPath.lineTo(j * cellW + cellW * 2 / 3, i * cellH + cellH / 2);
			rPath.close(); // 使这些点构成封闭的多边形
		}

		return rPath;
	}

	private void drawSpecialLevelCell() {
		if (gameLevel == 1) { // level 1 三角形
			// [3][2], [3][3], [3][4]
			int i = 3;
			int j = 2;
			for (j = 2; j < 5; j++) {
				if (colorData[i][j] == 0) {
					canvas.drawPath(drawTriPatch(i, j, 1), paintMainPaint);
				}
			}
		}
		if (gameLevel == 3) {
			if (level3Step == 0) {
				canvas.drawPath(drawTriPatch(4, 2, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(4, 3, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(4, 4, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(3, 4, 3), paintSecPaint);
			} else if (level3Step == 1) {
				canvas.drawPath(drawTriPatch(4, 3, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(4, 4, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(3, 4, 3), paintSecPaint);
			} else if (level3Step == 2) {
				canvas.drawPath(drawTriPatch(4, 4, 1), paintSecPaint);
				canvas.drawPath(drawTriPatch(3, 4, 3), paintSecPaint);
			} else if (level3Step == 3) {
				canvas.drawPath(drawTriPatch(3, 4, 3), paintSecPaint);
			} else if (level3Step == 4) {
				canvas.drawPath(drawTriPatch(3, 4, 4), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 4, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 3, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 2, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 1, 2), paintMainPaint);
			} else if (level3Step == 5) {
				canvas.drawPath(drawTriPatch(4, 4, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 3, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 2, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 1, 2), paintMainPaint);
			} else if (level3Step == 6) {
				canvas.drawPath(drawTriPatch(4, 3, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 2, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 1, 2), paintMainPaint);
			} else if (level3Step == 7) {
				canvas.drawPath(drawTriPatch(4, 2, 2), paintMainPaint);
				canvas.drawPath(drawTriPatch(4, 1, 2), paintMainPaint);
			} else if (level3Step == 8) {
				canvas.drawPath(drawTriPatch(4, 1, 2), paintMainPaint);
			}

		}
	}

	private void drawSpecialLevelDescription() {
		// draw description
		// init paint
		Paint descriptionPaint = new Paint();
		descriptionPaint.setAntiAlias(true);
		float levelTextSize = screenH / 12 * 0.55f;
		descriptionPaint.setTextSize(levelTextSize);
		descriptionPaint.setColor(paintSecColor);

		int numberTop = (int) ((cellH - descriptionPaint.getTextSize()) / 2);
		float numberAscent = descriptionPaint.ascent();

		if (gameLevel == 1) {
			// compute offsets in each cell to center the rendered number
			String message = game.getResources()
					.getString(R.string.level1_des1);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 7 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
			message = game.getResources().getString(R.string.level1_des2);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 8 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
			message = game.getResources().getString(R.string.level1_des3);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 9 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
		}
		if (gameLevel == 2) {
			String message = game.getResources()
					.getString(R.string.level2_des1);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 10 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
		}
		if (gameLevel == 3) {
			String message = game.getResources()
					.getString(R.string.level3_des1);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 9 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
			message = game.getResources().getString(R.string.level3_des2);
			canvas.drawText(message, (int) ((screenW - (int) descriptionPaint
					.measureText(message)) / 2), screenH * 10 / 12
					+ (float) (numberTop - numberAscent), descriptionPaint);
		}
		if (gameLevel == 4) {
			// draw text
			String message = game.getResources().getString(
					R.string.level4_des10);
			if ((int) descriptionPaint.measureText(message) > screenW) {
				message = game.getResources().getString(R.string.level4_des11);
				canvas.drawText(message,
						(int) ((screenW - (int) descriptionPaint
								.measureText(message)) / 2), screenH * 5 / 9
								+ (float) (numberTop - numberAscent),
						descriptionPaint);
			} else {
				canvas.drawText(message,
						(int) ((screenW - (int) descriptionPaint
								.measureText(message)) / 2), screenH * 5 / 9
								+ (float) (numberTop - numberAscent),
						descriptionPaint);
			}
			// draw bitmap
			Bitmap backToMainBitmap;
			Bitmap reStartBitmap;
			Bitmap undoBitmap;
			backToMainBitmap = createBitmap(game.getResources().getDrawable(
					R.drawable.ic_action_back));
			reStartBitmap = createBitmap(game.getResources().getDrawable(
					R.drawable.ic_action_refresh));
			undoBitmap = createBitmap(game.getResources().getDrawable(
					R.drawable.ic_action_undo));
			Rect dst = new Rect();
			int compansantion = (int) (cellW);
			if (cellW > cellH) {
				compansantion = (int) (cellH);
			}
			compansantion = compansantion * 2 / 5;
			float originX = cellW + cellW / 2;
			float originY = cellH * 6 + cellH / 2;
			dst.left = (int) (originX - compansantion);
			dst.right = (int) (originX + compansantion);
			dst.top = (int) (originY - compansantion);
			dst.bottom = (int) (originY + compansantion);
			canvas.drawBitmap(backToMainBitmap, null, dst, descriptionPaint);
			message = game.getResources().getString(R.string.level4_des2);
			canvas.drawText(message, (int) (2 * cellW), screenH * 6 / 9
					+ (float) (numberTop - numberAscent), descriptionPaint);

			originY = cellH * 7 + cellH / 2;
			dst.top = (int) (originY - compansantion);
			dst.bottom = (int) (originY + compansantion);
			canvas.drawBitmap(reStartBitmap, null, dst, descriptionPaint);
			message = game.getResources().getString(R.string.level4_des3);
			canvas.drawText(message, (int) (2 * cellW), screenH * 7 / 9
					+ (float) (numberTop - numberAscent), descriptionPaint);

			originY = cellH * 8 + cellH / 2;
			dst.top = (int) (originY - compansantion);
			dst.bottom = (int) (originY + compansantion);
			canvas.drawBitmap(undoBitmap, null, dst, descriptionPaint);
			message = game.getResources().getString(R.string.level4_des4);
			canvas.drawText(message, (int) (2 * cellW), screenH * 8 / 9
					+ (float) (numberTop - numberAscent), descriptionPaint);
		}
	}

	public Bitmap createBitmap(Drawable drawable) {
		BitmapDrawable bd = (BitmapDrawable) drawable;
		Bitmap bm = bd.getBitmap();
		return bm;
	}

	private void bgDraw() {
		canvas = sfh.lockCanvas();
		// 将屏幕设置为白色
		if (canvas != null) {
			canvas.drawColor(paintMainColor); // 填主色
			// draw the color cells according to colordata
			for (int i = 0; i < cellNumberH; i++) {
				for (int j = 0; j < cellNumberW; j++)

					if (colorData[i][j] == 0) { // 画辅助色方块
						// 如果当前块右边或者下面是同样颜色的，多画一点点，防止有间隙色
						float compansentionH = 0;
						float compansentionW = 0;
						if (j < cellNumberW && i < cellNumberH - 1) { // below
							if (colorData[i][j] == colorData[i + 1][j]) { // below
								compansentionH = cellH / 30;
								canvas.drawRect((j) * cellW, (i) * cellH,
										(j + 1) * cellW, (i + 1) * cellH
												+ compansentionH, paintSecPaint);
							}
						}
						if (i < cellNumberH && j < cellNumberW - 1) { // right
							if (colorData[i][j] == colorData[i][j + 1]) { // right
								compansentionW = cellW / 30;
								canvas.drawRect((j) * cellW, (i) * cellH,
										(j + 1) * cellW + compansentionW,
										(i + 1) * cellH, paintSecPaint);
							}
						}
						canvas.drawRect((j) * cellW, (i) * cellH, (j + 1)
								* cellW, (i + 1) * cellH, paintSecPaint);
					}

			}
			// compute offsets in each cell to center the rendered number

			int numberLeft = (int) ((cellW - paintMainNumberPaint
					.measureText("9")) / 2);
			int numberTop = (int) ((cellH - paintMainNumberPaint.getTextSize()) / 2);
			float numberAscent = paintMainNumberPaint.ascent();

			// draw the number
			for (int i = 0; i < cellNumberH; i++) {
				for (int j = 0; j < cellNumberW; j++)
					if (stepData[i][j] != 0) {
						numberLeft = (int) ((cellW - paintMainNumberPaint
								.measureText("" + stepData[i][j])) / 2);
						if (colorData[i][j] == 1) { // draw main number with sec
													// number paint
							canvas.drawText(
									String.valueOf(stepData[i][j]),
									(float) (j * cellW) + (float) (numberLeft),
									(float) (i * cellH)
											+ (float) (numberTop - numberAscent),
									paintMainNumberPaint);
						} else {
							canvas.drawText(
									String.valueOf(stepData[i][j]),
									(float) (j * cellW) + (float) (numberLeft),
									(float) (i * cellH)
											+ (float) (numberTop - numberAscent),
									paintSecNumberPaint);
						}
					}
			}

			// draw flash
			if (drawFlash) { // 游戏中的动画， 以及无效拖动的动画
				drawFlash();
			}

			drawSpecialLevelCell();
			drawSpecialLevelDescription();

			sfh.unlockCanvasAndPost(canvas);
		}

	}

	private void getCurrentPosition() {
		currentPosition = (int) (currentCxFloat / cellW)
				+ ((int) (currentCyFloat / cellH)) * cellNumberW;
	}

	private void getCurrentPositionInGame() {
		int tempPosition = (int) (currentCxFloat / cellW)
				+ ((int) (currentCyFloat / cellH)) * cellNumberW;
		int array1 = tempPosition / cellNumberW;
		int array2 = tempPosition % cellNumberW;
		float factor1 = (float) 0.1;
		float factor2 = (float) 0.25;

		// 判断当前位置有效
		// 1. 和privousPosition上下左右关系
		// 2. current 都不能有step
		// 2. 当前位置的颜色和privious的颜色不一样
		boolean valid = false;
		// Log.e("YIJIN", "privous and current are " + priviousPosition + "," +
		// currentPosition);
		if (moveValid(tempPosition)) {
			currentPosition = tempPosition;
			valid = true;
		}
		/*
		 * // up if(array1>0) { if( (currentCyFloat - array1*cellH) <
		 * cellH*factor1) { if(moveValid(tempPosition-6)) { currentPosition =
		 * tempPosition-6; valid = true; } } } // down if(array1 <8) {
		 * if((currentCyFloat-array1*cellH)>cellH*(1-factor1)) {
		 * if(moveValid(tempPosition+6)) { currentPosition = tempPosition + 6;
		 * valid = true; } } } // left if(array2>0) {
		 * if((currentCxFloat-cellW*array2) < cellW*factor1) {
		 * if(moveValid(tempPosition-1)) { currentPosition = tempPosition -1;
		 * valid = true; } } } // fight if(array2<5) {
		 * if((currentCxFloat-cellW*array2) >cellW*(1-factor1)) {
		 * if(moveValid(tempPosition+1)) { currentPosition = tempPosition +1;
		 * valid = true; } } }
		 */
		if (valid == false) {
			float xStart = (float) (cellW * array2) + (float) (cellW * factor2);
			float yStart = (float) (cellH * array1) + (float) (cellH * factor2);
			float xEnd = (float) (cellW * array2)
					+ (float) (cellW * (1 - factor2));
			float yEnd = (float) (cellH * array1)
					+ (float) (cellH * (1 - factor2));
			if (currentCxFloat >= xStart && currentCxFloat <= xEnd
					&& currentCyFloat >= yStart && currentCyFloat <= yEnd) {
				currentPosition = tempPosition;
			}
		}
	}

	private boolean currentPositionValid() {
		int array1 = currentPosition / cellNumberW;
		int array2 = currentPosition % cellNumberW;

		if (stepData[array1][array2] > 0) {
			// Log.e("YIJIN", "valid start");
			return true;
		}
		return false;
	}

	private int getColorDate(int position) {
		int array1 = position / cellNumberW;
		int array2 = position % cellNumberW;
		return colorData[array1][array2];
	}

	private int getStepDate(int position) {
		int array1 = position / cellNumberW;
		int array2 = position % cellNumberW;
		return stepData[array1][array2];
	}

	private void setColorDate(int position, int value) {
		int array1 = position / cellNumberW;
		int array2 = position % cellNumberW;
		colorData[array1][array2] = value;
	}

	private void setStepDate(int position, int value) {
		int array1 = position / cellNumberW;
		int array2 = position % cellNumberW;
		stepData[array1][array2] = value;
	}

	public boolean undo() {
		// Log.e("YIJIN", "length is " + colorDataStack.size());
		if (gameSuccessful) {
			return false;
		}
		if (colorDataStack.empty() || stepDataStack.empty()) {
			return false;
		}
		if (gameLevel == 3) {
			level3Step--;
		}
		// Log.e("YIJIN", "length is " + colorDataStack.size());
		colorData = colorDataStack.pop();
		stepData = stepDataStack.pop();
		/*
		 * for(int i =0 ; i<9; i++) { Log.e("YIJIN", " " + stepData[i][0] +
		 * stepData[i][1] + stepData[i][2] + stepData[i][3] + stepData[i][4] +
		 * stepData[i][5] ); }
		 */
		return true;
	}

	private boolean level3CheckValid() {
		if (level3Step < 3) { // only can move to right
			if (currentPosition == priviousPosition + 1) {
				level3Step++;
				return true;
			}
		} else if (level3Step == 3) {
			if (currentPosition == priviousPosition - 6) {
				level3Step++;
				return true;
			}
		} else if (level3Step == 4 || level3Step == 5) {
			if (currentPosition == priviousPosition + 6) {
				level3Step++;
				return true;
			}
		} else if (level3Step >= 6 && level3Step < 9) {
			if (currentPosition == priviousPosition - 1) {
				level3Step++;
				return true;
			}
		}
		return false;
	}

	private boolean moveValid() {
		// level 3 is special
		if (gameLevel == 3) {
			return level3CheckValid();
		}
		// 判断当前位置有效
		// 1. 和privousPosition上下左右关系
		// 2. current 都不能有step
		// 2. 当前位置的颜色和privious的颜色不一样

		// Log.e("YIJIN", "privous and current are " + priviousPosition + "," +
		// currentPosition);
		if ((currentPosition == priviousPosition + 1)
				|| (currentPosition == priviousPosition - 1)
				|| (currentPosition == priviousPosition - 6)
				|| (currentPosition == priviousPosition + 6)) {
			if ((getStepDate(currentPosition) <= 0)
					&& (getColorDate(priviousPosition) != getColorDate(currentPosition))) {
				return true;
			}
		}
		return false;
	}

	private boolean moveValid(int tempPosition) {
		// 判断当前位置有效
		// 1. 和privousPosition上下左右关系
		// 2. current 都不能有step
		// 2. 当前位置的颜色和privious的颜色不一样

		// Log.e("YIJIN", "privous and current are " + priviousPosition + "," +
		// currentPosition);
		if ((tempPosition == priviousPosition + 1)
				|| (tempPosition == priviousPosition - 1)
				|| (tempPosition == priviousPosition - 6)
				|| (tempPosition == priviousPosition + 6)) {
			if ((getStepDate(tempPosition) <= 0)
					&& (getColorDate(priviousPosition) != getColorDate(tempPosition))) {
				return true;
			}
		}
		return false;
	}

	private boolean isGameSuccessful() {
		// step 全为0 并且color全为1
		for (int i = 0; i < cellNumberH; i++) {
			for (int j = 0; j < cellNumberW; j++) {
				if (stepData[i][j] > 0 || colorData[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private void drawSuccessfulAnimation() {

		// left , top, W, H, screenW, screenH
		// W = screenW - 2*left
		// H = screenH - 2* top
		// (left, top + H/2), (left+w/2, top+H*3/4), (left+w, top+H/4),
		// (left+W*7/8,top+H/8),(left+W/2, top+H/2),(left+W/8, top + H*5/16)

		// (left, top + H/2), (left+w/2, top+H*3/4), (left+w, top+H/4),
		// (left+W*7/8,top+H/8),(left+W*11/24, top+H*13/24),(left+W/8, top +
		// H*3/8) draw duihao
		/*
		 * float W = screenW; float H = screenH; float left = 0; float top = 0;
		 * int factor = 32; for (int i = 0; i <= 12; i++) { canvas =
		 * sfh.lockCanvas(); if (canvas != null) { long startTime =
		 * System.currentTimeMillis(); left = screenW * i / factor; top =
		 * screenH * i / factor; W = screenW - 2 * left; H = screenH - 2 * top;
		 * 
		 * canvas.drawColor(paintMainColor); // draw level Paint levelPaint =
		 * new Paint(); levelPaint.setAntiAlias(true); float levelTextSize =
		 * screenH / 10 * 0.55f; levelPaint.setTextSize(levelTextSize);
		 * levelPaint.setColor(paintSecColor);
		 * 
		 * // compute offsets in each cell to center the rendered number int
		 * numberLeft = (int) ((screenW - paintMainNumberPaint
		 * .measureText("level 8-88")) / 2); int mainLevel = (gameLevel - 1) /
		 * 15 + 1; int secLevel = gameLevel - (mainLevel - 1) * 15;
		 * canvas.drawText("LEVEL " + mainLevel + "-" + secLevel, numberLeft,
		 * screenH / 3, levelPaint);
		 * 
		 * // /////////////////// // draw dui hao Path path1 = new Path();
		 * path1.moveTo(left, top + (float) (H) / 2); path1.lineTo(left +
		 * (float) (W) / 2, top + (float) (H) * 3 / 4); path1.lineTo(left + W,
		 * top + (float) (H) / 4); path1.lineTo(left + (float) (W) * 7 / 8, top
		 * + (float) (H) * 1 / 8); path1.lineTo(left + (float) (W) * 11 / 24,
		 * top + (float) (H) 13 / 24); path1.lineTo(left + (float) (W) / 8, top
		 * + (float) (H) * 3 / 8); path1.close();// 封闭 canvas.drawPath(path1,
		 * paintSecPaint); sfh.unlockCanvasAndPost(canvas);
		 * 
		 * long endTime = System.currentTimeMillis(); long useTime = endTime -
		 * startTime; // 固定屏幕刷新的时间为10ms if (useTime < 10) { try {
		 * Thread.sleep(10 - useTime); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } } } }
		 */

		// draw dui hao by bitmap
		float W = screenW;
		float H = screenH;
		float originX = W / 2;
		float originY = H * 0.3f;
		float compansantion = 0;
		int times = 6;
		for (int i = 0; i <= times; i++) {
			canvas = sfh.lockCanvas();
			if (canvas != null) {
				long startTime = System.currentTimeMillis();

				canvas.drawColor(paintMainColor);
				// draw level
				Paint levelPaint = new Paint();
				levelPaint.setAntiAlias(true);
				float levelTextSize = screenH / 10 * 0.65f;
				levelPaint.setTextSize(levelTextSize);
				levelPaint.setColor(paintSecColor);

				// compute offsets in each cell to center the rendered number
				int numberLeft = (int) ((screenW - paintMainNumberPaint
						.measureText("LEVEL 8-88")) / 2);
				int mainLevel = (gameLevel - 1) / 15 + 1;
				int secLevel = gameLevel - (mainLevel - 1) * 15;
				canvas.drawText("LEVEL " + mainLevel + "-" + secLevel,
						numberLeft, screenH / 8, levelPaint);

				// ///////////////////
				// draw dui hao (0.3-1/8) - (0.3+1/8)
				compansantion = (0.5f - (float) (i) / 16) * W;
				// Log.e("YIJIN", "compensation is " + compansantion);
				Bitmap duihaoBitmap; // 400*300
				duihaoBitmap = createBitmap(game.getResources().getDrawable(
						R.drawable.duihao));

				Rect dst = new Rect();
				dst.left = (int) (originX - compansantion);
				dst.right = (int) (originX + compansantion);
				dst.top = (int) (originY - compansantion * 3 / 4);
				dst.bottom = (int) (originY + compansantion * 3 / 4);
				canvas.drawBitmap(duihaoBitmap, null, dst, levelPaint);

				// add xuanyao
				if (i == times) {
					// compute offsets in each cell to center the rendered
					// number
					// valid left: showOffLeft; right: showOffLeft+showOffLength
					// up: screenH/10*8.1; down: screenH/10*8.9
					showOffLength = paintMainNumberPaint.measureText(game
							.getResources().getString(R.string.show_off));
					showOffLeft = (screenW - showOffLength) / 2;
					showOffTop = (screenH / 10 - levelPaint.getTextSize()) / 2;
					showOffAscent = levelPaint.ascent();
					canvas.drawText(
							game.getResources().getString(R.string.show_off),
							showOffLeft, screenH / 10 * 6
									+ (showOffTop - showOffAscent), levelPaint);

					if(game.getCurrentPlayingLevel() % 15 == 0) {
						nextLength = paintMainNumberPaint.measureText(game
								.getResources().getString(R.string.next_back));
						nextLeft = (screenW - nextLength) / 2;
						nextTop = (screenH / 10 - levelPaint.getTextSize()) / 2;
						nextAscent = levelPaint.ascent();
						canvas.drawText(
								game.getResources().getString(R.string.next_back),
								nextLeft,
								screenH / 10 * 8 + (nextTop - nextAscent),
								levelPaint);
					} else {
					nextLength = paintMainNumberPaint.measureText(game
							.getResources().getString(R.string.next_level));
					nextLeft = (screenW - nextLength) / 2;
					nextTop = (screenH / 10 - levelPaint.getTextSize()) / 2;
					nextAscent = levelPaint.ascent();
					canvas.drawText(
							game.getResources().getString(R.string.next_level),
							nextLeft,
							screenH / 10 * 8 + (nextTop - nextAscent),
							levelPaint);
					}
				}
				// add xuanyao

				sfh.unlockCanvasAndPost(canvas);

				long endTime = System.currentTimeMillis();
				long useTime = endTime - startTime;
				// 固定屏幕刷新的时间为15ms
				if (useTime < 15) {
					try {
						Thread.sleep(15 - useTime);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		// over draw duihao by bitmap

		/*
		 * try { Thread.sleep(300); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

	}

	private void setCurrentLevelPlayed() {
		int data = game.getColorValue(paintMainColor);
		int tempData = data;

		int mainLevel = (gameLevel - 1) / 15 + 1;
		int secLevel = gameLevel - (mainLevel - 1) * 15;
		// Log.e("YIJIN", Integer.toHexString(data));
		data = data & (~((0x8000) >>> (16 - secLevel)));
		// Log.e("YIJIN", Integer.toHexString(data));
		game.setColorValue(paintMainColor, data);

	}

	private void nextLevelOrShowOff() {
		// valid left: showOffLeft; right: showOffLeft+showOffLength
		// up: screenH/10*6.1; down: screenH/10*6.9
		if (currentCxFloat >= showOffLeft
				&& currentCxFloat <= (showOffLeft + showOffLength)
				&& currentCyFloat >= screenH / 10 * 5.8
				&& currentCyFloat <= screenH / 10 * 7.2) {
			// show off
			int mainLevel = (gameLevel - 1) / 15 + 1;
			int secLevel = gameLevel - (mainLevel - 1) * 15;
			Intent intent = new Intent(Intent.ACTION_SEND);
			intent.setType("text/plain");
			intent.putExtra(Intent.EXTRA_SUBJECT, "share");
			intent.putExtra(
					Intent.EXTRA_TEXT,
					game.getResources().getString(R.string.share_1)
							+ mainLevel
							+ "-"
							+ secLevel
							+ " "
							+ game.getResources().getString(R.string.share_2)
							+ "\n http://shouji.baidu.com/game/item?docid=6571189");
			getContext().startActivity(Intent.createChooser(intent, "Fly Cow"));

			game.finish();
		} else if (currentCxFloat >= nextLeft
				&& currentCxFloat <= (nextLeft + nextLength)
				&& currentCyFloat >= screenH / 10 * 7.8
				&& currentCyFloat <= screenH / 10 * 9.2) {
			// next level
			game.handler.sendMessage(Message.obtain(game.handler, 0));
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			// 按下
			if (event.getX() > 0 && event.getX() < screenW && event.getY() > 0
					&& event.getY() < screenH) {
				currentCxFloat = (int) event.getX();
				currentCyFloat = (int) event.getY();
				priviousCxFloat = currentCxFloat;
				priviousCyFloat = currentCyFloat;

				if (!gameSuccessful) {

					getCurrentPosition();
					if (currentPositionValid()) {
						priviousPosition = currentPosition;
						gameValid = true;
						drawFlash = true;
						gameSuccessful = false;
						if (getColorDate(priviousPosition) == 1) { // start with
																	// the
																	// main cell
							flashWithMainPaint = true;
						} else {
							flashWithMainPaint = false;
						}
					}
				}
			}
			// Log.w("YIJIN", "ACTION_DOWN wiht cx:cy " + currentCxFloat + ":" +
			// currentCyFloat);
			break;
		case MotionEvent.ACTION_MOVE:
			// 移动
			if (event.getX() > 0 && event.getX() < screenW && event.getY() > 0
					&& event.getY() < screenH) {
				currentCxFloat = (int) event.getX();
				currentCyFloat = (int) event.getY();
				// Log.w("YIJIN", "ACTION_MOVE wiht cx1:cy1 " + currentCxFloat +
				// ":" + currentCyFloat);
			}
			// Log.w("YIJIN", "ACTION_MOVE wiht cx:cy " + currentCxFloat + ":" +
			// currentCyFloat);
			break;
		case MotionEvent.ACTION_UP:
			// 抬起
			if (!gameSuccessful) {
				if (isGameSuccessful()) {
					if (th != null) {
						th.exit();
						th = null;
					}
					gameSuccessful = true;
					drawSuccessfulAnimation();
					// game.handler.sendMessage(Message.obtain(game.handler,
					// 0));
					// FIXME: set the current level is played
					setCurrentLevelPlayed();
				}
			} else {
				nextLevelOrShowOff();
			}
			gameValid = false;
			drawFlash = false;
			break;
		}

		/*
		 * 备注1：次处一定要将return super.onTouchEvent(event)修改为return true，原因是：
		 * 1）父类的onTouchEvent(event)方法可能没有做任何处理，但是返回了false。
		 * 2)一旦返回false，在该方法中再也不会收到MotionEvent
		 * .ACTION_MOVE及MotionEvent.ACTION_UP事件。
		 */
		// return super.onTouchEvent(event);
		return true;
	}

	class MysurfaceviewThread extends Thread {
		public boolean done = false;

		public MysurfaceviewThread() {
			super();
			this.done = false;
		}

		public void exit() {
			// 将done设置为true 使线程中的while循环结束。
			done = true;
			try {
				join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		@Override
		public void run() {
			while (!done) {
				try {
					long startTime = System.currentTimeMillis();
					if (gameValid) {
						gameContinue();
					}
					bgDraw();
					long endTime = System.currentTimeMillis();
					long useTime = endTime - startTime;
					// 固定屏幕刷新的时间为30ms
					if (useTime < 30) {
						Thread.sleep(30 - useTime);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		/*
		 * 备注2：切记，在自定SurfaceView中定义的myDraw方法，自定义View（继承自View的子类）中的onDraw方法
		 * 完全是两码事： 1）自定义View（继承自View的子类）中的onDraw方法是重写父类的onDraw方法，
		 * 在调用postInvalidate后会自动回调该onDraw()方法。
		 * 2）此处的myDraw方法需要手动调用，所以此处故意将方法命名为myDraw，突出为该方法是自己写的，非重写父类的方法 。
		 */
		// 重写onDraw方法实现绘图操作
		protected void gameContinue() {

			getCurrentPositionInGame();
			if (currentPosition != priviousPosition) {
				// Log.e("YIJIN",
				// "current posistion is not equal the privious position");
				if (moveValid()) {
					// Log.e("YIJIN", "move valid");
					// store the data to stack
					int[][] tempColorData = null;
					tempColorData = new int[cellNumberH][cellNumberW];
					for (int i = 0; i < cellNumberH; i++) {
						for (int j = 0; j < cellNumberW; j++) {
							tempColorData[i][j] = colorData[i][j];
						}
					}
					int[][] tempStepData = null;
					tempStepData = new int[cellNumberH][cellNumberW];
					for (int i = 0; i < cellNumberH; i++) {
						for (int j = 0; j < cellNumberW; j++) {
							tempStepData[i][j] = stepData[i][j];
						}
					}
					colorDataStack.push(tempColorData);
					stepDataStack.push(tempStepData);

					// change the data
					setStepDate(currentPosition,
							getStepDate(priviousPosition) - 1);
					setStepDate(priviousPosition, 0);
					setColorDate(currentPosition,
							getColorDate(priviousPosition));

					//
					priviousPosition = currentPosition;
				} else {
					// gameValid = false;
				}
				if (getStepDate(priviousPosition) <= 0) {
					gameValid = false;
				}
			}
		}

	}
}
