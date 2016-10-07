package com.test.demo.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.demo.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel(new LoginPageModel());
        activityMainBinding.setCallback(new LoginAction() {
            @Override
            public void onClickLogin(LoginPageModel loginPageModel) {
                Log.d(TAG, "checkLoginUserName->" + loginPageModel.getUserName());
                Log.d(TAG, "checkLoginPassword->" + loginPageModel.getPassword());

                loginPageModel.setUserName("");
                loginPageModel.setPassword("");
            }
        });
    }
}
