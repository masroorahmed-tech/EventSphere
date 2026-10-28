ALTER TABLE events
    ADD CONSTRAINT chk_event_dates CHECK (end_time > start_time);

ALTER TABLE tasks
    ADD CONSTRAINT chk_task_priority CHECK (priority BETWEEN 1 AND 5);

ALTER TABLE expenses
    ADD CONSTRAINT chk_expense_amount CHECK (amount >= 0);

ALTER TABLE users
    ADD CONSTRAINT chk_user_role CHECK (role IN ('ADMIN', 'ORGANIZER', 'USER'));
