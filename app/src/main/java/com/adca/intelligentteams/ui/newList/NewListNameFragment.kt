package com.adca.intelligentteams.ui.newList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adca.intelligentteams.databinding.NewListNameFragmentBinding
import com.adca.intelligentteams.ui.base.BaseFragment

class NewListNameFragment : BaseFragment() {

    private var _binding: NewListNameFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance(): NewListNameFragment {
            return NewListNameFragment()
        }
    }

    override fun getLayoutBindingView(inflater: LayoutInflater, container: ViewGroup?): View =
        NewListNameFragmentBinding.inflate(inflater, container, false).root

    override fun destroyBinding() {
        _binding = null
    }
}