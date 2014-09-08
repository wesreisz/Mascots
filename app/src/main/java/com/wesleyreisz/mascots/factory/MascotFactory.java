package com.wesleyreisz.mascots.factory;

import android.util.Log;

import com.wesleyreisz.mascots.model.Droid;
import com.wesleyreisz.mascots.model.Duke;
import com.wesleyreisz.mascots.model.Mascot;
import com.wesleyreisz.mascots.model.OctoCat;

import java.util.Date;
import java.util.Random;

/**
 * Created by wesleyreisz on 9/7/14.
 */
public class MascotFactory {
    private static int number = 1;
    private MascotFactory(){}
    public static Mascot getInstance() {
        Random randomGenerator = new Random(new Date().getTime() + number++);
        int val = randomGenerator.nextInt(4);//up to four but not including
        Log.d("mascot", "mascot number: " + val);
        switch (val) {
            case 1:
                return new Duke();
            case 2:
                return new Droid();
            default:
                return new OctoCat();
        }
    }
}
