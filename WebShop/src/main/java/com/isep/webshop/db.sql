USE TSI_JavaApp;

CREATE TABLE IF NOT EXISTS `product`(
    `id` int(11) NOT NULL,
    `name` varchar(20) NOT NULL,
    `description` varchar(250) NOT NULL,
    `price` float NOT NULL,
    `pictureUrl` varchar(150),
    PRIMARY KEY (`id`)
);


INSERT INTO product(id, name, description, price) values (1, 'Computer Apple', 'Very good computer for you', 1200.00);
INSERT INTO product(id, name, description, price) values (2, 'Apple Phone', 'Everywhere and everytime', 500.00);
INSERT INTO product(id, name, description, price) values (3, 'Google Assistant', 'Do you need help?', 100.00);
