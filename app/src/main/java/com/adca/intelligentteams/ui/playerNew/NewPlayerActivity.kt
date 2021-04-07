package com.adca.intelligentteams.ui.playerNew

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.adca.intelligentteams.R
import com.adca.intelligentteams.databinding.NewPlayerActivityBinding
import com.adca.intelligentteams.ui.base.BaseActivity
import com.adca.intelligentteams.ui.utils.EXTRA_NAME
import kotlinx.android.synthetic.main.new_player_activity.*

class NewPlayerActivity : BaseActivity() {

    override fun getLayoutView(): View = NewPlayerActivityBinding.inflate(layoutInflater).root


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fabCheck.setOnClickListener {
            if (!inputName.text.isNullOrEmpty()) {
                val result = Intent()

                result.putExtra(EXTRA_NAME, inputName.text.toString())
                setResult(Activity.RESULT_OK, result)
                finish()
            }
        }
    }
}