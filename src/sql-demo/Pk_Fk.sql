-- PKs uniquely identify each row. FKs create relationships between tables.
--
-- TABLE: departments
-- dept_id 🔑	dept_name	  country
-- D001	        Engineering	    USA
-- D002	        Marketing	    India
-- D003	        Finance	        Germany
-- 🔑 = Primary Key  |  🔗 = Foreign Key

-- TABLE: employees
-- emp_id 🔑	   name	           country	 dept_id🔗  salary
-- E001	        Alice Chen	        USA	        D001	120000
-- E002	        Raj Patel	        India	    D002	85000
-- E003	        Hans Müller	        Germany	    D003	95000
-- E004	        Yuki Tanaka	        Japan	    D001	110000
-- 🔑 = Primary Key  |  🔗 = Foreign Key
-- SQL DDL
CREATE TABLE departments (
         dept_id   VARCHAR(10) PRIMARY KEY,  -- PK: unique identifier
         dept_name VARCHAR(50),
         country   VARCHAR(50)
);

CREATE TABLE employees (
           emp_id  VARCHAR(10) PRIMARY KEY,    -- PK: unique per employee
           name    VARCHAR(100),
           country VARCHAR(50),
           dept_id VARCHAR(10),
           salary  DECIMAL(10,2),
           FOREIGN KEY (dept_id)               -- FK: links to departments
               REFERENCES departments(dept_id)
               ON DELETE CASCADE
);

-- 💡 dept_id in employees is a FK referencing departments.dept_id.
-- If a department is deleted, its employees are also removed (CASCADE).
