BEGIN TRANSACTION;

CREATE TABLE employees
(
        employee_id SERIAL PRIMARY KEY NOT NULL,
        title VARCHAR(20),
        first_name VARCHAR (20),
        last_name VARCHAR (20),
        gender VARCHAR (10),
        birthday DATE,
        hire_date DATE,
        dept_id integer
        );
        
CREATE TABLE projects
(
        project_id SERIAL PRIMARY KEY NOT NULL,
        project_name VARCHAR (30),
        start_date DATE
        );

CREATE TABLE employee_projects
(
        employee_id INTEGER REFERENCES employees (employee_id),
        project_id INTEGER REFERENCES projects (project_id)
        );

CREATE TABLE departments
(
        dept_id SERIAL PRIMARY KEY NOT NULL,
        dept_name VARCHAR (30)
        );
        
CREATE TABLE employee_departments
(
        employee_id INTEGER REFERENCES employees (employee_id),
        dept_id INTEGER REFERENCES departments (dept_id)
        );
        
COMMIT TRANSACTION;

ROLLBACK;



