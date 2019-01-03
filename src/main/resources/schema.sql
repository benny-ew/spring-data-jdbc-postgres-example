CREATE TABLE PROJECT(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE TASK(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    color VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    project BIGINT NOT NULL,
    FOREIGN KEY (project) REFERENCES PROJECT(id)
);