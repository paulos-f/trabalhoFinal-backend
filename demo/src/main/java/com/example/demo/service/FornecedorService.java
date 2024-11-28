package com.example.demo.service;

import com.example.demo.dto.FornecedorDTO;
import com.example.demo.entity.Fornecedor;
import com.example.demo.repository.ForncedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FornecedorService {
    private final ForncedorRepository fornecedorRepository;

    public FornecedorService(ForncedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public FornecedorDTO criarFornecedor(FornecedorDTO fornecedorDTO) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(fornecedorDTO.getNome());
        fornecedor.setContato(fornecedorDTO.getContato());
        fornecedor = fornecedorRepository.save(fornecedor);

        fornecedorDTO.setId(fornecedor.getId());
        return fornecedorDTO;
    }

    public List<FornecedorDTO> listarFornecedores() {
        return fornecedorRepository.findAll().stream()
                .map(fornecedor -> {
                    FornecedorDTO dto = new FornecedorDTO();
                    dto.setId(fornecedor.getId());
                    dto.setNome(fornecedor.getNome());
                    dto.setContato(fornecedor.getContato());
                    return dto;
                }).collect(Collectors.toList());
    }

    public FornecedorDTO buscarFornecedorPorId(Long id) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fornecedor com ID " + id + " não encontrado."));
        FornecedorDTO dto = new FornecedorDTO();
        dto.setId(fornecedor.getId());
        dto.setNome(fornecedor.getNome());
        dto.setContato(fornecedor.getContato());
        return dto;
    }
}
