CREATE TABLE Branc_h (
    branch_name VARCHAR2(50) PRIMARY KEY,
    assets NUMBER(15,2)
);

CREATE TABLE Accoun_t (
    account_number VARCHAR2(10) PRIMARY KEY,
    branch_name VARCHAR2(50),
    balance NUMBER(15,2),
    FOREIGN KEY (branch_name) REFERENCES Branc_h(branch_name)
);
CREATE TABLE Custome_r (
    customer_name VARCHAR2(50),
    street VARCHAR2(50),
    city VARCHAR2(50)
);

CREATE TABLE Loa_n (
    loan_number VARCHAR2(10) PRIMARY KEY,
    branch_name VARCHAR2(50),
    amount NUMBER(10,2),
    FOREIGN KEY (branch_name) REFERENCES Branc_h(branch_name)
);
-- Inserting records
INSERT INTO Branc_h (branch_name, assets) VALUES ('Park Street', 0);
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-978245', 'Park Street', 12000);
INSERT INTO Custome_r (customer_name, street, city) VALUES ('Ram', 'Main Street', 'Ichalkaranji');

-- Insert branches
INSERT INTO Branc_h (branch_name, assets) VALUES ('Perryridge', 3000);
INSERT INTO Branc_h (branch_name, assets) VALUES ('Downtown', 5000);
INSERT INTO Branc_h (branch_name, assets) VALUES ('North Park', 4000);
INSERT INTO Branc_h (branch_name, assets) VALUES ('Brighton', 6000);

-- Insert accounts
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-101', 'Park Street', 1500);
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-102', 'Perryridge', 500);
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-103', 'Downtown', 800);
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-104', 'North Park', 1200);
INSERT INTO Accoun_t (account_number, branch_name, balance) VALUES ('A-105', 'Brighton', 700);

-- Insert customers
INSERT INTO Custome_r (customer_name, street, city) VALUES ('John', 'Second Street', 'Downtown');
INSERT INTO Custome_r (customer_name, street, city) VALUES ('Mary', 'Third Street', 'North Park');
INSERT INTO Custome_r (customer_name, street, city) VALUES ('Alice', 'Fourth Street', 'Brighton');
INSERT INTO Custome_r (customer_name, street, city) VALUES ('Bob', 'Fifth Street', 'Park Street');

-- Insert loans
INSERT INTO Loa_n (loan_number, branch_name, amount) VALUES ('L-201', 'Park Street', 15000);
INSERT INTO Loa_n (loan_number, branch_name, amount) VALUES ('L-202', 'Perryridge', 20000);
INSERT INTO Loa_n (loan_number, branch_name, amount) VALUES ('L-203', 'Downtown', 5000);
INSERT INTO Loa_n (loan_number, branch_name, amount) VALUES ('L-204', 'North Park', 1000);
INSERT INTO Loa_n (loan_number, branch_name, amount) VALUES ('L-205', 'Brighton', 30000);

-- Updates
UPDATE Branc_h SET assets = 3400 WHERE branch_name = 'Perryridge';
UPDATE Accoun_t SET balance = balance * 1.02 WHERE balance <= 500;
UPDATE Accoun_t SET branch_name = 'Downtown' WHERE branch_name = 'Perryridge';
UPDATE Loa_n SET branch_name = 'Downtown' WHERE branch_name = 'Perryridge';
UPDATE Accoun_t SET balance = balance - 100 WHERE account_number = 'A-101';
UPDATE Accoun_t SET balance = balance + 100 WHERE account_number = 'A-215';

-- Deletes
DELETE FROM Branc_h WHERE branch_name = 'Perryridge';
DELETE FROM Custome_r WHERE city = 'Downtown';

-- Selecting records

SELECT branch_name, assets FROM Branc_h ;

SELECT * FROM Loa_n WHERE amount > 1000;

SELECT * FROM Accoun_t WHERE balance < 700;

SELECT * FROM Accoun_t WHERE branch_name = 'Perryridge' AND balance < 1000;

SELECT DISTINCT branch_name FROM Loa_n ;

SELECT loan_number FROM Loa_n WHERE branch_name = 'Park Street' AND amount > 10000;

SELECT loan_number FROM Loa_n WHERE amount BETWEEN 10000 AND 50000;

SELECT customer_name FROM Custome_r ;

SELECT DISTINCT branch_name FROM Loa_n ;

SELECT * FROM Branc_h ;

SELECT account_number FROM Accoun_t WHERE balance > 700;

SELECT account_number, balance FROM Accoun_t WHERE branch_name = 'Brighton' AND balance > 800;

SELECT branch_name, assets / 1000 AS "assets in thousands" FROM Branc_h ;

SELECT branch_name FROM Branc_h WHERE assets BETWEEN 1000000 AND 4000000;

SELECT customer_name FROM Custome_r WHERE street LIKE '%Main%';

SELECT * FROM Accoun_t WHERE branch_name LIKE 'C_a%';

SELECT * FROM Accoun_t WHERE branch_name LIKE '_a%' AND LENGTH(branch_name) >= 3;

SELECT loan_number FROM Loa_n WHERE amount IS NULL;


