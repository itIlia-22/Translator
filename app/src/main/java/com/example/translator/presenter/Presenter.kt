package com.example.translator.presenter

import com.example.translator.model.data.AppState
import com.example.translator.view.View

interface Presenter <T : AppState, V : View>{
    fun attachView(activityBaseView: V)
    fun detachView(activityBaseView: V)
    // Получение данных с флагом isOnline(из Интернета или нет)
    fun getData(word: String, isOnline: Boolean)
}