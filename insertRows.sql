-- Courses 1 2 & 3
insert into courses values (1,'Course 1','Description of course 1', 'video path 1') ;
insert into courses values (2,'Course 2','Description of course 2', 'video path 2') ;
insert into courses values (3,'Course 3','Description of course 3', 'video path 3') ;
--

-- Instructors for Course 1
insert into instructors values (1,'Mr. John ( Course 1 ) ','picture','Short bio of Mr. John',1) ;
insert into instructors values (2,'Mr. Adam ( Course 1 ) ','picture','Short bio of Mr. Adam',1) ;
insert into instructors values (3,'Mr. Mike ( Course 1 ) ','picture','Short bio of Mr. Mike',1) ;

-- Instructors for Course 2
insert into instructors values (4,'Mr. Adam ( Course 2 ) ','picture','Short bio of Mr. Adam',2) ;
insert into instructors values (5,'Mr. Dan ( Course 2 ) ','picture','Short bio of Mr. Dan',2) ;
insert into instructors values (6,'Mr. Darren( Course 2 ) ','picture','Short bio of Mr.Darren',2) ;

-- Instructors for Course 3
insert into instructors values (7,'Mr. Steve( Course 3 ) ','picture','Short bio of Mr. Steve',3) ;
insert into instructors values (8,'Mr. Ross ( Course 3 ) ','picture','Short bio of Mr. Ross',3) ;
insert into instructors values (9,'Mr. Martin ( Course 3 ) ','picture','Short bio of Mr.Martin',3) ;
--

-- Syllabus for Course 1 2 & 3
insert into syllabus values(10,'Syllabus for Course 1','link for syllabus 1',1) ;
insert into syllabus values(11,'Syllabus for Course 2','link for syllabus 2',2) ;
insert into syllabus values(12,'Syllabus for Course 3','link for syllabus 3',3) ;
--


-- Subjects for Syllabus 1 ( Maths, Verbal & Non-Verbal )
insert into subjects values (13,'Maths','Description of Maths subject ( Course 1 ) ',10) ;
insert into subjects values (14,'Verbal','Description of Verbal subject ( Course 1 )',10) ;
insert into subjects values (15,'Non-Verbal','Description of Non-Verbal subject ( Course 1 )',10) ;

-- Subjects for Syllabus 2 ( Maths, Verbal & Non-Verbal )
insert into subjects values (16,'Maths','Description of Maths subject ( Course 2 )',11) ;
insert into subjects values (17,'Verbal','Description of Verbal subject ( Course 2 )',11) ;
insert into subjects values (18,'Non-Verbal','Description of Non-Verbal subject ( Course 2 )',11) ;

-- Subjects for Syllabus 3 ( Maths, Verbal & Non-Verbal )
insert into subjects values (19,'Maths','Description of Maths subject ( Course 3 )',12) ;
insert into subjects values (20,'Verbal','Description of Verbal subject ( Course 3 )',12) ;
insert into subjects values (21,'Non-Verbal','Description of Non-Verbal subject ( Course 3 )',12) ;
--


-- Lessons for Maths Course 1
insert into lessons values (22,'Objective for lesson 1 ( Subject Maths - Course 1 )','',13) ;
insert into lessons values (23,'Objective for lesson 2 ( Subject Maths - Course 1 )','',13) ;
insert into lessons values (24,'Objective for lesson 3 ( Subject Maths - Course 1 )','',13) ;

-- Lessons for Verbal Course 1
insert into lessons values (25,'Objective for lesson 1 ( Subject Verbal - Course 1 )','',14) ;
insert into lessons values (26,'Objective for lesson 2 ( Subject Verbal - Course 1 )','',14) ;
insert into lessons values (27,'Objective for lesson 3 ( Subject Verbal - Course 1 )','',14) ;

-- Lessons for Non-Verbal Course 1
insert into lessons values (28,'Objective for lesson 1 ( Subject Non-Verbal - Course 1 )','',15) ;
insert into lessons values (29,'Objective for lesson 2 ( Subject Non-Verbal - Course 1 )','',15) ;
insert into lessons values (30,'Objective for lesson 3 ( Subject Non-Verbal - Course 1 )','',15) ;

-- Lessons for Maths Course 2
insert into lessons values (31,'Objective for lesson 1 ( Subject Maths - Course 2 )','',16) ;
insert into lessons values (32,'Objective for lesson 2 ( Subject Maths - Course 2 )','',16) ;
insert into lessons values (33,'Objective for lesson 3 ( Subject Maths - Course 2 )','',16) ;

