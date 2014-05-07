package com.spann.phoenix.app;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by Spann on 5/6/14.
 */
public class Ship extends View {

    public Ship(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        Rect rectangle = new Rect();
        rectangle.set(0,0,canvas.getWidth(),canvas.getHeight()/2);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawRect(rectangle,paint);
    }

}
