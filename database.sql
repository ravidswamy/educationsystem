create sequence education_seq
	start 		with 1
	increment 	by   1
	nocache
	nocycle ;

--  
create table AppUser (
        id 					number,		
        userId				varchar2(40),
        password 			varchar2(25),
        firstname			varchar2(50),
        lastname			varchar2(50),
        gender				varchar2(1),
        age					number,
        dateofbirth			date,
        addressline1		varchar2(50),
        addressline2		varchar2(50),
        city				varchar2(50),
        county				varchar2(50),
        postcode			varchar2(10),
        countryId			varchar2(3),
        schoolname			varchar2(50),
        parentfirstname		varchar2(50),
        parentlastname		varchar2(50),
        parentcontactno		varchar2(12),
        parentrelation		varchar2(15),
        constraint appuser_pk primary key (id),
        constraint appuserId_uq unique(userId)
);

--  id is defined
-- 	1 = uk
-- 	2 = india
create table country (
	id						number,
	name					varchar2(50),
	constraint country_pk primary key (id)
);

--  id will be a sequence
create table avataar (
	id						number,
	countryid				number,
	name					varchar2(50),
	constraint avataar_pk primary key (id),
	constraint countryid_fk foreign key (countryid) references country(id)
);

--  id will be a sequence
create table difficulty (
	id						number,
	name					varchar2(50),
	constraint difficultyid_pk primary key (id)
);

--  id is defined
-- 	1 = objective
-- 	2 = comprehension
create table questiontype (
	id 						number,
	name					varchar2(100),
    constraint questiontype_pk primary key (id)
);

--  id will be a sequence
create table question (
	id						number,
	typeid					number,
	examtypeid				number,
	question				varchar2(100),
	difficultylevel			number,
	constraint questionid_pk primary key (id),
	constraint typeid_fk foreign key (typeid) references questiontype(id)
	constraint examtypeid_fk foreign key (examtypeid) references examtype(id)
);


create table examtype (
	id					number(3),
	name				varchar2(50),
	difficultylevel		number(2),
	noofquestions		number(3),
	deviationstart		number(3,2),
	deviationend		number(3,2),
	constraint examtype_pk primary key (id),
	constraint difficulty_fk foreign key (difficultylevel) references difficulty(id)
);

--  id will be a sequence
create table answer (
	id						number,
	questionid				number,
	answer					varchar2(1000),
	isright					number(1),
	constraint answerid_pk primary key (id),
	constraint questionid_fk foreign key (questionid) references question(id)
);

