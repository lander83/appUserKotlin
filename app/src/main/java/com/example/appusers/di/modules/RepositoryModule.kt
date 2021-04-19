package com.example.appusers.di.modules

import com.example.appusers.data.source.UsersRepository
import com.example.appusers.data.source.local.UsersLocalDataSource
import com.example.appusers.data.source.remote.UsersRemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
object RepositoryModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideUsersRepository(
            usersRemoteDataSource: UsersRemoteDataSource,
            usersLocalDataSource: UsersLocalDataSource
    ): UsersRepository {
        return UsersRepository(usersRemoteDataSource, usersLocalDataSource)
    }

}