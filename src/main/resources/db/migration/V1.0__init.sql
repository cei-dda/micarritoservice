CREATE TABLE items
(
	id BIGINT PRIMARY KEY,
	description VARCHAR(255),
	price INT
);

INSERT INTO items(id, description, price) VALUES (1, 'ITEM 1', 25);
INSERT INTO items(id, description, price) VALUES (2, 'ITEM 2', 35);