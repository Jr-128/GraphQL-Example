package com.example.graphql.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.graphql.databinding.CountryItemBinding


class CharactersAdapter: RecyclerView.Adapter<CharactersViewHolder>() {

    var charactersList: MutableList<String> = mutableListOf()

    fun updateCharactersList(newList: List<String>) {
        charactersList.clear()
        charactersList.addAll(newList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        return CharactersViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val fact = charactersList[position]
        holder.bind(fact)
    }

    override fun getItemCount(): Int = charactersList.size


}

class CharactersViewHolder(private val binding: CountryItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(st: String) {
        binding.ctv.text = st
    }

    companion object {
        fun from(parent: ViewGroup): CharactersViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return CharactersViewHolder(CountryItemBinding.inflate(layoutInflater, parent, false))
        }

    }
        
}
