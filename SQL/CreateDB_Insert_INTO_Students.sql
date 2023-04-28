create database Students;
use Students;
CREATE TABLE Student 
(
StudentID int primary key not null auto_increment,
Surname varchar (20),
StudentName varchar (20),
Stipend varchar (20),
Kurs varchar (20),
City varchar (20)
);
CREATE TABLE Exams_Marks
(
ExamID int primary key not null auto_increment,
StudentID int,
foreign key (StudentID) references Student (StudentID),
Subject_ID int,
foreign key  (Subject_ID) references Subjects (Subject_ID),
Mark int,
Exam_date date
);
CREATE TABLE Subjects
(
Subject_ID int primary key not null auto_increment,
Name_subject varchar (20)
);
SELECT * FROM exams_marks;
INSERT INTO STUDENT (Surname, StudentName, Stipend, Kurs, City) 
VALUES ('Antonyuk', 'Oleksandr', 'yes', 'History', 'Kiyv');
INSERT INTO STUDENT (Surname, StudentName, Stipend, Kurs, City) 
VALUES ('kravchuk', 'Tetiana', 'yes', 'History', 'Rivne');
DESCRIBE exams_marks;

