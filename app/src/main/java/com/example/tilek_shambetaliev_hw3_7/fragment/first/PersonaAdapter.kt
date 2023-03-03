package com.example.tilek_shambetaliev_hw3_7.fragment.first

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.tilek_shambetaliev_hw3_7.databinding.ItemPersonaBinding
import com.example.tilek_shambetaliev_hw3_7.loadImage
import kotlin.reflect.KFunction1

class PersonaAdapter(val personList: ArrayList<Persona>, val OnClick: (position: Int)->Unit) :
    Adapter<PersonaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPersonaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int = personList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    inner class ViewHolder(private val binding: ItemPersonaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val persona = personList[adapterPosition]
            binding.apply {
                imgPersona.loadImage(persona.image.toString())
                tvName.text = persona.name
                tvLive.text = persona.live
            }
            itemView.setOnClickListener {
                OnClick.invoke(adapterPosition)
            }
        }
    }
}



