package com.example.kotlinrecyclerview.dados

/*
    Para uma melhor organização, é recomendado que se crie uma classe que ira servir de modelo
    para o nosso XML/RecyclerView
 */
// Criando uma classe para servir de modelo para a lista
class Carro(
    var nome: String,
    var ano: Int,
    var preco: Int
)