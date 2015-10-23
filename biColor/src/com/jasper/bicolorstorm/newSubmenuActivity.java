package com.jasper.bicolorstorm;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * Created by xqin1 on 2014/5/20.
 */
public class newSubmenuActivity extends Activity {
	int color;
	FrameButton[] button;
	RelativeLayout layout;
	int screen_height;
	int screen_width;
	public static String refFilename = "jasperBiColor";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		// ����ȫ��
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				 WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.new_activity_sub_menu);

		layout = (RelativeLayout) findViewById(R.id.submenu_layout);

		Intent intent = getIntent();
		String value = intent.getStringExtra("color");
		color = Integer.parseInt(value);
		layout.setBackgroundColor(color);

		button = new FrameButton[15];

		DisplayMetrics metric = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metric);
		screen_width = metric.widthPixels; // 屏幕宽度（像素）
		screen_height = metric.heightPixels; // 屏幕高度（像素）
	}

	private void startLevel(int level) {
		Intent i = new Intent(this, Game.class);
		setCurrentPlayingLevel(level);
		startActivity(i);
		this.finish();
	}

	@Override
	public void onResume() {
		super.onResume();

		int i;
		SharedPreferences share_data = getSharedPreferences(refFilename, 0);
		int data = share_data.getInt(Integer.toString(color), (~0x0));

		View.OnClickListener submenuOnClickListener = new View.OnClickListener() {
			public void onClick(View view) {
				FrameButton tmp_button = (FrameButton) findViewById(view
						.getId());
				// tmp_button.setBoarderColor(Color.rgb(0,0,0));
				// tmp_button.setBorderWidth(8);
				// tmp_button.invalidate();
				// FIXME: start the current level
				int level = 0;
				int mainLevel = 0;
				int minLevel = tmp_button.getLevel();

				for (int i = 1; i <= 12; i++) {
					if (color == getLevelColor(i)) {
						mainLevel = i;
					}
				}
				level = (mainLevel - 1) * 15 + minLevel;
				setCurrentPlayingLevel((mainLevel - 1) * 15 + minLevel);
				startLevel(level);
			}
		};
		if (data != (~0x0)) {
			button[0] = (FrameButton) findViewById(R.id.sub_button1);
			button[1] = (FrameButton) findViewById(R.id.sub_button2);
			button[2] = (FrameButton) findViewById(R.id.sub_button3);
			button[3] = (FrameButton) findViewById(R.id.sub_button4);
			button[4] = (FrameButton) findViewById(R.id.sub_button5);
			button[5] = (FrameButton) findViewById(R.id.sub_button6);
			button[6] = (FrameButton) findViewById(R.id.sub_button7);
			button[7] = (FrameButton) findViewById(R.id.sub_button8);
			button[8] = (FrameButton) findViewById(R.id.sub_button9);
			button[9] = (FrameButton) findViewById(R.id.sub_button10);
			button[10] = (FrameButton) findViewById(R.id.sub_button11);
			button[11] = (FrameButton) findViewById(R.id.sub_button12);
			button[12] = (FrameButton) findViewById(R.id.sub_button13);
			button[13] = (FrameButton) findViewById(R.id.sub_button14);
			button[14] = (FrameButton) findViewById(R.id.sub_button15);

			int width = screen_width / 5;
			int height = screen_height / 7;
			//Log.v("xiaokang", "width: " + width + " height: " + height);

			for (i = 0; i < 15; i++) {
				if (((data >>> i) & (0x1)) == 0x1) {
					button[i].setBackgroundColor(getSecColor());
					button[i].setTextColor(color);
					button[i].setLevelColor(color);
				} else {
					button[i].setBackgroundColor(color);
					button[i].setTextColor(getSecColor());
					button[i].setLevelColor(getSecColor());
				}
				button[i].setOnClickListener(submenuOnClickListener);
				button[i].setTextSize((float) (height * 0.3));
				// button[i].setTextScaleX((float)0.8);
				// button[i].setText(Integer.toString(i+1));
				button[i].setLevel(i + 1);
				button[i].setHeight(height);
				button[i].setWidth(width);
				button[i].invalidate();
			}
		} else {
			finish();
		}

	}

	public int getLevelColor(int i) { // i is 1 to 12
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		int level = share.getInt(Integer.toString(i), Color.rgb(255, 255, 255));
		return level;
	}

	public void setLevelColor(int i, int color) {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		share.edit().putInt(Integer.toString(i), color).commit();
	}

	public int getColorValue(int color) { // i is 0 to 11
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		int colorValue = share.getInt(Integer.toString(color), 1);
		return colorValue;
	}

	public void setColorValue(int color, int colorValue) {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		share.edit().putInt(Integer.toString(color), colorValue).commit();
	}

	public int getCurrentPlayingLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("currentLevel", 1);
		return level;
	}

	public void setCurrentPlayingLevel(int currentLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("currentLevel", currentLevel).commit();
	}

	public int getplayedLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("playedLevel", 1);
		return level;
	}

	public void setplayedLevel(int playedLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("playedLevel", playedLevel).commit();
	}

	public int getMaxLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("maxLevel", 1);
		return level;
	}

	public void setMaxLevel(int maxLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("maxLevel", maxLevel).commit();
	}

	public int getSecColor() {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		int level = share.getInt("secColor", 1);
		return level;
	}

}
