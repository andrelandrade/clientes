package com.example.clientes.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "clientes")
class Cliente(
    val nome: String = "",
    val observacao: String?,
    val categoria: String?,
    @Column(name = "dt_nascimento")
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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
    @Column(name = "dt_cadastro")
    private val dataCadastro: LocalDate = LocalDate.now()
}