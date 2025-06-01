CREATE DATABASE cafeapp;
USE cafeapp;

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
