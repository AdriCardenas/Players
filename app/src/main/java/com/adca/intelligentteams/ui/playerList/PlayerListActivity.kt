package com.adca.intelligentteams.ui.playerList

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.adca.intelligentteams.R
import com.adca.intelligentteams.ui.playerNew.NewPlayerActivity
import com.adca.intelligentteams.ui.utils.ACTIVITY_CODE_ADD_NEW_PLAYER
import com.adca.intelligentteams.ui.utils.EXTRA_NAME
import com.adca.presentation.contract.PlayerListContract
import com.adca.presentation.model.PlayerView
import kotlinx.android.synthetic.main.player_list_activity.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PlayerListActivity : AppCompatActivity(),
    PlayerListContract.View {

    private lateinit var playerAdapter: PlayerListAdapter
    private val presenter: PlayerListContract.Presenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_list_activity)

        playerAdapter =
            PlayerListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = playerAdapter

        fab.setOnClickListener {
            startActivityForResult(
                Intent(this, NewPlayerActivity::class.java),
                ACTIVITY_CODE_ADD_NEW_PLAYER
            )
        }

        presenter.loadItems()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ACTIVITY_CODE_ADD_NEW_PLAYER) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                val name = data.extras?.getString(EXTRA_NAME)
                name?.let {
                    presenter.addNewPlayer(it)
                }
            }
        }

    }

    override fun setListItems(list: List<PlayerView>) {
        playerAdapter.submitList(list)
    }

    override fun onDestroy() {
        presenter.cleanup()
        super.onDestroy()
    }
}
