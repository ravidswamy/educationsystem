create table courses (
	id		number,
	name		Varchar2(100),
	description	varchar2(500),
	introvideopath	varchar2(100),
	constraint courses_pk primary key (id )
);


create table instructors (
	id 		number,
	name		varchar2(100),
	picturepath	varchar2(100),
	shortbio	varchar2(500),
	courseid	number,
	constraint	instructors_pk primary key(id),
	constraint	course_instructor_fk foreign key (courseid) references courses(id)
) ;


create table syllabus (
	id		number,
	name		varchar2(100),
	htmlpath	varchar2(100),
	courseid	number,
	constraint	syllabus_pk primary key (id),
	constraint	course_syllabus_fk foreign key (courseid ) references courses(id)
) ;


create table subjects (
	id		number,
	name		varchar2(100),
	description	varchar2(500),
	syllabusid	number,				
	constraint subjects_pk primary key (id),
	constraint course_subject_fk foreign key ( syllabusid ) references syllabus(id)
) ;


create table lessons (
	id		number,
	objectives	varchar2(500),
	transcript	varchar2(100),
	subjectid	number,
	constraint	lessons_pk primary key (id),
	constraint	lesson_subject_fk foreign key ( subjectid ) references subjects(id)
) ;

create table lessonvideos (
	id		number,
	objectives	varchar2(500),
	videopath	varchar2(100),
	lessonid	number,
	constraint	lessonvideos_pk primary key (id),
	constraint	lesson_video_fk foreign key ( lessonid ) references lessons(id)
) ;


