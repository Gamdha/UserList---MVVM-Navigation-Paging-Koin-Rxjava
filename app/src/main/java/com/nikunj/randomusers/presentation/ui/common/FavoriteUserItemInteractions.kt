package com.nikunj.randomusers.presentation.ui.common

import com.nikunj.randomusers.domain.models.User

interface FavoriteUserItemInteractions: UserItemInteractions {
    fun removeUserFromFavorites(user: User)
}