package com.test.demo.databinding;

import android.app.Application;
import android.os.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by rex.yau on 10/7/2016.
 */

public class DemoApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Inject
    Handler handler;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
