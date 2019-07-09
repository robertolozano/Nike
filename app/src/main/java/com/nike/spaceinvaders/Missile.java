// Author: Zhiyuan Guo

package com.nike.spaceinvaders;

import android.graphics.RectF;


/*
    Invaders and laserBase will use missile to attack
    each other.
    Missile moves straight up/down once attacker releases
    it.
 */
class Missile {
    private RectF mRect;
    // private float mXVelocity;
    private float mYVelocity;
    private float mMissleWidth;
    private float mMissleHeight;


    // Missile constructor
    Missile(){

    }

    // Update the missile position for each frame
    void update(long fps){
        // Missile from laserBase will move up
        // Missile from invaders will move down
        // with velocity defined in mYVelocity

        mRect.top += mYVelocity / fps;
        mRect.bottom = mRect.top - mMissleHeight;
    }
}
