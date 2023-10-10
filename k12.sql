CREATE DATABASE k12;
DROP DATABASE k12;
DROP DATABASE pbo_w12;
USE k12;

CREATE TABLE users(
	`nim` VARCHAR(15) NOT NULL PRIMARY KEY,
	`name` VARCHAR(25) NOT NULL,
	`username` VARCHAR(250) NOT NULL UNIQUE,
	`password` VARCHAR(250) NOT NULL,
	`created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP	
);

CREATE TABLE datapengguna(
	`nim` VARCHAR (15) NOT NULL,
	`semester` VARCHAR(5) NOT NULL,
	`matakuliah1` VARCHAR(20) NOT NULL,
	`sks1` VARCHAR(5),
	`bobot1` VARCHAR(5),
	`created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (nim) REFERENCES `users` (nim));
	
CREATE TABLE dataipk(
	`nim` VARCHAR (15) NOT NULL,
	`semesterhitung` VARCHAR(5) NOT NULL,
	`ips` DOUBLE NOT NULL,
	FOREIGN KEY (nim) REFERENCES `users` (nim));

DROP TABLE users;
DROP TABLE datapengguna;
DROP TABLE dataipk;


SELECT * FROM users;
SELECT * FROM datapengguna;
SELECT * FROM dataipk;

SELECT AVG (ips) FROM dataipk