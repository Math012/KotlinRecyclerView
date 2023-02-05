package com.example.kotlinrecyclerview

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnCreateContextMenuListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.dados.Carro
import com.example.kotlinrecyclerview.databinding.ActivityMainBinding
import com.example.kotlinrecyclerview.databinding.Item1CarBinding


class CarroAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var listaCarros : List<Carro> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        /*
            antes de criar o return do ViewHolder, precisamos criar a classe que ia receber
            os itens do layout, linha 35.
         */
        val itemValues = Item1CarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(itemValues)


    }

    override fun getItemCount(): Int {
        return listaCarros.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is CarViewHolder ->{
                holder.bind(listaCarros[position])
            }
        }

    }

    fun popularListaCarros(carros: List<Carro>){
        listaCarros = carros
    }

    /*
         Estrutura criada para acessar os campos dentro do layout
     */
    class CarViewHolder constructor(binding: Item1CarBinding): RecyclerView.ViewHolder(binding.root){
        private val nomeCarro = binding.textNome
        private val anoCarro = binding.textAno
        private val precoCarro = binding.textPreco

        /*

         */
        fun bind(carro: Carro){
            nomeCarro.text = carro.nome
            anoCarro.text = carro.ano.toString()
            precoCarro.text = carro.preco.toString()
        }
    }




}