-- INSERT INTO Employee (name, role) VALUES ('John Doe', 'Software Engineer');
-- INSERT INTO Employee (name, role) VALUES ('Jane Doe', 'Data Scientist');
-- INSERT INTO Employee (name, role) VALUES ('Bob Smith', 'Product Manager');


INSERT INTO Department (name) VALUES ('Engineering');
INSERT INTO Department (name) VALUES ('Data Science');
INSERT INTO Department (name) VALUES ('Product Management');

INSERT INTO Employee (name, role, department_id) VALUES ('John Doe', 'Software Engineer', 1);
INSERT INTO Employee (name, role, department_id) VALUES ('Jane Doe', 'Data Scientist', 2);
INSERT INTO Employee (name, role, department_id) VALUES ('Bob Smith', 'Product Manager', 3);
