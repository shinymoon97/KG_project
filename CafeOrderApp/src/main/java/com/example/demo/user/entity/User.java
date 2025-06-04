package com.example.demo.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_info")  // 여기서 데이터가 저장될 테이블 이름 설정
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}
