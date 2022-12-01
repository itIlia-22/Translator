package com.example.translator.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.translator.model.data.AppState
import com.example.translator.presenter.Presenter

abstract class ActivityBaseView<T : AppState> : AppCompatActivity(), View {
    private lateinit var presenter: Presenter<T, View>
    protected abstract fun createPresenter(): Presenter<T, View>

   abstract override fun renderData(appState: AppState)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }
}