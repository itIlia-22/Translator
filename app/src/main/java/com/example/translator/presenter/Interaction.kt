package com.example.translator.presenter

import io.reactivex.Observable


interface Interaction<T> {
    fun getData(word: String, fromRemoteSource: Boolean): Observable<T>
}


