package com.example.judithehiguese.walkorrun;

/**
 * Created by judithehiguese on 02/05/2017.
 */


import android.os.Bundle;
import android.app.Activity;

public class Summary extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DrawView drawView = new DrawView(this);
        setContentView(drawView);
    }
}

