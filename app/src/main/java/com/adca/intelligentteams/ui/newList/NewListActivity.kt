package com.adca.intelligentteams.ui.newList

import android.os.Bundle
import com.adca.intelligentteams.R
import com.adca.intelligentteams.databinding.NewListActivityBinding
import com.adca.intelligentteams.ui.base.BaseActivity

class NewListActivity : BaseActivity() {

    override fun getLayoutView() = NewListActivityBinding.inflate(layoutInflater).root

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addListNameFragment()
    }

    private fun addListNameFragment() {
        replaceFragment(R.id.contentLayout, NewListNameFragment.newInstance())
    }

}