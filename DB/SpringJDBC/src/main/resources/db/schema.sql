drop table ride if exists;

CREATE TABLE ride
(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL,
  DURATION INT NOT NULL
);

