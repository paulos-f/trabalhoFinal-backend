package com.example.demo.controller;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteDTO criarCliente(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.criarCliente(clienteDTO);
    }

    @GetMapping
    public List<ClienteDTO> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public ClienteDTO buscarClientePorId(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }
}
