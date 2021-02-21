
CREATE TABLE students (
	student_id INT NOT NULL primary key auto_increment,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	enter_date DATE DEFAULT '2020-02-21',
	email VARCHAR(255) DEFAULT 'springxyzabc@gmail.com',
	phone VARCHAR(255) DEFAULT '22125144',
	school_id INT DEFAULT NULL
);
