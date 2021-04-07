package com.adca.intelligentteams.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDataFromArguments(arguments)
    }

    abstract fun getLayoutBindingView(inflater: LayoutInflater, container: ViewGroup?): View

    abstract fun destroyBinding()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = getLayoutBindingView(inflater, container)

    override fun onDestroyView() {
        destroyBinding()
        super.onDestroyView()
    }
    open fun getDataFromArguments(arguments: Bundle?) {

    }
}