-- Lessons for Verbal Course 2
insert into lessons values (34,'Objective for lesson 1 ( Subject Verbal - Course 2 )','',17) ;
insert into lessons values (35,'Objective for lesson 2 ( Subject Verbal - Course 2 )','',17) ;
insert into lessons values (36,'Objective for lesson 3 ( Subject Verbal - Course 2 )','',17) ;

-- Lessons for Non-Verbal Course 2
insert into lessons values (37,'Objective for lesson 1 ( Subject Non-Verbal - Course 2 )','',18) ;
insert into lessons values (38,'Objective for lesson 2 ( Subject Non-Verbal - Course 2 )','',18) ;
insert into lessons values (39,'Objective for lesson 3 ( Subject Non-Verbal - Course 2 )','',18) ;

-- Lessons for Maths Course 3
insert into lessons values (40,'Objective for lesson 1 ( Subject Maths - Course 3 )','',19) ;
insert into lessons values (41,'Objective for lesson 2 ( Subject Maths - Course 3 )','',19) ;
insert into lessons values (42,'Objective for lesson 3 ( Subject Maths - Course 3 )','',19) ;

-- Lessons for Verbal Course 3
insert into lessons values (43,'Objective for lesson 1 ( Subject Verbal - Course 3 )','',20) ;
insert into lessons values (44,'Objective for lesson 2 ( Subject Verbal - Course 3 )','',20) ;
insert into lessons values (45,'Objective for lesson 3 ( Subject Verbal - Course 3 )','',20) ;

-- Lessons for Non-verbal Course 3 
insert into lessons values (46,'Objective for lesson 1 ( Subject Non-Verbal - Course 3 )','',21) ;
insert into lessons values (47,'Objective for lesson 2 ( Subject Non-Verbal - Course 3 )','',21) ;
insert into lessons values (48,'Objective for lesson 3 ( Subject Non-Verbal - Course 3 )','',21) ;


-- Videos for Lession 1 Maths Course 1
insert into lessonvideos values (49,'Video for for lesson 1 ( Subject Maths - Course 1 )','video path 1',22) ;
insert into lessonvideos values (50,'Video for for lesson 1 ( Subject Maths - Course 1 )','video path 2',22) ;
insert into lessonvideos values (51,'Video for for lesson 1 ( Subject Maths - Course 1 )','video path 3',22) ;

-- Videos for Lesson 2 Maths Course 1
insert into lessonvideos values (52,'Video for for lesson 2 ( Subject Maths - Course 1 )','video path 1',23) ;
insert into lessonvideos values (53,'Video for for lesson 2 ( Subject Maths - Course 1 )','video path 2',23) ;
insert into lessonvideos values (54,'Video for for lesson 2 ( Subject Maths - Course 1 )','video path 3',23) ;

-- Videos for Lesson 3 Maths Course 1
insert into lessonvideos values (55,'Video for for lesson 3 ( Subject Maths - Course 1 )','video path 1',24) ;
insert into lessonvideos values (56,'Video for for lesson 3 ( Subject Maths - Course 1 )','video path 2',24) ;
insert into lessonvideos values (57,'Video for for lesson 3 ( Subject Maths - Course 1 )','video path 3',24) ;

-- Videos for Lesson 1 Verbal Course 1
insert into lessonvideos values (58,'Video for for lesson 1 ( Subject Verbal - Course 1 )','video path 1',25) ;
insert into lessonvideos values (59,'Video for for lesson 1 ( Subject Verbal - Course 1 )','video path 2',25) ;
insert into lessonvideos values (60,'Video for for lesson 1 ( Subject Verbal - Course 1 )','video path 3',25) ;

-- Videos for Lesson 2 Verbal Course 1
insert into lessonvideos values (61,'Video for for lesson 2 ( Subject Verbal - Course 1 )','video path 1',26) ;
insert into lessonvideos values (62,'Video for for lesson 2 ( Subject Verbal - Course 1 )','video path 2',26) ;
insert into lessonvideos values (63,'Video for for lesson 2 ( Subject Verbal - Course 1 )','video path 3',26) ;

-- Videos for Lesson 3 Verbal Course 1
insert into lessonvideos values (64,'Video for for lesson 3 ( Subject Verbal - Course 1 )','video path 1',27) ;
insert into lessonvideos values (65,'Video for for lesson 3 ( Subject Verbal - Course 1 )','video path 2',27) ;
insert into lessonvideos values (66,'Video for for lesson 3 ( Subject Verbal - Course 1 )','video path 3',27) ;

