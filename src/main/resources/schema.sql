-- CREATE TABLE IF NOT EXISTS Employee (
--     id BIGINT PRIMARY KEY AUTO_INCREMENT,
--     name VARCHAR(255),
--     role VARCHAR(255)
-- );

CREATE TABLE IF NOT EXISTS Department (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(255)
);


CREATE TABLE IF NOT EXISTS Employee (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    role VARCHAR(255),
    department_id BIGINT,
    FOREIGN KEY (department_id) REFERENCES Department(id)
    );