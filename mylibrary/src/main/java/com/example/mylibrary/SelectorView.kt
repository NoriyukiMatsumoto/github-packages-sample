package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class SelectorView(context : Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {
    init {
        View.inflate(context, R.layout.selector_view, this)
    }
}