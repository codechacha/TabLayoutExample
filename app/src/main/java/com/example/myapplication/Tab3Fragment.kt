package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.Tab3FragmentBinding

class Tab3Fragment : Fragment() {
    private lateinit var binding: Tab3FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Tab3FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}