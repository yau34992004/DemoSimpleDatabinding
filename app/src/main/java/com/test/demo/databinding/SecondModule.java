package com.test.demo.databinding;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yaucheukming on 2/12/2016.
 */
@Module
public class SecondModule {

    @Provides
    @SecondScope
    public Session provideSession(){
        return new Session();
    }
}
