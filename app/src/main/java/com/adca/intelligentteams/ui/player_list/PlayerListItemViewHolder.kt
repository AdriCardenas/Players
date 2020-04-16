package com.adca.intelligentteams.ui.player_list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adca.presentation.models.PlayerView
import kotlinx.android.synthetic.main.player_list_item.view.*

class PlayerListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvName: TextView = itemView.playerName

    fun bind(playerView: PlayerView, position : Int) {
        tvName.text = playerView.name
    }
}