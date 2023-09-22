
CREATE TABLE IF NOT EXISTS tasks (task_id INT AUTO_INCREMENT PRIMARY KEY,title VARCHAR(255) NOT NULL,start_date DATE,due_date DATE,status TINYINT NOT NULL,priority TINYINT NOT NULL,description TEXT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;

insert into tasks (title,start_date,due_date,status,priority,description)values('Add driver to the pom.xml','2023-09-22','2023-09-25',0,1,'updating drivers to the class path');
insert into tasks (title,start_date,due_date,status,priority,description)values('Load jdbc class to the program','2023-09-22','2023-09-25',0,2,'Load jdbc class to the program');
insert into tasks (title,start_date,due_date,status,priority,description)values('Obtain connection','2023-09-22','2023-09-25',0,3,'Obtain connection');
insert into tasks (title,start_date,due_date,status,priority,description)values('Execute queries','2023-09-22','2023-09-25',0,4,'Execute queries');



insert into tasks (title,start_date,due_date,status,priority,description)values(?,?,?,?,?,?);

SELECT * from tasks;