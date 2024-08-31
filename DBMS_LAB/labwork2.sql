--LAB2 PRACTICE ASSIGNMENT:  

--1. Create a table EMPLOYEE with following schema: (Emp_no, E_name, E_address, E_ph_no, Dept_no, Dept_name,Job_id , Salary)  
--2. Add a new column; HIREDATE to the existing relation.  
--3. Change the datatype of JOB_ID from char to varchar2.  
--4. Change the name of column/field Emp_no to E_no.  
--5. Modify the column width of the job field of emp table  

create table E_mployee1 (emp_no decimal(5),e_name varchar(20),e_address varchar(40),e_phoneNo varchar(10),dept_no decimal(10),dept_name varchar(20),job_id char(10),salary decimal(15,2));
desc E_mployee1;

alter table E_mployee1 add (hireDate varchar(20));
desc E_mployee1;

alter table E_mployee1 modify (job_id varchar2(10));
desc E_mployee1;

alter table E_mployee1 rename column emp_no  to e_no;
desc E_mployee1;

alter table E_mployee1 modify (job_id varchar2(20));
desc E_mployee1;


--2. Create a table called EMP with the following structure. Name Type ---------- --------------------- EMPNO NUMBER (6) ENAME VARCHAR2 (20) JOB VARCHAR2 (10) DEPTNO NUMBER (3) SAL NUMBER (7,2)
--1. Allow NULL for all columns except ename and job.  
--2. Add constraints to check, while entering the empno value (i.e) empno > 100. 
--3. Define the field DEPTNO as unique.  
--4. Create a primary key constraint for the table(EMPNO). 
--5. Write queries to implement and practice constraints. 

create table E_mp1(empNo number(6),ename varchar2(20)not null,job varchar2(10)not null,deptNo number(3),sal number(7,2));
desc E_mp1;

alter table E_mp1 add constraints empNo1 check (empNo>100);
desc E_mp1;

alter table E_mp1 add constraints deptNo1 unique (deptNo);
desc E_mp1;

alter table E_mp1 modify empNo primary key ;
desc E_mp1;