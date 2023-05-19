-- CREATE TABLE Department (
--     id BIGINT PRIMARY KEY AUTO_INCREMENT,
--     name VARCHAR(255),
-- );

CREATE TABLE Department (
    did BIGINT PRIMARY KEY AUTO_INCREMENT,
    dName VARCHAR(255)
);


CREATE TABLE Employee (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    role VARCHAR(255),
    departmentId BIGINT,
    FOREIGN KEY (departmentId) REFERENCES Department(did)
);
