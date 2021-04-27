package com.springfield.shoppingbag.onBoarding

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingAdapter(
    activity: OnBoardingActivity,
    private val fragments: List<Fragment>
): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}