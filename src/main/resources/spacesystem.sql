CREATE TABLE users(
                      id SERIAL PRIMARY KEY,
                      username VARCHAR(50) UNIQUE NOT NULL,
                      password VARCHAR(255) NOT NULL,
                      role VARCHAR(20) NOT NULL CHECK(role IN('COMMANDER','ASTRONAUT','ENGINEER'))


);

CREATE TABLE missions(
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         status VARCHAR(20) NOT NULL CHECK(status IN ('PLANNED','IN PROGRESS','COMPLETED'))
);

CREATE TABLE reports (
                         id SERIAL PRIMARY KEY,
                         user_id INT REFERENCES users(id),
                         mission_id INT REFERENCES missions(id),
                         report_text TEXT NOT NULL,
                         submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);