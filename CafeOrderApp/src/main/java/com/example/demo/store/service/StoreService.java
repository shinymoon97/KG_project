package com.example.demo.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.store.dto.StoreDTO;
import com.example.demo.store.entity.Store;
import com.example.demo.store.repository.StoreRepository;

@Service
public class StoreService {

    private final StoreRepository storeRepository;
    private final ModelMapper modelMapper;

    public StoreService(StoreRepository storeRepository, ModelMapper modelMapper) {
        this.storeRepository = storeRepository;
        this.modelMapper = modelMapper;
    }

    public List<StoreDTO> getAllStores() {
        return storeRepository.findAll()
                .stream()
                .map(store -> modelMapper.map(store, StoreDTO.class))
                .collect(Collectors.toList());
    }

    public StoreDTO createStore(StoreDTO storeDTO) {
        Store store = modelMapper.map(storeDTO, Store.class);
        Store saved = storeRepository.save(store);
        return modelMapper.map(saved, StoreDTO.class);
    }

    public StoreDTO getStoreById(Long id) {
        Store store = storeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Store not found"));
        return modelMapper.map(store, StoreDTO.class);
    }
}