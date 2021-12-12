package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.Tab1FragmentBinding

class Tab1Fragment : Fragment() {
    private lateinit var binding: Tab1FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Tab1FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}