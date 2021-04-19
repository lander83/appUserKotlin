package com.example.appusers.di.modules

import com.example.appusers.data.source.local.UsersDao
import com.example.appusers.data.source.local.UsersLocalDataSource
import com.example.appusers.data.source.remote.UsersRemoteDataSource
import com.example.appusers.data.source.remote.UsersService
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object DataSourcesModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideUsersRemoteDataSource(usersService: UsersService): UsersRemoteDataSource {
        return UsersRemoteDataSource(usersService)
    }

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideUsersLocalDataSource(usersService: UsersDao): UsersLocalDataSource {
        return UsersLocalDataSource(usersService)
    }

}