package com.springfield.shoppingbag.onBoarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.springfield.shoppingbag.LoginActivity
import com.springfield.shoppingbag.R
import com.springfield.shoppingbag.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    lateinit var mViewDataBinding: ActivityOnBoardingBinding

    private val fragments : List<Fragment> by lazy {
        listOf(
            OnBoardingFragment(R.layout.fragment_first_screen),
            OnBoardingFragment(R.layout.fragment_second_screen),
            OnBoardingFragment(R.layout.fragment_third_screen)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
        val adapter = OnBoardingAdapter(this, fragments)
        mViewDataBinding.vpOnBoarding.adapter = adapter

        TabLayoutMediator(mViewDataBinding.tlOnBoarding, mViewDataBinding.vpOnBoarding) { tab, position ->

        }.attach()

        initView()

    }

    private fun performDataBinding() {
        mViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_on_boarding)
        mViewDataBinding.lifecycleOwner = this
        mViewDataBinding.executePendingBindings()
    }

    private fun initView() {
        with(mViewDataBinding) {
            btnLogin.setOnClickListener {
                startActivity(Intent(this@OnBoardingActivity, LoginActivity::class.java))
            }
        }
    }
}