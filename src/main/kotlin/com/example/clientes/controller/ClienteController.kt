package com.example.clientes.controller

import com.example.clientes.dto.ClienteDTO
import com.example.clientes.model.Cliente
import com.example.clientes.service.ClienteService
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
class ClienteController(private val service: ClienteService) {

    @PostMapping
    fun cadastra(@RequestBody dto: ClienteDTO) {
        service.cadastra(dto)
    }

    @GetMapping("/{id}")
    fun buscaPorId(@PathVariable id: Long): ResponseEntity<Cliente> {
        return try {
            ResponseEntity.ok(service.buscaPorId(id))
        } catch (ex: NotFoundException) {
            ResponseEntity.notFound().build()
        }
    }
}