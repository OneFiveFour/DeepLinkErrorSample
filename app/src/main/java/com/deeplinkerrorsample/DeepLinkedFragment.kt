package com.deeplinkerrorsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_deep_linked.*

class DeepLinkedFragment: Fragment(R.layout.fragment_deep_linked) {


    private val args : DeepLinkedFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_deep_linked_string.text = args.name
    }
}