package com.test.demo.databinding;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by yaucheukming on 2/12/2016.
 */

public class SecondActivity extends Activity {

    private static final String TAG = "SecondActivity";

    @Inject
    Session mSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"checkSession"+(mSession != null));

        ((DemoApplication) getApplication()).getApplicationComponent().plus(new SecondModule()).inject(this);
        Log.d(TAG,"checkSession"+(mSession != null));
    }
}
