package com.adca.intelligentteams.ui.playerNew

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.adca.intelligentteams.R
import com.adca.intelligentteams.ui.base.BaseActivity
import com.adca.intelligentteams.ui.utils.EXTRA_NAME
import kotlinx.android.synthetic.main.new_player_activity.*

class NewPlayerActivity : BaseActivity() {

    override fun getLayoutRes(): Int = R.layout.new_player_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fabCheck.setOnClickListener {
            if (!inputName.text.isNullOrEmpty()){
                val result = Intent()

                result.putExtra(EXTRA_NAME, inputName.text.toString())
                setResult(Activity.RESULT_OK, result)
                finish()
            }
        }
    }
}