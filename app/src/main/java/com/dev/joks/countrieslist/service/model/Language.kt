package com.dev.joks.countrieslist.service.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Language(
    @SerializedName("name")
    val name: String
) : Parcelable