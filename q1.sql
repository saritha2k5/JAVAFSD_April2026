CREATE TABLE s1.emp
(
   empno INT PRIMARY KEY,
   ename VARCHAR(10),
   job VARCHAR(20),
   mgr INT,
   hiredate DATE,
   sal NUMERIC(7,2),
   comm NUMERIC(7,2),
   deptno INT
);

CREATE TABLE designation_master
(
    design_code INT PRIMARY KEY,
    design_name VARCHAR(50)
);



CREATE TABLE department_master
(
    dept_code INT PRIMARY KEY,
    dept_name VARCHAR(50)
);


CREATE TABLE student_master
(
    student_code INT PRIMARY KEY,
    student_name VARCHAR(50) NOT NULL,
    dept_code INT,
    student_dob DATE,
    student_address VARCHAR(240)
);


CREATE TABLE student_marks
(
    student_code INT,
    student_year INT NOT NULL,
    subject1 INT,
    subject2 INT,
    subject3 INT
);

CREATE TABLE staff_master
(
    staff_code INT PRIMARY KEY,
    staff_name VARCHAR(50) NOT NULL,
    design_code INT,
    dept_code INT,
    hiredate DATE,
    staff_dob DATE,
    staff_address VARCHAR(240),
    mgr_code INT,
    staff_sal NUMERIC(10,2)
);

SELECT staff_name,staff_sal, dept_code from staff_master WHERE dept_code IN(20,30,40);

CREATE TABLE book_master
(
    book_code BIGINT PRIMARY KEY,
    book_name VARCHAR(50) NOT NULL,
    book_pub_year INT,
    book_pub_author VARCHAR(50) NOT NULL
);


CREATE TABLE book_transactions
(
    book_code BIGINT,
    student_code INT,
    staff_code INT,
    book_issue_date DATE NOT NULL,
    book_expected_return_date DATE NOT NULL,
    book_actual_return_date DATE
);


INSERT INTO department_master VALUES
(10,'COMPUTER SCIENCE'),
(20,'ELECTRICAL'),
(30,'ELECTRONICS'),
(40,'MECHANICAL');

INSERT INTO designation_master VALUES
(101,'PROFESSOR'),
(102,'LECTURER'),
(103,'CLERK');



INSERT INTO staff_master VALUES
(1001,'ALLEN',101,10,'2001-01-12',
'1975-03-10','CHICAGO',NULL,55000),

(1002,'GEORGE',102,20,'2004-06-15',
'1980-04-22','FRANCE',1001,24000),

(1003,'BECKER',103,30,'2008-08-21',
'1985-05-11','NEW YORK',1001,15000),

(1004,'ADAMS',102,10,'2010-02-11',
'1982-11-01','INDIA',1002,22000);

INSERT INTO student_master VALUES
(200001,'JOHN',10,'1982-01-12','USA'),
(200002,'JACK',20,'1981-02-18','INDIA'),
(200003,'JAMES',30,'1983-03-20','LONDON');


INSERT INTO student_marks VALUES
(200001,2025,80,75,90),
(200002,2025,65,70,60),
(200003,2025,50,55,45);





INSERT INTO book_master VALUES
(5001,'COMPILER DESIGN',2002,'DENNIS'),
(5002,'C PROGRAMMING',2003,'JAMES'),
(5003,'JAVA & ORACLE',2004,'HERBERT');

INSERT INTO book_transactions VALUES
(5001,200001,NULL,CURRENT_DATE-10,CURRENT_DATE+5,NULL),

(5002,NULL,1002,CURRENT_DATE-20,CURRENT_DATE-5,NULL);


Select Version();

select current_database();


select current_user;

select datname from pg_database;


select pid,backend_type from pg_stat_activity;





show shared_buffers;

show work_mem;

show maintenance_work_mem;

SHOW 
wal_buffers;

create tablespace mayspace
location 'C:/postgres';


create table employees(id INT, name VARCHAR(100))
tablespace mayspace;


select * from pg_tablespace;

create database schooldb2;


create database schooldb1
owner postgres;

drop database if exists schooldb2;


select staff_code as "STAFFCODE",staff_name as "STAFFNAME" from staff_master where staff_code=1002;



select * from staff_master where staff_dob not between '1975-03-10' and '1976-01-01';

select 'Hello   ' || staff_name as STAFF from staff_master where staff_name not like '%B%';

select * from staff_master ;
select * from staff_master where staff_dob >'1975-03-10' or design_code=102 ;

select distinct design_code from staff_master
select  design_code from staff_master order by design_code desc;

create schema s1;

SELECT schema_name
FROM information_schema.schemata;


SET search_path TO public;

select * from emp;

alter schema s1 rename to s2;

drop schema s2;

drop schema ownschema;


CREATE TABLE numeric_demo(
id SERIAL PRIMARY KEY,
age SMALLINT,
salary DECIMAL(10,2),
percentage REAL,
large_number BIGINT
)


