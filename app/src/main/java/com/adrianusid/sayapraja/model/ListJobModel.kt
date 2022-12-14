package com.adrianusid.sayapraja.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListJobModel(
    val idJob : String? = "",
    val corpName : String? = "",
    val positionJob : String? = "",
    val phone : String? = "",
    val description : String? = "",
    val requirement : String? = "",
    val idCorp : String? = "",
    val date: String? = ""
) : Parcelable
