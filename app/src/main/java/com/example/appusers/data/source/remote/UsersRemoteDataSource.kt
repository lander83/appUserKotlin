package com.example.appusers.data.source.remote

import com.example.appusers.data.models.User
import com.example.appusers.data.source.UsersDataSource
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response
import javax.inject.Inject

class UsersRemoteDataSource @Inject constructor(private val usersService: UsersService) :
        UsersDataSource {

    override fun getUsers(since: Int): Observable<Response<List<User>>> {
        return usersService.getAllUsers(since)
    }

    override fun getMoreUsers(url: String): Observable<Response<List<User>>> {
        return usersService.getMoreUsers(url)
    }


    override fun saveFavUser(user: User): Completable {
        throw Exception("No se permite guardar usuario favorito remoto.")
    }

    override fun deleteFavUser(id: Int): Completable {
        throw Exception("eliminar usuario favorito remoto no está permitido.")
    }

    override fun getFavUsers(): Single<List<User>> {
        throw Exception("Obtener usuarios favoritos de forma remota no está permitido.")
    }

}
