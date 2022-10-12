package com.holpackartukii.holidayartukinemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.holpackartukii.holidayartukinemo.databinding.FragmentEnterBinding
import com.holpackartukii.holidayartukinemo.databinding.FragmentResultBinding


class EnterFragment : Fragment() {

    private var _binding: FragmentEnterBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("ActivityMainBinding = null")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEnterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnHolidays.setOnClickListener {
            findNavController().navigate(R.id.action_enterFragment_to_startFragment)
        }
        binding.btnNevs.setOnClickListener {
            findNavController().navigate(R.id.action_enterFragment_to_nevsFragment)
        }
        binding.btnInterestingFacts.setOnClickListener {
            findNavController().navigate(R.id.aboutFragment)
        }
        binding.btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_enterFragment_to_settingsFragment)
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }


}