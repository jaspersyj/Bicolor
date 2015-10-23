package com.jasper.bicolorstorm;

import android.R.color;
import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.IntToString;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private View view1, view2, view3;
	private ViewPager viewPager;
	private List<View> viewList;

	private ColorImageButton button1;
	private ColorImageButton button2;
	private ColorImageButton button3;
	private ColorImageButton button4;
	private ColorImageButton button5;
	private ColorImageButton button6;
	private ColorImageButton button7;
	private ColorImageButton button8;
	private ColorImageButton button9;
	private ColorImageButton button10;
	private ColorImageButton button11;
	private ColorImageButton button12;
	private static int currentPostion = 0;
	
	private ImageView guiderButton;

	// public static boolean firstRef = true;
	public static String refFilename = "jasperBiColor";
	/*
	 * public static int[] colorArray = { Color.rgb(254, 67, 101),
	 * Color.rgb(252, 157, 154), Color.rgb(249, 205, 173), Color.rgb(200, 200,
	 * 169), Color.rgb(130, 57, 53), Color.rgb(137, 190, 178), Color.rgb(201,
	 * 186, 131), Color.rgb(222, 211, 140), Color.rgb(3, 35, 14), Color.rgb(64,
	 * 116, 52), Color.rgb(101, 147, 74), Color.rgb(160, 191, 124) };
	 */
	public static int[] colorArray = { Color.rgb(252, 29, 67),
			Color.rgb(115, 189, 155), Color.rgb(85, 160, 144),
			Color.rgb(28, 126, 126), Color.rgb(252, 181, 81),
			Color.rgb(252, 152, 81), Color.rgb(252, 118, 81),
			Color.rgb(252, 81, 81), Color.rgb(35, 174, 216),
			Color.rgb(16, 126, 199), Color.rgb(2, 92, 138),
			Color.rgb(0, 61, 94) };
	public static int secColor = Color.rgb(250, 222, 192); // FADEC0
	private Intent intent;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		// get screen width and height
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int width = dm.widthPixels;// 宽度
		int height = dm.heightPixels;// 高度
		// Log.e("YIJIN", width + "," + height);

		// 设置全屏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		// this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_view_pager_demo);

	}

	@Override
	protected void onResume() {
		super.onResume();
		// FIXEME: need to remove the following line, used for
		// setInitStatus(false);

		if (!getInitStatus()) {
			setLevelColors();
			setInitLevelStatus();
			setInitStatus(true);
			setLevelStatus();
			setMaxLevel(180);
		}

		initView();

		// Log.e("YIJIN", "maxlevel is " + constantData.colorDataList.size());
	}

	@SuppressWarnings("deprecation")
	private void initView() {
		
		guiderButton = (ImageView) findViewById(R.id.guider);
		Log.e("YIJIN", "check if first use");
		if(getFistUse()) {
			Log.e("YIJIN", "first use");
			guiderButton.setVisibility(View.VISIBLE);
			guiderButton.setAlpha(200);
			setFistUse(false);
		}
		
		viewPager = (ViewPager) findViewById(R.id.viewpager);

		
		view1 = findViewById(R.layout.layout1);
		view2 = findViewById(R.layout.layout2);
		view3 = findViewById(R.layout.layout3);

		LayoutInflater lf = getLayoutInflater().from(this);
		view1 = lf.inflate(R.layout.layout1, null);
		view2 = lf.inflate(R.layout.layout2, null);
		view3 = lf.inflate(R.layout.layout3, null);

		viewList = new ArrayList<View>();
		viewList.add(view1);
		viewList.add(view2);
		viewList.add(view3);
		
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				currentPostion = viewPager.getCurrentItem();
				//Log.e("YIJIN", "currentposition at instaniate " + currentPostion);
				//if(guiderButton!=null) {
				//	guiderButton.setVisibility(View.GONE);
				//}
				if(guiderButton!=null) {
					Log.e("YIJIN", "onPageSelected");
					guiderButton.setVisibility(View.GONE);
				}
				
			}
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
			}
		});

		PagerAdapter pagerAdapter = new PagerAdapter() {

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}

			@Override
			public int getCount() {
				return viewList.size();
			}

			@Override
			public void destroyItem(ViewGroup container, int position,
					Object object) {
				container.removeView(viewList.get(position));
			}

			@Override
			public int getItemPosition(Object object) {
				return super.getItemPosition(object);
			}

			private int getRemaingLevelofColor(int colorValue) {
				int data = colorValue;
				// check big level
				if (((data >>> 15) & (0x1)) == 0x1) {
					return 16;
				}

				int level = 0;
				for (int i = 0; i < 15; i++) {
					if (((data >>> i) & (0x1)) == 0x1) {
						level++;
					}
				}
				return level;
			}

			private void buttonLevelStatus() {
				int[] data = new int[13];

				for (int i = 1; i <= 12; i++) {
					data[i] = getColorValue(getLevelColor(i));
				}

				// 1 page
				for (int i = 1; i <= 3; i++) {
					if (data[i] == 0) {
						data[i + 1] = data[i + 1] & (0x7FFF);
					}
				}

				// 2 page
				for (int i = 5; i <= 7; i++) {
					if (data[i] == 0) {
						data[i + 1] = data[i + 1] & (0x7FFF);
					}
				}
				// 3 page
				for (int i = 9; i <= 11; i++) {
					if (data[i] == 0) {
						data[i + 1] = data[i + 1] & (0x7FFF);
					}
				}

				for (int i = 1; i <= 12; i++) {
					setColorValue(getColorValue(i), data[i]);
				}
			}

			@Override
			public Object instantiateItem(ViewGroup container, int position) {
				
				
				container.addView(viewList.get(position));
				//currentPostion = position;
				
				
				OnClickListener buttonOnClickListener = new OnClickListener() {
					public void onClick(View view) {

						// the real code
						// Intent intent = new Intent(ViewPagerDemo.this,
						// SubmenuActivity.class);
						// intent.putExtra("color",Integer.toString(tmp_button.getBackgroundColor()));
						// startActivity(intent);
						ColorImageButton tmp_button = (ColorImageButton) findViewById(view
								.getId());
						
						if (tmp_button.getRemainingLevel() != 16) {
							Intent intent = new Intent(MainActivity.this,
									newSubmenuActivity.class);

							intent.putExtra("color", Integer
									.toString(tmp_button.getBackgroundColor()));
							startActivity(intent);
						}
					}
				};

				// int data = share_data.getInt(Integer.toString(color),
				// (~0x0));
				buttonLevelStatus();
				int data = 0;

				switch (position) {
				case 0:
					button1 = (ColorImageButton) findViewById(R.id.button1);
					button1.setBackgroundColor(colorArray[0]);
					button1.setPaintColor(secColor);
					button1.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(1))));
					button2 = (ColorImageButton) findViewById(R.id.button2);
					button2.setBackgroundColor(colorArray[1]);
					button2.setPaintColor(secColor);
					button2.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(2))));
					button3 = (ColorImageButton) findViewById(R.id.button3);
					button3.setBackgroundColor(colorArray[2]);
					button3.setPaintColor(secColor);
					button3.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(3))));
					button4 = (ColorImageButton) findViewById(R.id.button4);
					button4.setBackgroundColor(colorArray[3]);
					button4.setPaintColor(secColor);
					button4.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(4))));
					button1.setOnClickListener(buttonOnClickListener);
					button2.setOnClickListener(buttonOnClickListener);
					button3.setOnClickListener(buttonOnClickListener);
					button4.setOnClickListener(buttonOnClickListener);
					break;
				case 1:
					button5 = (ColorImageButton) findViewById(R.id.button5);
					button5.setBackgroundColor(colorArray[4]);
					button5.setPaintColor(secColor);
					button5.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(5))));
					button6 = (ColorImageButton) findViewById(R.id.button6);
					button6.setBackgroundColor(colorArray[5]);
					button6.setPaintColor(secColor);
					button6.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(6))));
					button7 = (ColorImageButton) findViewById(R.id.button7);
					button7.setBackgroundColor(colorArray[6]);
					button7.setPaintColor(secColor);
					button7.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(7))));
					button8 = (ColorImageButton) findViewById(R.id.button8);
					button8.setBackgroundColor(colorArray[7]);
					button8.setPaintColor(secColor);
					button8.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(8))));
					button5.setOnClickListener(buttonOnClickListener);
					button6.setOnClickListener(buttonOnClickListener);
					button7.setOnClickListener(buttonOnClickListener);
					button8.setOnClickListener(buttonOnClickListener);
					break;
				case 2:
					button9 = (ColorImageButton) findViewById(R.id.button9);
					button9.setBackgroundColor(colorArray[8]);
					button9.setPaintColor(secColor);
					button9.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(9))));
					button10 = (ColorImageButton) findViewById(R.id.button10);
					button10.setBackgroundColor(colorArray[9]);
					button10.setPaintColor(secColor);
					button10.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(10))));
					button11 = (ColorImageButton) findViewById(R.id.button11);
					button11.setBackgroundColor(colorArray[10]);
					button11.setPaintColor(secColor);
					button11.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(11))));
					button12 = (ColorImageButton) findViewById(R.id.button12);
					button12.setBackgroundColor(colorArray[11]);
					button12.setPaintColor(secColor);
					button12.setRemainingLevel(getRemaingLevelofColor(getColorValue(getLevelColor(12))));
					button9.setOnClickListener(buttonOnClickListener);
					button10.setOnClickListener(buttonOnClickListener);
					button11.setOnClickListener(buttonOnClickListener);
					button12.setOnClickListener(buttonOnClickListener);
					break;
				default:
					;
				}
				return viewList.get(position);
			}

		};
		//Log.e("YIJIN", "currentposition before setCurrentItem " + currentPostion);
		
		viewPager.setAdapter(pagerAdapter);
		viewPager.setCurrentItem(currentPostion);
		
	}

	private void startLevel(int level) {
		Intent i = new Intent(this, Game.class);
		setCurrentPlayingLevel(level);
		startActivity(i);
		// this.finish();
	}

	private boolean getInitStatus() {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		boolean initStatus = share.getBoolean("InitStatus", false);
		return initStatus;
	}

	private void setInitStatus(boolean initStatus) {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		share.edit().putBoolean("InitStatus", initStatus).commit();
	}

	private void setLevelColors() {
		SharedPreferences.Editor share_data = getSharedPreferences(refFilename,
				0).edit();
		int i;
		for (i = 0; i < 12; i++) {
			// store the level color
			share_data.putInt(Integer.toString(i + 1), colorArray[i]);
		}
		share_data.putInt("secColor", secColor);
		share_data.commit();

	}

	private void setInitLevelStatus() {
		SharedPreferences.Editor share_data = getSharedPreferences(refFilename,
				0).edit();
		int i, r;
		for (i = 0; i < 12; i++) {
			r = i % 4;
			// 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
			// BL L15 ....................................L2 L1
			// L15 :0 pass the level 15, 1: not pass the level
			// BL: 0 the big level is unlock, 1 the big level is lock
			if (r == 0) {
				share_data.putInt(Integer.toString(colorArray[i]), 0x7FFF);
			} else {
				share_data.putInt(Integer.toString(colorArray[i]), (0xFFFF));
			}
		}
		share_data.commit();
	}

	private int getLevelColor(int i) { // i is 1 to 12
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		int level = share.getInt(Integer.toString(i), Color.rgb(255, 255, 255));
		return level;
	}

	private void setLevelColor(int i, int color) {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		share.edit().putInt(Integer.toString(i), color).commit();
	}

	private int getColorValue(int color) { // i is 0 to 11
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		int colorValue = share.getInt(Integer.toString(color), 1);
		return colorValue;
	}

	private void setColorValue(int color, int colorValue) {
		SharedPreferences share = getSharedPreferences(refFilename, 0);
		share.edit().putInt(Integer.toString(color), colorValue).commit();
	}

	private int getCurrentPlayingLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("currentLevel", 1);
		return level;
	}

	private void setCurrentPlayingLevel(int currentLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("currentLevel", currentLevel).commit();
	}

	private int getplayedLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("playedLevel", 1);
		return level;
	}

	private void setplayedLevel(int playedLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("playedLevel", playedLevel).commit();
	}

	private int getMaxLevel() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int level = share.getInt("maxLevel", 1);
		return level;
	}

	private void setMaxLevel(int maxLevel) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt("maxLevel", maxLevel).commit();
	}

	private void setLevelStatus() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		for (int i = 1; i < 13; i++) {
			share.edit().putInt(i + "Status", 0).commit();
		}
	}

	private int getLevelStatus(int level) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		int status = share.getInt(level + "Status", 0);
		return status;
	}

	private void setLevelStatus(int level) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putInt(level + "Status", 1).commit();
	}
	
	private boolean getFistUse() {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		boolean status = share.getBoolean("FirstUse", true);
		return status;
	}

	private void setFistUse(boolean firstUse) {
		SharedPreferences share = getSharedPreferences("jasperBiColor", 0);
		share.edit().putBoolean("FirstUse", false).commit();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			this.finish();
		}
		return super.onKeyDown(keyCode, event);
	}

}
