CREATE TABLE IF NOT EXISTS `schedule`(
    `Sh_Id` int(10) NOT NULL,
    `Date` DATE ,
    PRIMARY KEY (`Sh_Id`)
);

CREATE TABLE IF NOT EXISTS `course`(
    `Course_Id` int(10) NOT NULL,
    `Course_Teacher` varchar(20) NOT NULL,
    `Course_Name` varchar(50) NOT NULL,
    `Course_Content` LONGTEXT NOT NULL,
    Sh_Id int,
    PRIMARY KEY (Course_Id),
    FOREIGN KEY (Sh_Id) REFERENCES schedule(Sh_Id)
);

INSERT INTO schedule(Sh_Id, Date) VALUES(1,CURDATE()) ;
INSERT INTO course (Course_Id, Course_Teacher, Course_Name, Course_Content) VALUES(1,'Paul', 'Java', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.');
INSERT INTO course (Course_Id, Course_Teacher, Course_Name, Course_Content) VALUES(2,'Filips', 'CPP', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.');




