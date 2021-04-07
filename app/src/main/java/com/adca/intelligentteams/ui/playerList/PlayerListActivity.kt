package com.adca.intelligentteams.ui.playerList

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.adca.intelligentteams.R
import com.adca.intelligentteams.databinding.PlayerListActivityBinding
import com.adca.intelligentteams.ui.base.BaseActivity
import com.adca.intelligentteams.ui.newList.NewListActivity
import com.adca.intelligentteams.ui.playerNew.NewPlayerActivity
import com.adca.intelligentteams.ui.utils.ACTIVITY_CODE_ADD_NEW_PLAYER
import com.adca.intelligentteams.ui.utils.EXTRA_NAME
import com.adca.presentation.viewmodel.PlayerViewModel
import kotlinx.android.synthetic.main.player_list_activity.*
import org.koin.android.viewmodel.ext.android.viewModel

class PlayerListActivity : BaseActivity() {

    private lateinit var playerAdapter: PlayerListAdapter

    private val playerViewModel: PlayerViewModel by viewModel()

    override fun getLayoutView(): View = PlayerListActivityBinding.inflate(layoutInflater).root

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        playerAdapter =
//            PlayerListAdapter()
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.itemAnimator = DefaultItemAnimator()
//        recyclerView.adapter = playerAdapter
//
//        playerViewModel.playersDisplayed.observe(this, Observer { players ->
//            playerAdapter.submitList(players)
//        })
//
//        playerViewModel.loadPlayers()
//
        fab.setOnClickListener {
            startActivity(
                Intent(this, NewListActivity::class.java)
            )
        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == ACTIVITY_CODE_ADD_NEW_PLAYER) {
//            if (resultCode == Activity.RESULT_OK && data != null) {
//                val name = data.extras?.getString(EXTRA_NAME)
//                name?.let {
//                    playerViewModel.savePlayer(it)
//                }
//            }
//        }
//
//    }
}
