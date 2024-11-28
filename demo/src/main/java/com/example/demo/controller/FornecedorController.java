package com.example.demo.controller;

import com.example.demo.dto.FornecedorDTO;
import com.example.demo.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @PostMapping
    public FornecedorDTO criarFornecedor(@RequestBody FornecedorDTO fornecedorDTO) {
        return fornecedorService.criarFornecedor(fornecedorDTO);
    }

    @GetMapping
    public List<FornecedorDTO> listarFornecedores() {
        return fornecedorService.listarFornecedores();
    }

    @GetMapping("/{id}")
    public FornecedorDTO buscarFornecedorPorId(@PathVariable Long id) {
        return fornecedorService.buscarFornecedorPorId(id);
    }
}