INSERT INTO numeric_demo(age,salary,percentage,large_number) VALUES 
(25,45000.75, 85.5, 99999999),
(26,55000.75, 86.5, 9988999999);

select * from numeric_demo;


CREATE TABLE character_demo(
id SERIAL PRIMARY KEY, name VARCHAR(100), gender CHAR(1), description TEXT
);


INSERT INTO character_demo(name, gender, description)
VALUES
('Rahul', 'M','welcome to postgres'),
('Rahul2', 'M','welcome to postgres'),
('Rahul3', 'M','welcome to postgres'),
('Rahul3', 'M','welcome to postgres');

select * from character_demo;


CREATE TABLE datetime_demo(
id SERIAL PRIMARY KEY, joining_date DATE, login_time TIME, createdat TIMESTAMP, duration INTERVAl);


INSERT INTO datetime_demo(joining_date,login_time,createdat,duration)
VALUES 
('05-05-2026','10:30:00',NOW(),'3hour');


select * from datetime_demo;

CREATE TABLE boolean_demo(id SERIAL PRIMARY KEY, isactive BOOLEAN);

insert into boolean_demo(isactive)
VALUES(TRUE),(FALSE),(TRUE);

select * from boolean_demo;


CREATE TABLE json_demo(
id SERIAL PRIMARY KEY,
details JSON,
info JSONB
);

INSERT INTO json_demo(details,info)
VALUES('{"name":"john","age":25}',
'{"city":"Bangalore","country":"India"}'

);

select * from json_demo;


CREATE TABLE array_demo(id SERIAL PRIMARY KEY, marks INTEGER[], subjects TEXT[]);

INSERT INTO array_demo(marks,subjects)
VALUES(ARRAY[90,50,60,70],ARRAY['MATH','ENGLISH','SCIENCE','HINDI']);


select * from array_demo;


CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE employee1(
id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
name VARCHAR(100)
);

INSERT INTO employee1(name)
VALUES('Roja');

select * from employee1;

create table students(stu_id SERIAL PRIMARY KEY, name VARCHAR(100),age INT, course VARCHAR(100));

select * from students;


alter table students add email VARCHAR(100);

ALTER TABLE students RENAME COLUMN course to department;

ALTER TABLE students ALTER COLUMN age TYPE BIGINT;

ALTER TABLE students DROP COLUMN email;

DROP TABLE emp;


CREATE TEMP TABLE temp_students(id INT, name VARCHAR(50));

INSERT INTO temp_students values(1,'ANU');

SELECT * FROM temp_students;

CREATE TABLE departments(dept_id SERIAL PRIMARY KEY, dept_name VARCHAR(100));

insert into departments(dept_name) 
values 
('CS'),
('MECH'),
('EEE');

select * from departments

CREATE TABLE college_students1(
stu_id SERIAL PRIMARY KEY,
stu_name VARCHAR(100) NOT NULL,
stu_email VARCHAR(100) UNIQUE,
age INT CHECK(age>=18),
course VARCHAR(50) DEFAULT 'BCA',
deptid INT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT f_department
FOREIGN KEY (deptid)
REFERENCES departments(dept_id));


select * from college_students;

);


insert into college_students(stu_name, stu_email, age,  deptid)
values('hhh','abc5@gmail.com', null, 3);

select * from college_students;




select * from staff_master;

select count(*) from staff_master;

select sum(staff_sal) from staff_master;
select avg(staff_sal) from staff_master;

select max(staff_sal) from staff_master;

select min(staff_sal) from staff_master;

select dept_code,sum(staff_sal) as TotalSalary from staff_master GROUP BY dept_code;

select dept_code,count(*) as employecount from staff_master GROUP BY dept_code;


select dept_code,sum(staff_sal) as TotalSalary from staff_master GROUP BY dept_code HAVING sum(staff_sal)>50000;

select trunc(12.98786,3)

select round(12.9878)


select ceil(12.3)

select floor(12.9)

select abs(-25)

select power(2,3)

select sqrt(64)

select sign(-15)


select LOWER('HELLO');

select UPPER('hello');

select INITCAP('today is friday');

select concat('hello',' ', 'hi');

select SUBSTR('Postgressql',1,4);

select LTRIM('        Hello');

select RTRIM('        Hello          ');

select TRIM('        Hello          ');


select length('Postgressql');



select replace('java programming','java','python');

select LPAD('Hi',10,'*');

select RPAD('Hi',10,'*');


select POSITION('g' IN 'Postgres');


select current_date+interval '2 months'

select age('2026-05-15','01-01-2000');

select current_date;

select current_timestamp;

select extract(month from current_date);
select extract(day from current_date);

select extract(year from current_date);

select date_trunc('year',current_timestamp);


select to_char(current_date,'DD-MM-YYYY');



select to_date('15-05-2026','DD-MM-YYYY');

select to_number('1234','9999');

select to_timestamp('15-05-2026 10:30:45','DD-MM-YYYY HH24:MI:SS');





