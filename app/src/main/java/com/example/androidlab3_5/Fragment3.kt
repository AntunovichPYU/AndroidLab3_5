package com.example.androidlab3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_3, container, false)
        root.findViewById<Button>(R.id.to_first_button).setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment1)
        }
        root.findViewById<Button>(R.id.to_second_button).setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment2)
        }
        return root
    }

}