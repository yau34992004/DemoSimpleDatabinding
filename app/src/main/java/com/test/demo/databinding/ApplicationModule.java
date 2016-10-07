package com.test.demo.databinding;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rex.yau on 10/7/2016.
 */
@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Handler provideMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    @Provides
    @Singleton
    public LoginPageModel getLoginPageModel() {
        return new LoginPageModel();
    }

}
