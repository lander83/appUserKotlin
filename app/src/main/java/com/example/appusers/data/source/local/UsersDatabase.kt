package com.example.appusers.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appusers.data.models.FavoriteUser

@Database(entities = [FavoriteUser::class], version = 1)
abstract class UsersDatabase : RoomDatabase() {

    abstract fun usersDao(): UsersDao

}