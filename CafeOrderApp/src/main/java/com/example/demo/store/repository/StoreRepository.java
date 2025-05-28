package com.example.demo.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.store.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
}