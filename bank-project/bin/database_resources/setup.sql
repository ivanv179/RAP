-- drop tables if exists
DROP TABLE IF EXISTS customer CASCADE;
DROP TABLE IF EXISTS employee CASCADE;
DROP TABLE IF EXISTS account CASCADE;
DROP TABLE IF EXISTS bank CASCADE;
DROP TABLE IF EXISTS "transaction" CASCADE;
DROP TABLE IF EXISTS customer_account CASCADE;


-- customer table
CREATE TABLE IF NOT EXISTS customer(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	username VARCHAR(100), 
	psword VARCHAR(100),
	bank_id INTEGER
);

-- employee table
CREATE TABLE IF NOT EXISTS employee(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(100),
	last_name VARCHAR(100),
	username VARCHAR(100), 
	psword VARCHAR(100),
	bank_id INTEGER
);

-- account table
CREATE TABLE IF NOT EXISTS account(
	id SERIAL PRIMARY KEY,
	actType VARCHAR(50),
	balance MONEY,
	transaction_id INTEGER
);

-- many-to-many relationship
CREATE TABLE IF NOT EXISTS customer_account(
	customer_id INTEGER REFERENCES customer(id),
	account_id INTEGER REFERENCES account(id),
	PRIMARY KEY (customer_id, account_id)
);

-- bank table
CREATE TABLE IF NOT EXISTS bank(
	id SERIAL PRIMARY KEY,
	name_of VARCHAR(100),
	address VARCHAR(100)	
);

-- one-to-many relationship
ALTER TABLE customer
ADD CONSTRAINT customer_bank_fkey
FOREIGN KEY (bank_id)
REFERENCES bank(id);

-- one-to-many relationship
ALTER TABLE employee
ADD CONSTRAINT employee_bank_fkey
FOREIGN KEY (bank_id)
REFERENCES bank(id);

-- transaction table
CREATE TABLE IF NOT EXISTS "transaction"(
	id SERIAL PRIMARY KEY,
	trans_type VARCHAR(50),
	trans_date DATE,
	amount MONEY
);

-- one-to-many relationship
ALTER TABLE account
ADD CONSTRAINT account_transaction_fkey
FOREIGN KEY (transaction_id)
REFERENCES "transaction"(id);