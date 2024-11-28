package com.example.demo.service;

import com.example.demo.dto.LojaDTO;
import com.example.demo.entity.Loja;
import com.example.demo.repository.LojaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LojaService {
    private final LojaRepository lojaRepository;

    public LojaService(LojaRepository lojaRepository) {
        this.lojaRepository = lojaRepository;
    }

    public LojaDTO criarLoja(LojaDTO lojaDTO) {
        Loja loja = new Loja();
        loja.setNome(lojaDTO.getNome());
        loja.setEndereco(lojaDTO.getEndereco());
        loja = lojaRepository.save(loja);

        lojaDTO.setId(loja.getId());
        return lojaDTO;
    }

    public List<LojaDTO> listarLojas() {
        return lojaRepository.findAll().stream()
                .map(loja -> {
                    LojaDTO dto = new LojaDTO();
                    dto.setId(loja.getId());
                    dto.setNome(loja.getNome());
                    dto.setEndereco(loja.getEndereco());
                    return dto;
                }).collect(Collectors.toList());
    }

    public LojaDTO buscarLojaPorId(Long id) {
        Loja loja = lojaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loja com ID " + id + " não encontrada."));
        LojaDTO dto = new LojaDTO();
        dto.setId(loja.getId());
        dto.setNome(loja.getNome());
        dto.setEndereco(loja.getEndereco());
        return dto;
    }
}
