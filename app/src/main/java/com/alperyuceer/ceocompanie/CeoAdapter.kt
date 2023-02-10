package com.alperyuceer.ceocompanie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alperyuceer.ceocompanie.databinding.RecyclerRowBinding

class CeoAdapter(val ceoList:ArrayList<Ceo>): RecyclerView.Adapter<CeoAdapter.CeoHolder>() {

    class  CeoHolder(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CeoHolder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CeoHolder(binding)
    }

    override fun getItemCount(): Int {
        return ceoList.size
    }

    override fun onBindViewHolder(holder: CeoHolder, position: Int) {
        holder.binding.recyclerViewTextView.text= ceoList.get(position).ceoName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)

            intent.putExtra("ceolar",ceoList.get(position))

            holder.itemView.context.startActivity(intent)
        }
    }
}