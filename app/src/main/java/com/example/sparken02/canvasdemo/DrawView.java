package com.example.sparken02.canvasdemo;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;

import java.util.HashSet;

import static android.content.ContentValues.TAG;

public class DrawView extends View {
    Paint paint = new Paint();


//    private static class CircleArea {
//        int radius;
//        int centerX;
//        int centerY;
//
//        CircleArea(int centerX, int centerY, int radius) {
//            this.radius = radius;
//            this.centerX = centerX;
//            this.centerY = centerY;
//        }
//
//        @Override
//        public String toString() {
//            return "Circle[" + centerX + ", " + centerY + ", " + radius + "]";
//        }
//    }
//    private final static int RADIUS_LIMIT = 100;
//
//    private static final int CIRCLES_LIMIT = 3;
//    private HashSet<CircleArea> mCircles = new HashSet<CircleArea>(CIRCLES_LIMIT);
//    private SparseArray<CircleArea> mCirclePointer = new SparseArray<CircleArea>(CIRCLES_LIMIT);

//    float dX, dY;

    public DrawView(Context context) {
        super(context);            
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 100, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int actionIndex = event.getActionIndex();
        event.getRawX();

        switch (event.getActionMasked()) {

        }
        return super.onTouchEvent(event);
    }








//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        boolean handled = false;
//        int xTouch;
//        int yTouch;
//        int pointerId;
//        int actionIndex = event.getActionIndex();
//
//        switch (event.getActionMasked()) {
//            case MotionEvent.ACTION_MOVE:
//                final int pointerCount = event.getPointerCount();
//
//                Log.w(TAG, "Move");
//
//                for (actionIndex = 0; actionIndex < pointerCount; actionIndex++) {
//                    // Some pointer has moved, search it by pointer id
//                    pointerId = event.getPointerId(actionIndex);
//
//                    xTouch = (int) event.getX(actionIndex);
//                    yTouch = (int) event.getY(actionIndex);
//
//                    touchedCircle = mCirclePointer.get(pointerId);
//
//                    if (null != touchedCircle) {
//                        touchedCircle.centerX = xTouch;
//                        touchedCircle.centerY = yTouch;
//                    }
//                }
//                invalidate();
//                handled = true;
//                break;
//        }
//
//        return super.onTouchEvent(event) || handled;
//
//
//    }
}
