package com.example.clientes.repository

import com.example.clientes.model.Cliente
import org.springframework.data.repository.CrudRepository

interface ClienteRepository : CrudRepository<Cliente, Long> {

}
