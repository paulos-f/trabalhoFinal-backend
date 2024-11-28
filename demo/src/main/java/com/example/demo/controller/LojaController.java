package com.example.demo.controller;

import com.example.demo.dto.LojaDTO;
import com.example.demo.service.LojaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lojas")
public class LojaController {
    private final LojaService lojaService;

    public LojaController(LojaService lojaService) {
        this.lojaService = lojaService;
    }

    @PostMapping
    public LojaDTO criarLoja(@RequestBody LojaDTO lojaDTO) {
        return lojaService.criarLoja(lojaDTO);
    }

    @GetMapping
    public List<LojaDTO> listarLojas() {
        return lojaService.listarLojas();
    }

    @GetMapping("/{id}")
    public LojaDTO buscarLojaPorId(@PathVariable Long id) {
        return lojaService.buscarLojaPorId(id);
    }
}
