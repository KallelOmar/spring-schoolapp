create database school_db;
grant all privileges on school_db.* to 'root'@'localhost' with grant option;

create table CLASS (
    id BIGINT NOT NULL AUTO_INCREMENT,
    level INT NOT NULL,
    arrange INT NOT NULL,
    PRIMARY KEY (id)
);

create table MATTER (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	coefficient INT NOT NULL,
	PRIMARY KEY(id)
);

create table TEACHER (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
    matterId BIGINT NOT NULL,
	PRIMARY KEY(id),
	constraint matterforeign foreign key (matterId) REFERENCES MATTER(id)
);

create table CLASS_TEACHER (
	class BIGINT NOT NULL,
	teacher BIGINT NOT NULL,
	PRIMARY KEY (teacher, class),
	CONSTRAINT classforeign foreign key (class) REFERENCES CLASS(id),
	CONSTRAINT teacherforeign foreign key (teacher) REFERENCES TEACHER(id)
);

create table STUDENT (
	id BIGINT NOT NULL AUTO_INCREMENT,
	name VARCHAR(30) NOT NULL,
	classId BIGINT NOT NULL,
	PRIMARY KEY (id),
	CONSTRAINT classstudentforeign foreign key (classId) REFERENCES CLASS(id)
);


INSERT INTO CLASS(level,arrange) VALUES(1,1);
INSERT INTO CLASS(level,arrange) VALUES(1,2);
INSERT INTO CLASS(level,arrange) VALUES(1,3);
INSERT INTO CLASS(level,arrange) VALUES(2,1);
INSERT INTO CLASS(level,arrange) VALUES(2,2);
INSERT INTO CLASS(level,arrange) VALUES(3,1);
INSERT INTO CLASS(level,arrange) VALUES(3,2);
INSERT INTO CLASS(level,arrange) VALUES(3,3);
INSERT INTO CLASS(level,arrange) VALUES(4,1);
INSERT INTO CLASS(level,arrange) VALUES(4,2);
INSERT INTO CLASS(level,arrange) VALUES(4,3);
INSERT INTO CLASS(level,arrange) VALUES(4,4);

INSERT INTO MATTER(name,coefficient) VALUES('Arabic',4);
INSERT INTO MATTER(name,coefficient) VALUES('Math',3);
INSERT INTO MATTER(name,coefficient) VALUES('French',2);
INSERT INTO MATTER(name,coefficient) VALUES('English',4);
INSERT INTO MATTER(name,coefficient) VALUES('Physics',3);
INSERT INTO MATTER(name,coefficient) VALUES('Computerscience',3);

INSERT INTO TEACHER(name,matterId) values('Mohamed',1);
INSERT INTO TEACHER(name,matterId) values('Amin',2);
INSERT INTO TEACHER(name,matterId) values('Salma',3);
INSERT INTO TEACHER(name,matterId) values('Abd Alrahim',4);
INSERT INTO TEACHER(name,matterId) values('Feten',6);
INSERT INTO TEACHER(name,matterId) values('Anis',5);
INSERT INTO TEACHER(name,matterId) values('Mouna',1);
INSERT INTO TEACHER(name,matterId) values('Omar',2);
INSERT INTO TEACHER(name,matterId) values('Samir',4);
INSERT INTO TEACHER(name,matterId) values('Abd Alfatteh',3);

INSERT INTO STUDENT(name,classId) values('Amin',4);
INSERT INTO STUDENT(name,classId) values('Akram',2);
INSERT INTO STUDENT(name,classId) values('Emna',7);
INSERT INTO STUDENT(name,classId) values('Youssef',11);
INSERT INTO STUDENT(name,classId) values('Maryam',5);
INSERT INTO STUDENT(name,classId) values('Ines',1);
INSERT INTO STUDENT(name,classId) values('Ahmed',6);