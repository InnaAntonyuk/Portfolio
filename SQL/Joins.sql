select * from student inner join exams_marks on student.studentID = exams_marks.studentID;
select * from student join exams_marks join subjects;
use students;
select * from student left join exams_marks on student.studentID = exams_marks.studentID;
select * from student right join exams_marks on student.studentID = exams_marks.studentID;
select * from exams_marks left join subjects on exams_marks.subject_ID = subjects.subject_ID;
select * from student right join exams_marks on student.studentID = exams_marks.studentID
union all
select * from student left join exams_marks on student.studentID = exams_marks.studentID where exams_marks.studentID is null;