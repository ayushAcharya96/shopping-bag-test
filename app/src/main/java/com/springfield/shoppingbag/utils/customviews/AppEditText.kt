package com.springfield.shoppingbag.utils.customviews

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import androidx.core.view.setPadding
import androidx.core.view.updateLayoutParams
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.textfield.TextInputLayout.BOX_BACKGROUND_NONE
import com.springfield.shoppingbag.utils.dp

class AppEditText: MaterialCardView {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
       initView(context)
    }

    private fun initView(context: Context) {
        val textInputEditText = TextInputEditText(context).apply {
            this.setBackgroundColor(Color.TRANSPARENT)
        }

        val textInputLayout = TextInputLayout(context).apply {
            addView(textInputEditText)
            hint = "Email"
            boxBackgroundMode = BOX_BACKGROUND_NONE
            setPadding(32.dp)
        }
        this.addView(textInputLayout)

        textInputLayout.updateLayoutParams<FrameLayout.LayoutParams> {
            width = MATCH_PARENT
            height = WRAP_CONTENT
        }

        textInputEditText.updateLayoutParams<ViewGroup.LayoutParams> {
            width = MATCH_PARENT
            height = WRAP_CONTENT
        }
    }

}