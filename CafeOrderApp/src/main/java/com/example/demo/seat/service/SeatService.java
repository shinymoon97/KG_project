package com.example.demo.seat.service;

import com.example.demo.seat.entity.Seat;
import com.example.demo.seat.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private SeatRepository repository;

    public void reserveSeat(Seat seat) {
        repository.save(seat);
    }
}
