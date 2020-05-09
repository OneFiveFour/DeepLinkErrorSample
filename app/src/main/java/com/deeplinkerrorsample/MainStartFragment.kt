package com.deeplinkerrorsample

import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.Fragment
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainStartFragment: Fragment(R.layout.fragment_main) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener { navigateToSubActivity() }
    }

    private fun navigateToSubActivity() {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(requireActivity())
        val extras = ActivityNavigatorExtras(options)
        val action = MainStartFragmentDirections.actionMainFragmentToSubActivity("name coming from MainFragment")
        findNavController().navigate(action, extras)
    }
}