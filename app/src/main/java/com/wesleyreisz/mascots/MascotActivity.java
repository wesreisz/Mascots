package com.wesleyreisz.mascots;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.wesleyreisz.mascots.factory.MascotFactory;
import com.wesleyreisz.mascots.model.Droid;
import com.wesleyreisz.mascots.model.Duke;
import com.wesleyreisz.mascots.model.Mascot;
import com.wesleyreisz.mascots.model.OctoCat;
import com.wesleyreisz.mascots.utils.TextUtils;


public class MascotActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascot);

        Button btn = (Button)findViewById(R.id.btnFinder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mascot mascot = MascotFactory.getInstance();
                Toast toast = Toast.makeText(view.getContext(),mascot.powerCheer(),Toast.LENGTH_LONG);
                toast.show();
                ImageView imageView = (ImageView) findViewById(R.id.imgView);
                imageView.setImageResource(mascot.showMascotImage());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mascot, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
