package com.example.appusers.di.modules

import android.content.Context
import com.example.appusers.base.BaseApp
import dagger.Module
import dagger.Provides

@Module
object AppModule {

    @Provides
    @JvmStatic
    internal fun provideContext(app: BaseApp): Context = app


}