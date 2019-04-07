package com.example.pushmessage;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;
import cn.jpush.im.android.api.JMessageClient;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        //极光IM
        JMessageClient.setDebugMode(true);
        JMessageClient.init(this);

        //极光推送
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);

    }
}
