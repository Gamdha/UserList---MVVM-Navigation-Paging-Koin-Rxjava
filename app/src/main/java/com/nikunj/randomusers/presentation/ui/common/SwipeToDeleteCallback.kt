package com.nikunj.randomusers.presentation.ui.common

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.nikunj.randomusers.presentation.ui.favorites.FavoriteUsersAdapter

class SwipeToDeleteCallback(
    private val favoriteUsersAdapter: FavoriteUsersAdapter
): ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        favoriteUsersAdapter.swipeItem(viewHolder.adapterPosition)
    }
}