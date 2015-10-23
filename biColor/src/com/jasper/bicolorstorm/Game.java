package com.jasper.bicolorstorm;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Game extends Activity {
	private GameView view;
	public int gameLevel = 0;
	public MyHandler handler;
	public final String refFilename = "jasperBiColor";
	public  ConstantData constantDataInfo;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 设置全屏
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		 this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		 WindowManager.LayoutParams.FLAG_FULLSCREEN);

		// PORTRAIT screen layout
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		// set game oritention
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int width = dm.widthPixels;// 宽度
		int height = dm.heightPixels;// 高度

		handler = new MyHandler(this);
		constantDataInfo = new ConstantData();

		gameLevel = getCurrentPlayingLevel();
		refresh();
	}

	public void refresh() {
		gameLevel = getCurrentPlayingLevel();
		Log.e("YIJIN", "currentLevel is " + gameLevel);
		CharSequence message = "current level:" + gameLevel + ", played level:"
				+ getplayedLevel() + ", Max level:" + getMaxLevel();
		// Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		view = new GameView(this);
		setLayouts();
	}

	private void setLayouts() {
		LinearLayout mainLayout = new LinearLayout(this);
		mainLayout.setOrientation(LinearLayout.VERTICAL);

		// Remove the lines below, if you don't want ads

		View ad;
		ad = createAdMob();
		mainLayout.addView(ad);

		// Remove the lines above, if you don't want ads

		mainLayout.addView(view);
		setContentView(mainLayout);
	}

	// Remove the method below, if you don't want ads
	/** Google AdMob */
	private AdView createAdMob() {
		AdView adView = new AdView(this);
		//adView.setAdUnitId("a1537b51660d18d");
		adView.setAdUnitId("ca-app-pub-6945964728389343/8392931710");
		//adView.setAdUnitId("694596472838934");
		adView.setAdSize(AdSize.BANNER);

		adView.loadAd(new AdRequest.Builder().build());
		return adView;
	}

	private void gameOver() { // complete all the levels
		CharSequence message = "You have complete all the " + getMaxLevel()
				+ " levels!";
		Toast.makeText(this, message, Toast.LENGTH_LONG).show();
		refresh();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle presses on the action bar items
		switch (item.getItemId()) {
		case R.id.action_backmain: // back to main layout
			Intent i = new Intent(this, newSubmenuActivity.class);
			i.putExtra("color",
					Integer.toString(getLevelColor((gameLevel - 1) / 15 + 1)));
			startActivity(i);
			finish();
			return true;
		case R.id.action_refresh: // restart the current level
			refresh();
			return true;
		case R.id.action_undo: // undo the operations
			boolean canUndo = view.undo();
			if (!canUndo) {
				Toast.makeText(this, "No undos yet", Toast.LENGTH_SHORT).show();
			}
			return true;
		/*case R.id.action_help:
			Toast.makeText(this,
					"move to level " + (getCurrentPlayingLevel() + 1),
					Toast.LENGTH_SHORT).show();
			int color = getLevelColor((gameLevel-1)/15+1);
			int data = getColorValue(color); 
			int tempData = data;
			
			int mainLevel = (gameLevel - 1) / 15 + 1;
			int secLevel = gameLevel - (mainLevel - 1) * 15;
			//Log.e("YIJIN", Integer.toHexString(data));
			data = data &(~((0x8000) >>> (16-secLevel)));
			//Log.e("YIJIN", Integer.toHexString(data));
			setColorValue(color, data);
			nextLevelDialog();
			return true;*/
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	/**
	 * The current level is successful when a message with code 0 is received.
	 */
	static class MyHandler extends Handler {
		private Game game;

		public MyHandler(Game game) {
			this.game = game;
		}

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
				game.nextLevelDialog();
				break;
			case 1:
				Toast.makeText(game, msg.arg1, Toast.LENGTH_SHORT).show();
			}
		}
	}

	protected void nextLevelDialog() {
		// FIXME: current level is set in gameview for played level
		if (getCurrentPlayingLevel() % 15 == 0) {
			// need to back to the main view1
			//this.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
			/*Intent i = new Intent(this, newSubmenuActivity.class);
			i.putExtra("color",
					Integer.toString(getLevelColor((gameLevel - 1) / 15 + 1)));
			startActivity(i);
			finish();*/
			finish();
		} else {
			int level = getCurrentPlayingLevel() + 1;
			if (level <= getMaxLevel()) {
				// FIXME this shoule be done in gameview before the send message
				// if(level>getplayedLevel()) {
				// setplayedLevel(level);
				// }
				// FIXME
				setCurrentPlayingLevel(level);
				refresh();
			} else {
				gameOver();
			}
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
