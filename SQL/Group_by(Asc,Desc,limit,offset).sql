SELECT count(mark), mark from students.exams_marks group by mark having mark >= 90;
select Surname, StudentName from students.student ORDER by StudentName DESC;
select Surname, StudentName from students.student ORDER by Surname ASC;
select Surname, StudentName from students.student ORDER by Surname ASC limit 4;
select Surname, StudentName from students.student ORDER by Surname ASC limit 4 OFFSET 3;