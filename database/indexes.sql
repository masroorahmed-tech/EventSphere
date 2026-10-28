CREATE INDEX idx_events_organizer_id ON events(organizer_id);
CREATE INDEX idx_events_venue_id ON events(venue_id);
CREATE INDEX idx_tasks_event_id ON tasks(event_id);
CREATE INDEX idx_expenses_event_id ON expenses(event_id);
CREATE INDEX idx_participants_event_id ON participants(event_id);
CREATE INDEX idx_event_modules_event_id ON event_modules(event_id);
