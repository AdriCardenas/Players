package com.adca.intelligentteams.ui.player_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.adca.presentation.models.PlayerView
import com.adca.intelligentteams.R
import kotlinx.android.synthetic.main.player_list_activity.*

class PlayerListActivity : AppCompatActivity() {

    private val itemList = ArrayList<PlayerView>()
    private lateinit var playerAdapter: PlayerListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player_list_activity)


        playerAdapter =
            PlayerListAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = playerAdapter
        (0..99).mapTo(itemList) {
            PlayerView(
                it,
                "Item $it"
            )
        }
        playerAdapter.submitList(itemList)

        fab.setOnClickListener {
            itemList.add(
                PlayerView(
                    itemList.size,
                    "Item ${itemList.size}"
                )
            )

            playerAdapter.submitList(itemList)
            playerAdapter.notifyDataSetChanged()
        }
    }
}
