package com.example.appusers.ui.users

import com.example.appusers.data.models.User

interface UserOptionsListener {

    fun onFavoriteClicked(user: User)

}