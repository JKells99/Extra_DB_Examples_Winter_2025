CREATE TABLE Cat (
                     catId SERIAL PRIMARY KEY,
                     catName VARCHAR(255) NOT NULL,
                     catBreed VARCHAR(255) NOT NULL,
                     catAge INT NOT NULL,
                     catColor VARCHAR(255) NOT NULL,
                     catGender VARCHAR(50) NOT NULL
);