-- Videos for Lesson 1 Non-Verbal Course 1
insert into lessonvideos values (67,'Video for for lesson 1 ( Subject Non-Verbal - Course 1 )','video path 1',28) ;
insert into lessonvideos values (68,'Video for for lesson 1 ( Subject Non-Verbal - Course 1 )','video path 2',28) ;
insert into lessonvideos values (69,'Video for for lesson 1 ( Subject Non-Verbal - Course 1  ','video path 3',28) ;


-- Videos for Lesson 2 Non-Verbal Course 1
insert into lessonvideos values (70,'Video for for lesson 2 ( Subject Non-Verbal - Course 1 )','video path 1',29) ;
insert into lessonvideos values (71,'Video for for lesson 2 ( Subject Non-Verbal - Course 1 )','video path 2',29) ;
insert into lessonvideos values (72,'Video for for lesson 2 ( Subject Non-Verbal - Course 1 )','video path 3',29) ;

-- Videos for Lesson 3 Non-Verbal Course 1
insert into lessonvideos values (73,'Video for for lesson 3 ( Subject Non-Verbal - Course 1 )','video path 1',30) ;
insert into lessonvideos values (74,'Video for for lesson 3 ( Subject Non-Verbal - Course 1 )','video path 2',30) ;
insert into lessonvideos values (75,'Video for for lesson 3 ( Subject Non-Verbal - Course 1 )','video path 3',30) ;



-- Videos for Lession 1 Maths Course 2
insert into lessonvideos values (76,'Video for for lesson 1 ( Subject Maths - Course 2 )','video path 1',31) ;
insert into lessonvideos values (77,'Video for for lesson 1 ( Subject Maths - Course 2 )','video path 2',31) ;
insert into lessonvideos values (78,'Video for for lesson 1 ( Subject Maths - Course 2 )','video path 3',31) ;

-- Videos for Lesson 2 Maths Course 2
insert into lessonvideos values (79,'Video for for lesson 2 ( Subject Maths - Course 2 )','video path 1',32) ;
insert into lessonvideos values (80,'Video for for lesson 2 ( Subject Maths - Course 2 )','video path 2',32) ;
insert into lessonvideos values (81,'Video for for lesson 2 ( Subject Maths - Course 2 )','video path 3',32) ;

-- Videos for Lesson 3 Maths Course 2
insert into lessonvideos values (82,'Video for for lesson 3 ( Subject Maths - Course 2 )','video path 1',33) ;
insert into lessonvideos values (83,'Video for for lesson 3 ( Subject Maths - Course 2 )','video path 2',33) ;
insert into lessonvideos values (84,'Video for for lesson 3 ( Subject Maths - Course 2 )','video path 3',33) ;

-- Videos for Lesson 1 Verbal Course 2
insert into lessonvideos values (85,'Video for for lesson 1 ( Subject Verbal - Course 2 )','video path 1',34) ;
insert into lessonvideos values (86,'Video for for lesson 1 ( Subject Verbal - Course 2 )','video path 2',34) ;
insert into lessonvideos values (87,'Video for for lesson 1 ( Subject Verbal - Course 2 )','video path 3',34) ;

-- Videos for Lesson 2 Verbal Course 2
insert into lessonvideos values (88,'Video for for lesson 2 ( Subject Verbal - Course 2 )','video path 1',35) ;
insert into lessonvideos values (89,'Video for for lesson 2 ( Subject Verbal - Course 2 )','video path 2',35) ;
insert into lessonvideos values (90,'Video for for lesson 2 ( Subject Verbal - Course 2 )','video path 3',35) ;

-- Videos for Lesson 3 Verbal Course 2
insert into lessonvideos values (91,'Video for for lesson 3 ( Subject Verbal - Course 2 )','video path 1',36) ;
insert into lessonvideos values (92,'Video for for lesson 3 ( Subject Verbal - Course 2 )','video path 2',36) ;
insert into lessonvideos values (93,'Video for for lesson 3 ( Subject Verbal - Course 2 )','video path 3',36) ;

-- Videos for Lesson 1 Non-Verbal Course 2
insert into lessonvideos values (94,'Video for for lesson 1 ( Subject Non-Verbal - Course 2 )','video path 1',37) ;
insert into lessonvideos values (95,'Video for for lesson 1 ( Subject Non-Verbal - Course 2 )','video path 2',37) ;
insert into lessonvideos values (96,'Video for for lesson 1 ( Subject Non-Verbal - Course 2 )','video path 3',37) ;


-- Videos for Lesson 2 Non-Verbal Course 2
insert into lessonvideos values (97,'Video for for lesson 2 ( Subject Non-Verbal - Course 2 )','video path 1',38) ;
insert into lessonvideos values (98,'Video for for lesson 2 ( Subject Non-Verbal - Course 2 )','video path 2',38) ;
insert into lessonvideos values (99,'Video for for lesson 2 ( Subject Non-Verbal - Course 2 )','video path 3',38) ;

