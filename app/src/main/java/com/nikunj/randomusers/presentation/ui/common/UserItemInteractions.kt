package com.nikunj.randomusers.presentation.ui.common

import android.widget.ImageView
import com.nikunj.randomusers.domain.models.User

interface UserItemInteractions {
    fun navigateToUserDetail(user: User, userImage: ImageView, position: Int)
}