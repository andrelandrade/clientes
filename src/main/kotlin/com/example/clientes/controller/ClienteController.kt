package com.example.clientes.controller

import com.example.clientes.dto.ClienteDTO
import com.example.clientes.service.ClienteService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clientes")
class ClienteController(private val service: ClienteService) {

    @PostMapping
    fun cadastra(@RequestBody dto: ClienteDTO) {
        service.cadastra(dto)
    }
}