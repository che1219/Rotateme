package com.example.rotateme;

import android.view.MotionEvent;
import android.view.View;

public class TouchListener implements View.OnTouchListener {

    MainActivity mainActivity;

    public TouchListener(MainActivity ma) {
        this.mainActivity = ma;
    }



    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        int maskedAction = motionEvent.getActionMasked();
        switch(maskedAction){
            case MotionEvent.ACTION_DOWN:
                mainActivity.upsideDown();
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
                mainActivity.rightSideUp();
                break;
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_CANCEL:
        }
        return true;
    }
}
