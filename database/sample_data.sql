INSERT INTO users (full_name, email, password_hash, role) VALUES
('Alice Admin', 'admin@eventsphere.com', 'hash_admin', 'ADMIN'),
('Bob Organizer', 'organizer@eventsphere.com', 'hash_org', 'ORGANIZER');

INSERT INTO venues (name, location, capacity, venue_type) VALUES
('Grand Hall', 'Downtown', 300, 'Conference'),
('Sunset Lawn', 'City Park', 200, 'Wedding');

INSERT INTO events (title, description, event_type, start_time, end_time, venue_id, organizer_id) VALUES
('Tech Expo 2026', 'Technology conference', 'CONFERENCE', '2026-06-10 09:00:00', '2026-06-12 18:00:00', 1, 2),
('Ava & Sam Wedding', 'Wedding celebration', 'WEDDING', '2026-07-20 16:00:00', '2026-07-20 22:00:00', 2, 2);

INSERT INTO tasks (title, description, priority, status, event_id) VALUES
('Finalize agenda', 'Prepare conference agenda', 5, 'PENDING', 1),
('Arrange catering', 'Coordinate wedding catering', 4, 'IN_PROGRESS', 2);

INSERT INTO expenses (event_id, category, amount, description) VALUES
(1, 'Venue', 2500.00, 'Hall rental'),
(2, 'Catering', 1800.00, 'Wedding food service');

INSERT INTO participants (event_id, name, email, phone, role) VALUES
(1, 'Charlie Lee', 'charlie@demo.com', '1234567890', 'ATTENDEE'),
(2, 'Dana Stone', 'dana@demo.com', '0987654321', 'GUEST');

INSERT INTO event_modules (event_id, module_name, metadata) VALUES
(1, 'conference', '{"speaker_count": 15, "tracks": 3}'),
(2, 'wedding', '{"guest_count": 120, "theme": "Garden"}');
