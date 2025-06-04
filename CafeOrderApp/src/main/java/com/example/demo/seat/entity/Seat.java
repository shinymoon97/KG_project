package com.example.demo.seat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seat_status")  // 여기서 데이터가 저장될 테이블 이름 설정
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String total_seats;
    private String available_seats;
    private boolean available;

    // getters, setters
}
