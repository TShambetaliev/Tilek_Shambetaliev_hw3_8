package com.example.tilek_shambetaliev_hw3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tilek_shambetaliev_hw3_7.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private  var personalist = arrayListOf<Persona>()

    companion object{
        const val KEY_OF_KEYS = "person"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = PersonaAdapter(personalist, this::onClick)
        binding.rvPersona.adapter = adapter

    }
    private fun onClick(position: Int){
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                personalist[position]
            )
        )
    }

    private fun loadData(){
        personalist.add(Persona("https://cdn.rikmorti.ru/uploads/2020/02/rik-sanchez-rikmorti-ru.jpg", "Alive", "Rick Sanchez"))
        personalist.add(Persona("https://static.wikia.nocookie.net/rickandmorty/images/e/ee/Morty501.png/revision/latest?cb=20210827150137", "Alive", "Morty Smith"))
        personalist.add(Persona("https://static.wikia.nocookie.net/rickandmorty/images/b/bc/Albert_Einstein.png/revision/latest?cb=20150730213810", "Dead", "Albert Einste"))
        personalist.add(Persona("https://static.wikia.nocookie.net/rickandmorty/images/f/f1/Jerry_Smith.png/revision/latest?cb=20160923151111", "Alive", "Jerri Smith" ))
        }
}