package com.github.dagger2.Application;

import android.app.Application;

import com.github.dagger2.API.Api;
import com.github.dagger2.Component.ApiComponent;
import com.github.dagger2.Component.DaggerApiComponent;
import com.github.dagger2.Module.ApiModule;
import com.github.dagger2.Module.AppModule;

public class MyApplication extends Application {
 
    private ApiComponent mApiComponent;
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule(Api.BASE_URL))
                .build();
    }
 
    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}