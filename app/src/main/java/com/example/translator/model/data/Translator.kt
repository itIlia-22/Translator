package com.example.translator.model.data

import com.google.gson.annotations.SerializedName

data class Translator(
    @field:SerializedName("text")
    val translator: String?
)