-- Videos for Lesson 3 Non-Verbal Course 2
insert into lessonvideos values (100,'Video for for lesson 3 ( Subject Non-Verbal - Course 2 )','video path 1',39) ;
insert into lessonvideos values (101,'Video for for lesson 3 ( Subject Non-Verbal - Course 2 )','video path 2',39) ;
insert into lessonvideos values (102,'Video for for lesson 3 ( Subject Non-Verbal - Course 2 )','video path 3',39) ;



-- Videos for Lession 1 Maths Course 3
insert into lessonvideos values (103,'Video for for lesson 1 ( Subject Maths - Course 3 )','video path 1',40) ;
insert into lessonvideos values (104,'Video for for lesson 1 ( Subject Maths - Course 3 )','video path 2',40) ;
insert into lessonvideos values (105,'Video for for lesson 1 ( Subject Maths - Course 3 )','video path 3',40) ;

-- Videos for Lesson 2 Maths Course 3
insert into lessonvideos values (106,'Video for for lesson 2 ( Subject Maths - Course 3 )','video path 1',41) ;
insert into lessonvideos values (107,'Video for for lesson 2 ( Subject Maths - Course 3 )','video path 2',41) ;
insert into lessonvideos values (108,'Video for for lesson 2 ( Subject Maths - Course 3 )','video path 3',41) ;

-- Videos for Lesson 3 Maths Course 3
insert into lessonvideos values (109,'Video for for lesson 3 ( Subject Maths - Course 3 )','video path 1',42) ;
insert into lessonvideos values (110,'Video for for lesson 3 ( Subject Maths - Course 3 )','video path 2',42) ;
insert into lessonvideos values (111,'Video for for lesson 3 ( Subject Maths - Course 3 )','video path 3',42) ;

-- Videos for Lesson 1 Verbal Course 3
insert into lessonvideos values (112,'Video for for lesson 1 ( Subject Verbal - Course 3 )','video path 1',43) ;
insert into lessonvideos values (113,'Video for for lesson 1 ( Subject Verbal - Course 3 )','video path 2',43) ;
insert into lessonvideos values (114,'Video for for lesson 1 ( Subject Verbal - Course 3 )','video path 3',43) ;

-- Videos for Lesson 2 Verbal Course 3
insert into lessonvideos values (115,'Video for for lesson 2 ( Subject Verbal - Course 3 )','video path 1',44) ;
insert into lessonvideos values (116,'Video for for lesson 2 ( Subject Verbal - Course 3 )','video path 2',44) ;
insert into lessonvideos values (117,'Video for for lesson 2 ( Subject Verbal - Course 3 )','video path 3',44) ;

-- Videos for Lesson 3 Verbal Course 3
insert into lessonvideos values (118,'Video for for lesson 3 ( Subject Verbal - Course 3 )','video path 1',45) ;
insert into lessonvideos values (119,'Video for for lesson 3 ( Subject Verbal - Course 3  ','video path 2',45) ;
insert into lessonvideos values (120,'Video for for lesson 3 ( Subject Verbal - Course 3 )','video path 3',45) ;

-- Videos for Lesson 1 Non-Verbal Course 3
insert into lessonvideos values (121,'Video for for lesson 1 ( Subject Non-Verbal - Course 3 )','video path 1',46) ;
insert into lessonvideos values (122,'Video for for lesson 1 ( Subject Non-Verbal - Course 3 )','video path 2',46) ;
insert into lessonvideos values (123,'Video for for lesson 1 ( Subject Non-Verbal - Course 3 )','video path 3',46) ;


-- Videos for Lesson 2 Non-Verbal Course 3
insert into lessonvideos values (124,'Video for for lesson 2 ( Subject Non-Verbal - Course 3 )','video path 1',47) ;
insert into lessonvideos values (125,'Video for for lesson 2 ( Subject Non-Verbal - Course 3 )','video path 2',47) ;
insert into lessonvideos values (126,'Video for for lesson 2 ( Subject Non-Verbal - Course 3 )','video path 3',47) ;

-- Videos for Lesson 3 Non-Verbal Course 3
insert into lessonvideos values (127,'Video for for lesson 3 ( Subject Non-Verbal - Course 3 )','video path 1',48) ;
insert into lessonvideos values (128,'Video for for lesson 3 ( Subject Non-Verbal - Course 3 )','video path 2',48) ;
insert into lessonvideos values (129,'Video for for lesson 3 ( Subject Non-Verbal - Course 3 )','video path 3',48) ;

