Create table b_ranch(branch_id number(5) primary key, branch_name varchar(10) not null, accounts varchar(20), balance number(20), address varchar(30)) 
desc b_ranch;

insert into b_ranch values('1', 'Sangli', 'current', '2000000', 'Sangli Kupwad')
insert into b_ranch values('2', 'Kagal', 'saving', '156000', 'Kagal Zenda chauk')
insert into b_ranch values('3', 'Pune', 'current', '999999', 'Pune Road 124')
insert into b_ranch values('4', 'Mumbai', 'saving', '1999902', 'Mumbai near srk house')
update b_ranch set branch_name ='kolhapur' where branch_id = '1'

delete from b_ranch where branch_id = '3'
SELECT* FROM b_ranch;

create table D_kte(fc_code Number(10) Primary key , Department_n Varchar(10) Not Null ,CET_P Number(5) Not null ,Phone_n Number (10) );
insert into D_kte values('14442','CSE','98.12','7242526210');
insert into D_kte values('14542','CSE-AI','95.12','7242556210');
insert into D_kte values('14642','ENTC','88.12','9242526210');
insert into D_kte values('14742','Mechanical','78.12','7242526210');
desc D_kte
select * from D_kte ;
update D_kte set CET_P='78.12' where fc_code = '14742';

//New

create table Bank(Branch Varchar(20) ,C_name Char(10) Not null, account_n varchar(10) Unique ,Balanace number(10) , City char(20) ,address varchar(10));

insert into B_ank values('Park Street ','Pushkar','A-978245','12000','Ichalkaranji','_');
insert into B_ank values('Park Street ','Ram','A-78246','0','Ichalkaranji','_');
insert into B_ank values('Perryridge ','Pratik','A-97246','10000','Ichalkaranji','_');
insert into B_ank values('Downtown ','Parth','A-97846','1000000','Ichalkaranji','_');
insert into B_ank values('Park Street ','Rishabh','A-101','100','Ichalkaranji','_');
insert into B_ank values('Park Street ','Om','A-215','100','Ichalkaranji','_');
insert into B_ank values('Park Street ','Shanti','A-981246','90','Ichalkaranji','_');


select * from B_ank ;
