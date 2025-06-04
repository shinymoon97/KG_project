package com.example.demo.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 자동 생성되는 PK

    private String username; // 사용자 아이디
    private String pwd;      // 비밀번호
    private String name;     // 이름
    private String email;    // 이메일
} // 이 소스는 삭제 예정