create schema submission;

use submission;

CREATE TABLE consultant_detail (
  id INT PRIMARY KEY AUTO_INCREMENT,
  lead_id INT,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  email_address VARCHAR(255),
  phone_number VARCHAR(20)
);
INSERT INTO consultant_detail (lead_id, first_name, last_name, email_address, phone_number)
VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '1234567890'),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '9876543210'),
(3, 'David', 'Johnson', 'david.johnson@example.com', '5555555555'),
(4, 'Emily', 'Davis', 'emily.davis@example.com', '1111111111'),
(5, 'Michael', 'Wilson', 'michael.wilson@example.com', '9999999999');

CREATE TABLE lead_detail (
  id INT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  email_address VARCHAR(255),
  phone_number VARCHAR(20)
);
INSERT INTO lead_detail (first_name, last_name, email_address, phone_number)
VALUES
('Robert', 'Brown', 'robert.brown@example.com', '4444444444'),
('Laura', 'Lee', 'laura.lee@example.com', '7777777777'),
('Daniel', 'Taylor', 'daniel.taylor@example.com', '2222222222'),
('Olivia', 'Anderson', 'olivia.anderson@example.com', '6666666666'),
('Sophia', 'Moore', 'sophia.moore@example.com', '8888888888');

CREATE TABLE submission_update (
  id INT PRIMARY KEY AUTO_INCREMENT,
  submission_id INT,
  update_text TEXT,
  created_date DATE
);
INSERT INTO submission_update (submission_id, update_text, created_date)
VALUES
(1, 'Update 1 for submission 1', '2023-07-01'),
(1, 'Update 2 for submission 1', '2023-07-05'),
(2, 'Update 1 for submission 2', '2023-07-02'),
(3, 'Update 1 for submission 3', '2023-07-03'),
(4, 'Update 1 for submission 4', '2023-07-06');

CREATE TABLE submission (
  id INT PRIMARY KEY AUTO_INCREMENT,
  consultant_id INT,
  submission_date DATE,
  vendor_company VARCHAR(255),
  vendor_name VARCHAR(255),
  vendor_email_address VARCHAR(255),
  vendor_phone_number VARCHAR(20),
  implementation_partner VARCHAR(255),
  client_name VARCHAR(255),
  pay_rate DECIMAL(10, 2),
  submission_status VARCHAR(255),
  submission_type VARCHAR(255),
  city VARCHAR(255),
  state VARCHAR(255),
  zip VARCHAR(10)
);
INSERT INTO submission (consultant_id, submission_date, vendor_company, vendor_name, vendor_email_address, vendor_phone_number, implementation_partner, client_name, pay_rate, submission_status, submission_type, city, state, zip)
VALUES
(1, '2023-07-01', 'Vendor Company A', 'Vendor A', 'vendorA@example.com', '1111111111', 'Implementation Partner A', 'Client A', 100.00, 'Submitted', 'Type A', 'City A', 'State A', '12345'),
(2, '2023-07-02', 'Vendor Company B', 'Vendor B', 'vendorB@example.com', '2222222222', 'Implementation Partner B', 'Client B', 120.00, 'Submitted', 'Type B', 'City B', 'State B', '23456'),
(3, '2023-07-03', 'Vendor Company C', 'Vendor C', 'vendorC@example.com', '3333333333', 'Implementation Partner C', 'Client C', 150.00, 'Submitted', 'Type A', 'City C', 'State C', '34567'),
(4, '2023-07-04', 'Vendor Company D', 'Vendor D', 'vendorD@example.com', '4444444444', 'Implementation Partner D', 'Client D', 110.00, 'Submitted', 'Type B', 'City D', 'State D', '45678'),
(5, '2023-07-05', 'Vendor Company E', 'Vendor E', 'vendorE@example.com', '5555555555', 'Implementation Partner E', 'Client E', 130.00, 'Submitted', 'Type A', 'City E', 'State E', '56789');
ALTER TABLE submission
ADD lead_id INT;

select * from consultant_detail;

select * from lead_detail;

select * from submission;

CREATE TABLE Employee (
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  job_start_date DATE,
  salary DECIMAL(10, 2)
);

select * from Employee;

ALTER TABLE Employee
ADD department VARCHAR(255);

INSERT INTO Employee (first_name, last_name, job_start_date, salary, department)
VALUES ('John', 'Doe', '2022-01-15', 5000.00, 'Sales');

INSERT INTO Employee (first_name, last_name, job_start_date, salary, department)
VALUES ('Tom', 'Cruise', '2021-01-12', 500.00, 'Retail');

INSERT INTO Employee (first_name, last_name, job_start_date, salary, department)
VALUES ('Mary', 'Elizabeth', '2015-01-15', 50000.00, 'Insurance');

INSERT INTO Employee (first_name, last_name, job_start_date, salary, department)
VALUES ('Margot', 'Robbie', '2018-01-15', 10000.00, 'Banking');

select * from Employee;

SELECT MAX(salary) AS highest_salary
FROM Employee;


SELECT *
FROM Employee
WHERE job_start_date >= DATE_SUB(CURDATE(), INTERVAL 6 MONTH);

SELECT department, COUNT(*) AS employee_count
FROM Employee
GROUP BY department;

UPDATE submission
SET vendor_email_address = 'john.doe@example.com'
WHERE vendor_name = 'Vendor B';


UPDATE consultant_detail
SET email_address = 'srikaru@cis.com'
WHERE first_name = 'John' AND last_name = 'Doe';

SELECT c.id AS consultant_id, CONCAT(c.first_name, ' ', c.last_name) AS consultant_name, COUNT(s.id) AS total_submissions
FROM consultant_detail c
LEFT JOIN submission s ON c.id = s.consultant_id
GROUP BY c.id, consultant_name;

SELECT c.id AS consultant_id, CONCAT(c.first_name, ' ', c.last_name) AS consultant_name, s.submission_date, COUNT(s.id) AS total_submissions
FROM consultant_detail c
JOIN submission s ON c.id = s.consultant_id
GROUP BY c.id, consultant_name, s.submission_date;

DELETE FROM submission
WHERE pay_rate IS NULL;

SELECT *
FROM submission
WHERE client_name = 'Client C' AND submission_date = '2023-07-03';

SELECT lead_id, COUNT(*) AS num_submissions
FROM submission
GROUP BY lead_id;



