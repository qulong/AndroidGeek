package com.xiaomai.geek.application

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * Created by wangce on 2018/1/26.
 */
class GeekApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        InitializeService.start(this)
    }
}