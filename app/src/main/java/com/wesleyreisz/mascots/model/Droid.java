package com.wesleyreisz.mascots.model;

import android.graphics.Bitmap;

import com.wesleyreisz.mascots.R;
import com.wesleyreisz.mascots.utils.TextUtils;

/**
 * Created by wesleyreisz on 9/7/14.
 */
public class Droid implements Mascot {
    @Override
    public int showMascotImage() {
        return R.drawable.droid;
    }

    @Override
    public String powerCheer() {
        return TextUtils.DROID;
    }
}
