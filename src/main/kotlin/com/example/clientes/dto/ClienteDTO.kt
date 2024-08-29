package com.example.clientes.dto

import java.time.LocalDate

data class ClienteDTO(
    val nome: String,
    val observacao: String?,
    val categoria: String?,
    val dataNacimento: LocalDate?,
    val naturalidade: String?,
    val estadoNaturalidade: String?,
    val nacionalidade: String?,
    val estadoCivil: String?,
    val endereco: String?,
    val bairro: String?,
    val cidade: String?,
    val estado: String?,
    val telefone1: String?,
    val telefone2: String?,
    val mesPago: Int,
    val anoPago: Int,
)
