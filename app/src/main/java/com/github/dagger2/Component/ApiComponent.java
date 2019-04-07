package com.github.dagger2.Component;

import com.github.dagger2.Activity.MainActivity;
import com.github.dagger2.Module.ApiModule;
import com.github.dagger2.Module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}