package com.example.demo.seat.controller;

import com.example.demo.seat.entity.Seat;
import com.example.demo.seat.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/reserve")
    public String showReservationForm() {
        return "reserve";
    }

    @PostMapping("/reserve")
    public String reserveSeat(@ModelAttribute Seat seat) {
        seatService.reserveSeat(seat);
        return "redirect:/reserve-success";
    }

    @GetMapping("/reserve-success")
    public String showSuccessPage() {
        return "reserve_success";
    }
}
