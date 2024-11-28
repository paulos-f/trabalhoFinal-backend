package com.example.demo.repository;

import com.example.demo.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForncedorRepository extends JpaRepository<Fornecedor, Long>  {
}