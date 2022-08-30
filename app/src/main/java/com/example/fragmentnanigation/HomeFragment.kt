package com.example.fragmentnanigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nestedNavHostFragment =
            childFragmentManager.findFragmentById(R.id.nestednavhost) as? NavHostFragment

        val navController = nestedNavHostFragment?.navController

//        navController?.navigate(
//            R.id.action_nested1Fragment_to_blankFragment
//        )
//        val fragmentContainer = view.findViewById<View>(R.id.nestednavhost)
////        val navController = Navigation.findNavController(fragmentContainer)
//
//        val nestedNavHostFragmene = childFragmentManager.findFragmentById(R.id.nestednavhost)

        val btn = view.findViewById<Button>(R.id.btn).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)

        }
    }
}