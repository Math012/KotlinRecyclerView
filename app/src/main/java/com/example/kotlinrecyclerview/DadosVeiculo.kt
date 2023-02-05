package com.example.kotlinrecyclerview

import com.example.kotlinrecyclerview.dados.Carro

/*
    Criando uma classe para popular a lista do tipo "Carro"
 */

class DadosVeiculo {
    companion object{
        fun listaDeVeiculos() : ArrayList<Carro>{
            val listaVeiculo = ArrayList<Carro>()

            listaVeiculo.add(Carro(
                "Fiat Uno",
                1999,
                7000
            ))

            listaVeiculo.add(Carro(
                "HB20",
                2012,
                17000
            ))

            listaVeiculo.add(Carro(
                "Prisma",
                2014,
                20000
            ))

            listaVeiculo.add(Carro(
                "Honda Civic",
                2020,
                100000
            ))

            listaVeiculo.add(Carro(
                "Fusca",
                1980,
                3000
            ))

            return listaVeiculo
        }
    }
}