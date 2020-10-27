DROP TABLE IF EXISTS booking_details;
 
CREATE TABLE booking_details (
  hotel_id VARCHAR(250) AUTO_INCREMENT PRIMARY KEY,
  hotel_name VARCHAR(250) NOT NULL,
  checkin_date VARCHAR(250) NOT NULL,
  checkout_date VARCHAR(250) NOT NULL,
  cus_name VARCHAR(250) NOT NULL,
  cus_email VARCHAR(250) NOT NULL,
  phone_num VARCHAR(250) NOT NULL,
  room_name VARCHAR(250) DEFAULT NULL,
  num_guest VARCHAR(250) DEFAULT NULL,
  total_amount VARCHAR(250) DEFAULT NULL
  
);
 
INSERT INTO booking_details (hotel_name, checkin_date, checkout_date, cus_name, cus_email, phone_num, room_name, num_guest, total_amount) VALUES
  ('Hotel de Luna', '2020-10-27', '2020-10-30', 'Bill Gates', 'bg_01@gmail.com', '01234567890', 'Safari', '5', '100000'),
  ('Hotel de San Juan', '2020-10-27', '2020-10-30', 'Jack Gates', 'bg_02@gmail.com', '01234567891', 'Sahara', '5', '300000'),
  ('Hotel de Torro', '2020-10-27', '2020-10-30', 'Jiggly Gates', 'bg_04@gmail.com', '01234567893', 'Paradise', '5', '300000'),
  ('Hotel de Santo Nino', '2020-10-27', '2020-10-30', 'Jill Gates', 'bg_03@gmail.com', '01234567892', 'Antartic', '5', '400000');
  