package com.example.appusers.di.modules

import androidx.lifecycle.ViewModelProvider
import com.example.appusers.ui.users.UsersViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object ViewModelModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideUsersViewModelFactoryce(factory: UsersViewModelFactory): ViewModelProvider.Factory =
            factory

}