package com.example.czchen_practice.main.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.czchen_practice.databinding.MainRowBinding


class MainAdapter(private val list: List<String>, private val clickListener: (String) -> Unit) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemBinding = MainRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(list[position],clickListener)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MainViewHolder(var itemBinding: MainRowBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(itemName: String, clickListener: (String) -> Unit) {
            itemBinding.textView.text = itemName
            itemBinding.root.setOnClickListener { clickListener(itemName) }
        }
    }
}
