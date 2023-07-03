CREATE DATABASE homework_36;

USE Homework_36;

CREATE TABLE products(
id INT NOT NULL,
name VARCHAR(50),
cost FLOAT,
PRIMARY KEY(id)
);

CREATE TABLE orders(
id INT NOT NULL AUTO_INCREMENT,
date DATE,
cost FLOAT,
PRIMARY KEY(id)
);

CREATE TABLE products_orders(
products_id INT NOT NULL ,
orders_id INT NOT NULL,
FOREIGN KEY(products_id) REFERENCES products(id),
FOREIGN KEY(orders_id) REFERENCES orders(id)
);

INSERT INTO products(id,name,cost)
VALUES(1,'coffee',10),
(2,'tea',5),
(3,'hot dog',20),
(4,'cake',15),
(5,'sandwich',15),
(6,'water',2),
(7,'ice tea',8),
(8,'juice',12),
(9,'lemonade',17),
(10,'ice cream',16);

INSERT INTO orders(id,date,cost)
VALUES(1,'2023-06-28',33),
(2,'2023-06-29',10),
(3,'2023-06-30',37);


INSERT INTO products_orders(products_id,orders_id)
VALUES(1,1),
(4,1),
(7,1),
(1,2),
(4,3),
(6,3),
(3,3);