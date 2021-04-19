package com.example.appusers.di.modules

import androidx.room.Room
import com.example.appusers.base.BaseApp
import com.example.appusers.data.source.local.UsersDatabase
import com.example.appusers.data.source.local.UsersDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Provides
    @Singleton
    @JvmStatic
    fun provideGithubUsersDatabase(app: BaseApp): UsersDatabase = Room.databaseBuilder(app,
            UsersDatabase::class.java, "github_users_db").build()

    @Provides
    @JvmStatic
    internal fun provideUsersDao(database: UsersDatabase): UsersDao = database.usersDao()
}