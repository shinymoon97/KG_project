package com.example.demo.sale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.sale.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}