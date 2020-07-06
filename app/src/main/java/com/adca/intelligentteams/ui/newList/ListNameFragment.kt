package com.adca.intelligentteams.ui.newList

import com.adca.intelligentteams.R
import com.adca.intelligentteams.ui.base.BaseFragment

class ListNameFragment : BaseFragment() {

    companion object{
        fun newInstance(): ListNameFragment{
            return ListNameFragment()
        }
    }

    override fun getLayoutRes(): Int = R.layout.list_name_fragment
}