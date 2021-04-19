package com.example.appusers.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class DetailUser {

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("address")
    @Expose
    var address: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("website")
    @Expose
    var website: String? = null
}