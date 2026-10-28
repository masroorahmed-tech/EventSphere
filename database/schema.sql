CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(30) DEFAULT 'USER'
);

CREATE TABLE venues (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(200) NOT NULL,
    capacity INTEGER NOT NULL,
    venue_type VARCHAR(50)
);

CREATE TABLE events (
    id SERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    description TEXT,
    event_type VARCHAR(50),
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP NOT NULL,
    venue_id INTEGER REFERENCES venues(id),
    organizer_id INTEGER REFERENCES users(id)
);

CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    description TEXT,
    priority INTEGER NOT NULL,
    status VARCHAR(30) DEFAULT 'PENDING',
    event_id INTEGER REFERENCES events(id)
);

CREATE TABLE expenses (
    id SERIAL PRIMARY KEY,
    event_id INTEGER REFERENCES events(id),
    category VARCHAR(50),
    amount DECIMAL(10,2) NOT NULL,
    description TEXT
);

CREATE TABLE participants (
    id SERIAL PRIMARY KEY,
    event_id INTEGER REFERENCES events(id),
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(30),
    role VARCHAR(50)
);

CREATE TABLE event_modules (
    id SERIAL PRIMARY KEY,
    event_id INTEGER REFERENCES events(id),
    module_name VARCHAR(100) NOT NULL,
    metadata JSONB
);
