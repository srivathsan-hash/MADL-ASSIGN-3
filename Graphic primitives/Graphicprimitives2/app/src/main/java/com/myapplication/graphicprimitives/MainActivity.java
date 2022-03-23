package com.myapplication.graphicprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new canvas(this));

    }
    private class canvas extends View {
        Paint paint;
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(Color.BLACK);
            paint.setColor(Color.RED);
            paint.setTextSize(50);
            canvas.drawText("CIRCLE",30,40,paint);
            canvas.drawCircle(100,150,50,paint);
            paint.setTextSize(50);
            canvas.drawText("RECTANGLE",30,300,paint);
            canvas.drawRect(50,330,300,480,paint);
            canvas.drawText("SQUARE",250,40,paint);
            canvas.drawRect(300,80,400,180,paint);
            canvas.drawText("LINE",30,600,paint);
            paint.setStrokeWidth(5);
            canvas.drawLine(300,550,300,700,paint);



        }

        public canvas(Context context) {
            super(context);
            paint=new Paint();


        }
    }

}