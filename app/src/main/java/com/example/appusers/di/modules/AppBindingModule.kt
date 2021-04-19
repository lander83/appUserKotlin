package com.example.appusers.di.modules

import com.example.appusers.ui.users.UsersActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppBindingModule {

    @ContributesAndroidInjector
    internal abstract fun provideUsersActivity(): UsersActivity

}