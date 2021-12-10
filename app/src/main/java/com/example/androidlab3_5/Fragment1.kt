package com.example.androidlab3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_1, container, false)
        root.findViewById<Button>(R.id.bnToSecond).setOnClickListener {
            findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return root
    }

}