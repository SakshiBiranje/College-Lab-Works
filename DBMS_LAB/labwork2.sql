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
