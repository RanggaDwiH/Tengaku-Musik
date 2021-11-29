
package io.github.rangga.tengaku.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import io.github.rangga.tengaku.fragments.Home
import io.github.rangga.tengaku.fragments.Search
import io.github.rangga.tengaku.fragments.Playlists
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Adapter for ViewPager on MainActivity.
 */
@ExperimentalCoroutinesApi
class ViewPagerAdapter(fm: FragmentManager, private val home: Home):
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> home
            1 -> Search()
            else -> Playlists()
        }
    }

    override fun getCount() = 3
}