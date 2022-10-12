package com.holpackartukii.holidayartukinemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.holpackartukii.holidayartukinemo.databinding.FragmentAboutBinding
import com.holpackartukii.holidayartukinemo.databinding.FragmentSettingsBinding
import com.holpackartukii.holidayartukinemo.pager.VievPagerAdapter

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("ActivityMainBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val listOfImages = createListOfImages()
        val adapter = VievPagerAdapter(listOfImages)
        binding.pager.adapter = adapter

        binding.btnImgExit.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.btnOk.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.circleInd.setViewPager(binding.pager)

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun createListOfImages(): List<Int> {
        return listOf(
            R.drawable.one,
            R.drawable.tvo,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten,
            R.drawable.elev,
            R.drawable.tvelv,
            R.drawable.thirten,
            R.drawable.fourteen,
        )
    }

}