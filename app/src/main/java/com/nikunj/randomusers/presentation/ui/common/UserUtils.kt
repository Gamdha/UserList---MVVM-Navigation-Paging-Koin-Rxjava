package com.nikunj.randomusers.presentation.ui.common

import android.widget.ImageView
import com.nikunj.randomusers.R
import com.nikunj.randomusers.presentation.ui.extensions.circleImage

fun setUserImage(userImageView: ImageView, gender: String, borderColor: Int, borderSize: Float, pictureUrl: String) {
    when(gender) {
        "male" -> userImageView
            .circleImage(pictureUrl, borderSize, borderColor, R.drawable.ic_default_user_image_male)
        "female" -> userImageView
            .circleImage(pictureUrl, borderSize, borderColor, R.drawable.ic_default_user_image_female)
    }
}