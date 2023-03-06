package com.example.tilek_shambetaliev_hw3_7.fragment.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tilek_shambetaliev_hw3_7.databinding.FragmentSecondBinding
import com.example.tilek_shambetaliev_hw3_7.fragment.first.FirstFragment
import com.example.tilek_shambetaliev_hw3_7.fragment.first.Persona
import com.example.tilek_shambetaliev_hw3_7.loadImage

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




            val rickiMorti = navArgs.posit
            with(binding) {
                tvLiveStat.text=rickiMorti.live.toString()
                tvNames.text=rickiMorti.name.toString()
                imgPer.loadImage(rickiMorti.image.toString())
            }
        }
    }
