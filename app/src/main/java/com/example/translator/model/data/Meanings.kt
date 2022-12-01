package com.example.translator.model.data

import com.google.gson.annotations.SerializedName

data class Meanings(
    @field:SerializedName("translator")
    val translator: Translator?,
    @field:SerializedName("imageUrl")
    val imageUrl: String?
)
