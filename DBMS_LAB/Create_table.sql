Create table b_ranch(branch_id number(5) primary key, branch_name varchar(10) not null, accounts varchar(20), balance number(20), address varchar(30)) 
desc b_ranch;

insert into b_ranch values('1', 'Sangli', 'current', '2000000', 'Sangli Kupwad')
insert into b_ranch values('2', 'Kagal', 'saving', '156000', 'Kagal Zenda chauk')
insert into b_ranch values('3', 'Pune', 'current', '999999', 'Pune Road 124')
insert into b_ranch values('4', 'Mumbai', 'saving', '1999902', 'Mumbai near srk house')
update b_ranch set branch_name ='kolhapur' where branch_id = '1'

delete from b_ranch where branch_id = '3'
SELECT* FROM b_ranch;