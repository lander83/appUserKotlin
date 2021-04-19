package com.example.appusers.di.modules


import com.example.appusers.data.source.remote.UsersService
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit

@Module
object ApiServiceModule {
    @Provides
    @Reusable
    @JvmStatic
    internal fun provideUsersService(retrofit: Retrofit): UsersService {
        return retrofit.create(UsersService::class.java)
    }

}