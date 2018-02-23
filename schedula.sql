
create table student
(
  student_id integer not null,
  name varchar(255) not null,
  surname varchar(255) not null,
  primary key(id)

);
CREATE TABLE lesson
(
  id integer not null,
  name varchar(255) not null,
  hours varchar(255) not null,
  PRIMARY KEY (id)
);

INSERT INTO student
VALUES (1,'HASAN','Rgngi','AVCI');


