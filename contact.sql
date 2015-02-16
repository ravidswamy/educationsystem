CREATE TABLE CONTACTS
(
    id           NUMBER,
    firstname    VARCHAR2(30),
    lastname    VARCHAR2(30),
    telephone   VARCHAR2(15),
    email         VARCHAR2(30),
    constraint contact_pk primary key (id)
);