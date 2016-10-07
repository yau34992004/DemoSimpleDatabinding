package com.test.demo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.demo.databinding.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Handler handler;

    @Inject
    LoginPageModel loginPageModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DemoApplication) getApplication()).getApplicationComponent().inject(this);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel(loginPageModel);
        activityMainBinding.setCallback(new LoginAction() {
            @Override
            public void onClickLogin(LoginPageModel loginPageModel) {
                Log.d(TAG, "checkLoginUserName->" + loginPageModel.getUserName());
                Log.d(TAG, "checkLoginPassword->" + loginPageModel.getPassword());

                loginPageModel.setUserName("");
                loginPageModel.setPassword("");
            }
        });

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "checkHandleIsWork");
            }
        }, 2000);

    }
}
