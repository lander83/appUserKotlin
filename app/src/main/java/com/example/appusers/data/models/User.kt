package com.example.appusers.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User {

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("id")
    @Expose
    var remoteId: Int? = null

    var localId: Int? = null

    @SerializedName("email")
    @Expose
    var email: String? = null
}