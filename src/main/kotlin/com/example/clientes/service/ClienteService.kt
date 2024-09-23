package com.example.clientes.service

import com.example.clientes.dto.ClienteDTO
import com.example.clientes.model.Cliente
import com.example.clientes.repository.ClienteRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import toModel

@Service
class ClienteService(private val repository: ClienteRepository) {
    fun cadastra(dto: ClienteDTO) {
        val cliente = dto.toModel()

        repository.save(cliente)
    }

    fun buscaPorId(id: Long): Cliente {
        return repository.findByIdOrNull(id) ?: throw NotFoundException()
    }
}
