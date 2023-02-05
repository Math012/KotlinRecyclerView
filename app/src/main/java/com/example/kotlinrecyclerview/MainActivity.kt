package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
/*
    Criando a variavel adapterCarro do tipo CarroAdapter, para inicializar nosso adapter
 */
    private lateinit var adapterCarro: CarroAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)

        inicializarAdapter()
        popularListaAdapter()
    }

    /*
        Função criada para inicializar o adapter
        *Não esquecer de inicializar uma RecyclerView dentro da activity_main.xml e criar uma
        variavel para receber a Recycler
     */
    private fun inicializarAdapter() {
        adapterCarro = CarroAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapterCarro
    }
    /*
        Função para popular a lista "listaCarros" atraves da lista "listaVeiculo" dentro da classe
        DadosVeiculo.kt
     */

    private fun popularListaAdapter(){
        val listaDado = DadosVeiculo.listaDeVeiculos()
        adapterCarro.popularListaCarros(listaDado)

    }
}