CREATE TABLE `order` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `coffee_type` VARCHAR(255),
  `quantity` INT,
  `takeout` BIT,
  `delivery_time` VARCHAR(255),
  `drive_thru` BIT,
  `estimated_pickup_time` VARCHAR(255),
  PRIMARY KEY (`id`)
);

CREATE TABLE seat_status (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  total_seats INT NOT NULL,
  available_seats INT NOT NULL
);