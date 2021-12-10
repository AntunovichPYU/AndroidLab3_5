package com.example.androidlab3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_2, container, false)
        root.findViewById<Button>(R.id.bnToFirst).setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
        root.findViewById<Button>(R.id.bnToThird).setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }
        return root
    }

}