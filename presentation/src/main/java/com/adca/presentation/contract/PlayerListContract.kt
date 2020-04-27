package com.adca.presentation.contract

import com.adca.presentation.base.PresenterBase
import com.adca.presentation.model.PlayerView

object PlayerListContract {
    interface View{
        fun setListItems(list:List<PlayerView>)
    }

    interface Presenter: PresenterBase {
        fun loadItems()
        fun addNewPlayer(name:String)
    }
}