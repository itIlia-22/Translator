package com.example.translator.view

import com.example.translator.model.data.AppState

interface View {
    fun renderData(appState: AppState)

}