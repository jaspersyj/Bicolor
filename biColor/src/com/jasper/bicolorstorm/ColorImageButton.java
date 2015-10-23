package com.jasper.bicolorstorm;

import android.R.integer;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by xqin1 on 2014/5/18.
 */
public class ColorImageButton extends ImageButton {
    private int color; // backgroud color
    private int remaininglevel;
    private int paintColor;
    //http://www.cnblogs.com/zchajax/archive/2011/05/02/2034453.html

    public ColorImageButton(Context context) {
        this(context, null);
    }

    public ColorImageButton(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.imageButtonStyle);
    }

    public ColorImageButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFocusable(true);
    }



    @Override
    public void setBackgroundColor(int color) {
        super.setBackgroundColor(color);
        this.color=color;
    }
    public int getBackgroundColor() {
        return color;
    } 

    public void setPaintColor(int color) {
        this.paintColor= color;
    }
    public int getPaintColor() {
    	return this.paintColor;
    }
    
    public void setRemainingLevel(int level) {
        this.remaininglevel = level;
    }
    public int getRemainingLevel() {
    	return this.remaininglevel;
    }
    
    
    private Bitmap createBitmap(Drawable drawable) {
		BitmapDrawable bd = (BitmapDrawable) drawable;
		Bitmap bm = bd.getBitmap();
		return bm;
	}
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        //paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(paintColor);
        int width = this.getWidth();
        int height = this.getHeight();
        
        float cellTextSize = height * 0.07f;
		paint.setTextSize(cellTextSize);
        
		if (remaininglevel == 0) { // draw dui hao
			Bitmap duihaoBitmap; // 500*375
			duihaoBitmap = createBitmap(this.getContext().getResources().getDrawable(
					R.drawable.duihao));
			
			float compansantion = width*0.35f;
			float originX = width/2;
			float originY = height/2;
			Rect dst = new Rect();
			dst.left = (int) (originX - compansantion);
			dst.right = (int) (originX + compansantion);
			dst.top = (int) (originY - compansantion*3/4);
			dst.bottom = (int) (originY + compansantion*3/4);
			canvas.drawBitmap(duihaoBitmap, null, dst, paint);
			
		} else if (remaininglevel == 16) { // draw lock
			Bitmap duihaoBitmap; // 256*256
			duihaoBitmap = createBitmap(this.getContext().getResources().getDrawable(
					R.drawable.lock));
			
			float compansantion = width*0.4f;
			float originX = width/2;
			float originY = height/2;
			Rect dst = new Rect();
			dst.left = (int) (originX - compansantion);
			dst.right = (int) (originX + compansantion);
			dst.top = (int) (originY - compansantion);
			dst.bottom = (int) (originY + compansantion);
			canvas.drawBitmap(duihaoBitmap, null, dst, paint);
		} else {
		
        int numberLeft = (int) ((width - paint.measureText("99")) / 2);

		while (numberLeft <width/5) {
			cellTextSize = cellTextSize * 0.7f;
			paint.setTextSize(cellTextSize);
			numberLeft = (int) ((width - paint.measureText("99")) / 2);
		}
		numberLeft = (int) ((width - paint.measureText(Integer.toString(remaininglevel))) / 2);
		int numberTop = (int) ((height - paint.getTextSize()) / 2);
		float numberAscent = paint.ascent();
		
		canvas.drawText(
				Integer.toString(remaininglevel),
				(float) (numberLeft),(float) (numberTop - numberAscent),
				paint);
		}
    }



}
