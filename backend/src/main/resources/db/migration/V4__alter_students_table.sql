
ALTER TABLE students
ADD FOREIGN KEY (school_id) REFERENCES schools(school_id);
