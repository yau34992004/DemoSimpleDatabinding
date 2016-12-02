package com.test.demo.databinding;

import javax.inject.Singleton;

import dagger.Subcomponent;

/**
 * Created by yaucheukming on 2/12/2016.
 */
@SecondScope
@Subcomponent(
        modules = {
        SecondModule.class
    }
)
public interface SecondComponent {

    void inject(SecondActivity secondActivity);

//    Session requestSession();
//
//    @Subcomponent.Builder
//    interface Builder {
//        Builder requestModule(SecondModule module);
//        SecondComponent build();
//    }

}
