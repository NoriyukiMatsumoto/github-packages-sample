package com.example.mylibrary

import android.R
import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout


class CustomButtonView(context : Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {
    init {
        View.inflate(context, com.example.mylibrary.R.layout.view_custom_buttom, this)
    }
}