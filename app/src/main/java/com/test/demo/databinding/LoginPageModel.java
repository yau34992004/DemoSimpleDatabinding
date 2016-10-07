package com.test.demo.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.*;
import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by rex.yau on 10/7/2016.
 */

public class LoginPageModel extends BaseObservable {

    private String userName;
    private String password;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

}
