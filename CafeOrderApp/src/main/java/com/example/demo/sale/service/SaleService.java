package com.example.demo.sale.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.sale.dto.SaleDTO;
import com.example.demo.sale.entity.Sale;
import com.example.demo.sale.repository.SaleRepository;

@Service
public class SaleService {

    private final SaleRepository saleRepository;
    private final ModelMapper modelMapper;

    public SaleService(SaleRepository saleRepository, ModelMapper modelMapper) {
        this.saleRepository = saleRepository;
        this.modelMapper = modelMapper;
    }

    public SaleDTO createSale(SaleDTO saleDTO) {
        Sale sale = modelMapper.map(saleDTO, Sale.class);
        Sale saved = saleRepository.save(sale);
        return modelMapper.map(saved, SaleDTO.class);
    }
}