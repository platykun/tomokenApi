DROP TABLE USER;

CREATE TABLE IF NOT EXISTS USER ( ID INT NOT NULL AUTO_INCREMENT, USERNAME VARCHAR(20), PASSWORD VARCHAR(20), EMAIL VARCHAR(20));
INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES ('username', 'password', 'test1@test.co.jp');
INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES ('test', 'password', 'test2@test.co.jp');