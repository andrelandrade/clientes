package com.example.clientes.service

import com.example.clientes.dto.ClienteDTO
import com.example.clientes.repository.ClienteRepository
import org.springframework.stereotype.Service
import toModel

@Service
class ClienteService(private val repository: ClienteRepository) {
    fun cadastra(dto: ClienteDTO) {
        val cliente = dto.toModel()

        repository.save(cliente)
    }
}
