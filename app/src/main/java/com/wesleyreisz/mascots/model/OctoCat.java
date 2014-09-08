package com.wesleyreisz.mascots.model;

import com.wesleyreisz.mascots.R;
import com.wesleyreisz.mascots.utils.TextUtils;

/**
 * Created by wesleyreisz on 9/7/14.
 */
public class OctoCat implements Mascot{
    @Override
    public int showMascotImage() {
        return R.drawable.octacat;
    }

    @Override
    public String powerCheer() {
        return TextUtils.OCTA_CAT;
    }
}
