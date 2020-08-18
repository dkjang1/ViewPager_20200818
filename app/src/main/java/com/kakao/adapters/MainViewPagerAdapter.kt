package com.kakao.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kakao.fragments.AddressFragment
import com.kakao.fragments.NameFragment
import com.kakao.fragments.PhoneNumFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return NameFragment()
        } else if (position == 1) {
            return PhoneNumFragment()
        } else {
            return AddressFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

}