package com.jorfald.fragmentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jorfald.fragmentexample.recycler.RecyclerExampleFragment
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    lateinit var showingFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val blackFragment = BlackFragment()
        val greenFragment = GreenFragment()

        goToTab(blackFragment)

        left_button.setOnClickListener {
            goToTab(blackFragment)
        }

        right_button.setOnClickListener {
            goToTab(RecyclerExampleFragment())
        }
    }

    private fun goToTab(fragmentToShow: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragmentToShow)
            .commitNow()

        showingFragment = fragmentToShow
    }

    fun goToFragment(fragmentToShow: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragmentToShow)
            .addToBackStack(null)
            .commit()

        showingFragment = fragmentToShow
    }
}