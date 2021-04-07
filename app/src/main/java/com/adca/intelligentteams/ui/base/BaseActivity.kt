package com.adca.intelligentteams.ui.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    abstract fun getLayoutView(): View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutView())
    }

    fun replaceFragment(id: Int, fragment: BaseFragment) {
        supportFragmentManager.beginTransaction().replace(id, fragment).commit()
    }

}