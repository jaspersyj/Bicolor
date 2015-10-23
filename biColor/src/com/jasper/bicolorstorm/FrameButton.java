package com.jasper.bicolorstorm;

import android.R.integer;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

/**
 * Created by xqin1 on 2014/5/24.
 */
public class FrameButton extends Button {

    private int boardercolor;
    private int borderwidth;
    private int level;
    private int levelColor;

    public FrameButton(Context context) {
        super(context);
    }

    public FrameButton(Context context, AttributeSet attrs,int defStyle) {
        super(context, attrs, defStyle);
    }

    public FrameButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //设置颜色
    public void setBoarderColor(int color) {
        boardercolor = color;
    }

    //设置边框宽度
    public void setBorderWidth(int width) {
        borderwidth = width;
    }
    
    public void setLevel(int levelValue) {
    	level = levelValue;
    }
    
    public int getLevel() {
    	return this.level;
    }
    
    public void setLevelColor(int color) {
    	this.levelColor = color;
    }
    
    public int getLevelColor() {
    	return this.levelColor;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 画边�?
        //Rect rec = canvas.getClipBounds();
        //rec.bottom--;
        //rec.right--;
        Paint paint = new Paint();
        //设置边框颜色
        
        paint.setColor(levelColor);
        //paint.setStyle(Paint.Style.STROKE);
        //设置边框宽度
        paint.setStrokeWidth(8);
        //canvas.drawRect(rec, paint);
        
        int width = this.getWidth();
        int height = this.getHeight();
        //Log.e("YIJIN", "width and height is " + width + height);
        
        float cellTextSize = height * 1f;
		paint.setTextSize(cellTextSize);
		
        int numberLeft = (int) ((width - paint.measureText("99")) / 2);
        //Log.e("YIJIN", "numberLeft is " + numberLeft);
		while (numberLeft < width/5) {
			//.e("YIJIN", "numberLeft is " + numberLeft);
			cellTextSize = cellTextSize * 0.8f;
			paint.setTextSize(cellTextSize);
			numberLeft = (int) ((width - paint.measureText("99")) / 2);
		}
		numberLeft = (int) ((width - paint.measureText(Integer.toString(level))) / 2);
		int numberTop = (int) ((height - paint.getTextSize()) / 2);
		float numberAscent = paint.ascent();
		
		canvas.drawText(
				Integer.toString(level),
				(float) (numberLeft),(float) (numberTop - numberAscent),
				paint);
    }
}
