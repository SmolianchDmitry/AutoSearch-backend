CREATE TABLE brand (
    id   SERIAL       NOT NULL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE model (
    id SERIAL NOT NULL PRIMARY KEY,
    brand_id INT NOT NULL,
    name  VARCHAR(255) NOT NULL,
    CONSTRAINT fk_model_brand_id FOREIGN KEY (brand_id) REFERENCES brand (id)

);