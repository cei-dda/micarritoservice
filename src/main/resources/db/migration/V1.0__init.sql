CREATE TABLE items
(
	id BIGINT IDENTITY PRIMARY KEY,
	description VARCHAR(255),
	price INT
);

INSERT INTO items(description, price) VALUES ('ITEM 1', 25);
INSERT INTO items(description, price) VALUES ('ITEM 2', 35);

CREATE TABLE users
(
	id BIGINT IDENTITY PRIMARY KEY,
	firstname VARCHAR(255),
	lastname VARCHAR(255)
);

INSERT INTO users(firstname, lastname) VALUES ('pepe', 'gonzales');

CREATE TABLE documents
(
	id BIGINT IDENTITY PRIMARY KEY,
	created_date VARCHAR(255),
	user_id BIGINT NOT NULL,
	CONSTRAINT fk_document_user FOREIGN KEY (user_id) REFERENCES users(id)  
);

INSERT INTO documents(created_date, user_id) VALUES('1', 1);
INSERT INTO documents(created_date, user_id) VALUES('2', 1);

CREATE TABLE document_items
(
	document_id BIGINT NOT NULL,
	item_id BIGINT NOT NULL,
	CONSTRAINT fk_docitem_document FOREIGN KEY (document_id) REFERENCES documents(id),
	CONSTRAINT fk_docitem_item FOREIGN KEY (item_id) REFERENCES items(id)
);

INSERT INTO document_items(document_id, item_id) VALUES(1, 1);
INSERT INTO document_items(document_id, item_id) VALUES(1, 2);
INSERT INTO document_items(document_id, item_id) VALUES(2, 2);