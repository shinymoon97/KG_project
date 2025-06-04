CREATE DATABASE cafeapp; -- 먼저 이 DB를 만든 후 Spring Boot 실행 (안하면 오류발생)
USE cafeapp;

CREATE TABLE user_info (
	id VARCHAR(255), -- 자동 생성되는 PK
    username VARCHAR(255), -- 사용자 아이디
	pwd VARCHAR(255), -- 비밀번호
	name VARCHAR(255), -- 이름
	email VARCHAR(255), -- 이메일
	PRIMARY KEY (id)
);

CREATE TABLE order_menu (
    id BIGINT NOT NULL AUTO_INCREMENT,
    coffee_type VARCHAR(255),
    quantity INT,
    pickup_time VARCHAR(255),
    takeout BIT,
    drive_thru BIT,
    estimated_pickup_time VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE seat_status (
    id INT AUTO_INCREMENT PRIMARY KEY,
    total_seats INT NOT NULL,
    available_seats INT NOT NULL
);
