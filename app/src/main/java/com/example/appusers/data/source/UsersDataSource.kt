package com.example.appusers.data.source

import com.example.appusers.data.models.User
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response

interface UsersDataSource {
    fun getUsers(since: Int): Observable<Response<List<User>>>

    fun getMoreUsers(url: String): Observable<Response<List<User>>>

    fun getFavUsers(): Single<List<User>>

    fun saveFavUser(user: User): Completable

    fun deleteFavUser(id: Int): Completable

}