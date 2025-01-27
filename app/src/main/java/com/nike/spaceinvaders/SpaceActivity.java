package com.nike.spaceinvaders;

import android.app.Activity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class SpaceActivity extends Activity {
    private SpaceGame mSpaceGame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mSpaceGame = new SpaceGame(this, size.x, size.y);

        setContentView(mSpaceGame);
    }


    @Override
    protected void onResume(){
        super.onResume();
        mSpaceGame.resume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mSpaceGame.pause();
    }
}
