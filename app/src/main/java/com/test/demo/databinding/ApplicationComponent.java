package com.test.demo.databinding;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by rex.yau on 10/7/2016.
 */
@Singleton
@Component(
        modules = {
                ApplicationModule.class,
        }
)
public interface ApplicationComponent {

    void inject(DemoApplication application);

    void inject(MainActivity activity);

    SecondComponent plus(SecondModule secondModule);

}
