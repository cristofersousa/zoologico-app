CREATE DATABASE zoologicoDB;

USE zoologicoDB;

CREATE TABLE animais (
         id INT PRIMARY KEY AUTO_INCREMENT,
         nome VARCHAR(50),
         habitat VARCHAR(50),
         alimentacao VARCHAR(50)
);

INSERT INTO animais values (11, "coruja", "floresta", "pequenos roedores e sementes")
INSERT INTO animais values (12,  "lobo guará", "pampas", "pequenos roedores e frutas")
