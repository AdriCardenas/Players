package com.adca.intelligentteams.ui.playerList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.adca.intelligentteams.R
import com.adca.presentation.model.PlayerView

class PlayerListAdapter : ListAdapter<PlayerView, RecyclerView.ViewHolder>(ListItemCallback()) {

    class ListItemCallback : DiffUtil.ItemCallback<PlayerView>() {
        override fun areItemsTheSame(oldItem: PlayerView, newItem: PlayerView): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: PlayerView, newItem: PlayerView): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.player_list_item, parent, false)
        return PlayerListItemViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        (holder as PlayerListItemViewHolder).bind(item, position)
    }

}