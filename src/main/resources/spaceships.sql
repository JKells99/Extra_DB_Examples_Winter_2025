CREATE TABLE spaceships (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(100) NOT NULL,
                            model VARCHAR(50),
                            year_built INT CHECK (year_built > 0),
                            crew_capacity INT CHECK (crew_capacity >= 0),
                            status VARCHAR(50) CHECK (status IN ('Active', 'Inactive'))
);