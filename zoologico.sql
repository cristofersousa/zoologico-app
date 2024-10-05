CREATE DATABASE zoologicoDB;

USE zoologicoDB;

CREATE TABLE animais (
                         id INT PRIMARY KEY AUTO_INCREMENT,
                         nome VARCHAR(50),
                         habitat VARCHAR(50),
                         alimentacao VARCHAR(50)
);
