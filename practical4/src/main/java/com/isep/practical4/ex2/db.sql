CREATE TABLE IF NOT EXISTS `book`(
    `ID` int(10) NOT NULL,
    `author` varchar(20) NOT NULL,
    `name` varchar(20) NOT NULL,
    `copies` int(10) NOT NULL,
    PRIMARY KEY (`id`)
);

    INSERT INTO book (ID, author, name, copies) VALUES(1,'Tolkien', 'Lord of Rings', 1500) ;
    INSERT INTO book (ID, author, name, copies) VALUES(2,'J Rowling', 'Harry potter', 1340);
    INSERT INTO book (ID, author, name, copies) VALUES(3,'Stan Li', 'Avengers', 2160);
    INSERT INTO book (ID, author, name, copies) VALUES(4,'Austen', 'Pride and Prejudice', 1000);
    INSERT INTO book (ID, author, name, copies) VALUES(5,'Tolstoy', 'War and Peace', 1000);
