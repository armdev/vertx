DROP TABLE IF EXISTS PRODUCT;
CREATE TABLE PRODUCT(
  id int(11) PRIMARY KEY AUTO_INCREMENT,
  description VARCHAR(1000),
  createTime datetime
);

INSERT INTO PRODUCT (description,createTime) VALUES ('productA 1',now());
INSERT INTO PRODUCT (description,createTime) VALUES ('productA 2',now());
INSERT INTO PRODUCT (description,createTime) VALUES ('productA 3',now());
INSERT INTO PRODUCT (description,createTime) VALUES ('productA 4',now());
