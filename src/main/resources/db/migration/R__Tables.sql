CREATE TABLE IF NOT EXISTS wage (
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    payment FLOAT(7,2),
    payment_date DATE,
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS pocket_category (
    category VARCHAR(20),
    PRIMARY KEY (category)
);

CREATE TABLE IF NOT EXISTS pocket_type (
    type VARCHAR(20),
    PRIMARY KEY (type)
);

CREATE TABLE IF NOT EXISTS pocket (
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR (100),
    category VARCHAR(20),
    type VARCHAR(20),
    target FLOAT(7,2),
    amount FLOAT(7,2),
    due_date DATE,
    last_updated DATE,

    PRIMARY KEY (id),
    FOREIGN KEY (category)
        REFERENCES pocket_category(category),
    FOREIGN KEY (type)
        REFERENCES pocket_type(type)
);

CREATE TABLE IF NOT EXISTS debt_type (
    type VARCHAR(20),
    PRIMARY KEY (type)
);

CREATE TABLE IF NOT EXISTS debt (
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    debt_type VARCHAR(20),
    amount FLOAT(7,2),
    PRIMARY KEY (id),
    FOREIGN KEY (debt_type)
        REFERENCES debt_type (type)
);

CREATE TABLE IF NOT EXISTS expense (
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    cost FLOAT(7,2),
    payed BIT NOT NULL DEFAULT 0,

    PRIMARY KEY (id)
);
