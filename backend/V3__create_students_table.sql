
CREATE TABLE students (
	student_id INT NOT NULL primary key auto_increment,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	email VARCHAR(255),
	phone VARCHAR(255),
	school_id INT DEFAULT NULL,
	constraint foreign key (school_id) references schools(school_id)
);
