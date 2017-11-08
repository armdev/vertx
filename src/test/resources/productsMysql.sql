DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT(
  id int(11) PRIMARY KEY AUTO_INCREMENT,
  description VARCHAR(1000)
);

INSERT INTO PRODUCT (description) VALUES ('product 1');
INSERT INTO PRODUCT (description) VALUES ('product 2');
INSERT INTO PRODUCT (description) VALUES ('product 3');
INSERT INTO PRODUCT (description) VALUES ('product 4');
