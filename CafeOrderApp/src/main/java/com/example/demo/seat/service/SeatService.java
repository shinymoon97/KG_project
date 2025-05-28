package com.example.demo.seat.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.seat.dto.SeatDTO;
import com.example.demo.seat.entity.Seat;
import com.example.demo.seat.repository.SeatRepository;

@Service
public class SeatService {

    private final SeatRepository seatRepository;
    private final ModelMapper modelMapper;

    public SeatService(SeatRepository seatRepository, ModelMapper modelMapper) {
        this.seatRepository = seatRepository;
        this.modelMapper = modelMapper;
    }

    public List<SeatDTO> getAllSeats() {
        return seatRepository.findAll()
                .stream()
                .map(seat -> modelMapper.map(seat, SeatDTO.class))
                .collect(Collectors.toList());
    }

    public SeatDTO createSeat(SeatDTO seatDTO) {
        Seat seat = modelMapper.map(seatDTO, Seat.class);
        Seat saved = seatRepository.save(seat);
        return modelMapper.map(saved, SeatDTO.class);
    }
}