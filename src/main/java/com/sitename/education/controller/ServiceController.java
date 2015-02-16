package com.sitename.education.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sitename.education.dao.CourseDao;
import com.sitename.education.dao.CourseDaoImpl;
import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.InstructorEntity;
import com.sitename.education.entity.SubjectEntity;
import com.sitename.education.entity.SyllabusEntity;
import com.sitename.education.service.CourseService;
import com.sitename.education.service.CourseServiceImpl;
import com.sitename.education.service.InstructorService;
import com.sitename.education.service.SubjectService;
import com.sitename.education.service.SyllabusService;

// Adding to git repo
// checking with vim 

@Controller
@RequestMapping( value ="/service")
public class ServiceController {

	@Autowired
	private CourseService courseService ;
	
	@Autowired
	private InstructorService instructorService ;
	
	@Autowired
	private SyllabusService syllabusService ;
	
	@Autowired
	private SubjectService subjectService ;
	
	@RequestMapping( value = "/getQuestions/{type}/{type2}", method=RequestMethod.GET )
	public ModelAndView getQuestions(@PathVariable(value="type") String type, @PathVariable(value="type2") String type2) {
		System.out.println("Entered the service method : "  + type + " " + type2) ;
		return new ModelAndView("home") ;
	}
		

	// Methods for Courses
	@RequestMapping(value = "/getAllCourses", method=RequestMethod.GET)
	public List<CourseEntity> getAllCourses() {

		System.out.println("Inside the CourseService method : ") ;
		List<CourseEntity> courses = courseService.getAllCourses() ;
		System.out.println("No of courses : " + courses.size()) ;
		/* Iterator courseIterator = courses.iterator() ;
		while ( courseIterator.hasNext() ) {
			 CourseEntity course = ( CourseEntity ) courseIterator.next() ;
			 System.out.println("Course id, name : " + course.getId() + "--" + course.getName()) ;
			 System.out.println("No of instructors : " +  course.getInstructors().size() );
			 System.out.println("No of syllabus : " +  course.getSyllabus().size());
		} */
		
		return courses ;
	}

	@RequestMapping( value = "/getCourse/{id}", method=RequestMethod.GET)
	public void getCourseDetailFromId ( @PathVariable( value = "id") long id ) {
		
		System.out.println("Calling getCourseById") ;
		CourseEntity courseEntity = courseService.getCourseById(id) ;
		System.out.println("return from call ") ;
		System.out.println("Course name : " + courseEntity.getName()) ;
		
		Set<InstructorEntity> instructors = courseEntity.getInstructors() ;
		
		Iterator iterator = instructors.iterator() ;
		System.out.println("Instructors for the course : " + courseEntity.getName()) ;
		while ( iterator.hasNext()) {
			InstructorEntity instructor = ( InstructorEntity ) iterator.next() ;
			System.out.println("Instructor Id, Name : " + instructor.getId() + "--" + instructor.getName()) ;
		}
	}
	
	
	// Methods for Instuctors
	@RequestMapping(value = "/getAllInstructors", method=RequestMethod.GET)
	public void getAllInstructors() {

		System.out.println("Inside the CourseService method getAllInstructors : ") ;
		List<InstructorEntity> instructors = null ;
		
		try {
			instructors = instructorService.getAllInstructors() ;
			System.out.println("No of Instructors : " + instructors.size()) ;
		} catch ( Exception e) {
			System.out.println("Error while call getAllInstructors : " +e.toString() ) ;
			//
		}
		Iterator instructorIterator = instructors.iterator() ;
		while ( instructorIterator.hasNext() ) {
			 InstructorEntity instructor = ( InstructorEntity ) instructorIterator.next() ;
			 System.out.println("Instructor Id, Name :  " + instructor.getId() + "--" + instructor.getName());
			
		}
	}
	
	@RequestMapping( value = "/getInstructor/{id}", method=RequestMethod.GET)
	public void getInstructorDetailFromId ( @PathVariable( value = "id") long id ) {
		
		System.out.println("Calling getInstructorById") ;
		InstructorEntity instructorEntity = instructorService.getInstructorById(id) ;
		System.out.println("Instructor name : " + instructorEntity.getName()) ;
		
	}	
	
	@RequestMapping( value = "/getInstructorsByCourseId/{courseId}", method=RequestMethod.GET) 
	public List<InstructorEntity> getInstructorsByCourseId ( @PathVariable( value = "courseId" ) long courseId ) {
		
		System.out.println("Inside getAllInstructorsByCourseId") ;
		List<InstructorEntity> instructors = instructorService.getInstructorsByCourseId(courseId) ;
		Iterator it = instructors.iterator() ;
		while ( it.hasNext() ) {
			InstructorEntity instructor = ( InstructorEntity ) it.next() ;
			System.out.println("Instructor Id, Name : " + instructor.getId() + ", " + instructor.getName() ) ;
		}
		
		return instructors ;
	}
	
	// Methods for Syllabus
	@RequestMapping(value = "/getAllSyllabus" , method=RequestMethod.GET)
	public void getAllSyllabus() {
		
		System.out.println("Inside ServiceController : getAllSyllabus") ;
		List<SyllabusEntity> listOfSyllabus = null ;
		
		listOfSyllabus = syllabusService.getAllSyllabus() ;
		
		Iterator iterator = listOfSyllabus.iterator() ;
		
		while ( iterator.hasNext() ) {
			SyllabusEntity syllabus = ( SyllabusEntity ) iterator.next() ;
			System.out.println("Syllabus Id, name : " + syllabus.getId() + "--" + syllabus.getName() ) ;
			
			Set<SubjectEntity> subjects = syllabus.getSubjects() ;
			Iterator subjectsIterator = subjects.iterator() ;
			while ( subjectsIterator.hasNext() ) {
				SubjectEntity subject = (SubjectEntity) subjectsIterator.next() ;
				System.out.println("Subject Id, name : " + subject.getId() + "--" + subject.getName() ) ;
			}
			
		}
	}
	
	@RequestMapping( value = "/getSyllabus/{id}", method=RequestMethod.GET)
	public void getSyllabusDetailFromId ( @PathVariable( value = "id") long id ) {
		
		System.out.println("Calling getSyllabusById") ;
		SyllabusEntity syllabusEntity = syllabusService.getSyllabusById(id) ;
		System.out.println("return from call ") ;
		System.out.println("Syllabus name : " + syllabusEntity.getName()) ;
		
		Set<SubjectEntity> subjects = syllabusEntity.getSubjects() ;
		
		Iterator iterator = subjects.iterator() ;
		System.out.println("Subjects for the syllabus : " + syllabusEntity.getName()) ;
		while ( iterator.hasNext()) {
			SubjectEntity subject = ( SubjectEntity ) iterator.next() ;
			System.out.println("Name : " + subject.getName()) ;
		}
	}
	
	
	// Methods for Subjects
	@RequestMapping( value = "/getAllSubjects" , method=RequestMethod.GET)
	public void getAllSubjects() {
		
		System.out.println("Inside GetAllSubject") ;
		
		List<SubjectEntity> subjects = subjectService.getAllSubjects() ;
		Iterator iterator = subjects.iterator() ;
		while ( iterator.hasNext() ) {
			SubjectEntity subject = ( SubjectEntity ) iterator.next() ;
			System.out.println("Subject Id, name : " + subject.getId() + "--" + subject.getName() ) ;
			
		}
		
	}
	
	
	@RequestMapping( value = "/getSubject/{id}", method=RequestMethod.GET)
	public void getSubjectDetailFromId ( @PathVariable( value = "id") long id ) {
		
		System.out.println("Calling getSubjectById") ;
		SubjectEntity subjectEntity = subjectService.getSubjectById(id) ;
		System.out.println("return from call ") ;
		System.out.println("Subject name : " + subjectEntity.getName()) ;
		
		// The below should be lessons
		/* Set<SubjectEntity> subjects = syllabusEntity.getSubjects() ;
		
		Iterator iterator = subjects.iterator() ;
		System.out.println("Subjects for the syllabus : " + syllabusEntity.getName()) ;
		while ( iterator.hasNext()) {
			SubjectEntity subject = ( SubjectEntity ) iterator.next() ;
			System.out.println("Name : " + subject.getName()) ;
		} */
	}	
	
	
	
	@RequestMapping(value = "/getFirstJSON", method = RequestMethod.GET)
	@ResponseBody
	public void getFirstJSON(Model model ) throws JSONException {
	    
		// This is the main Array
		
		JSONArray coursesArray = new JSONArray() ;
		
		JSONObject courseObj = null ;
		JSONArray instructorArray = null ;
		JSONArray subjectArray = null ;
		
		// Start with Course details 
	    courseObj = new JSONObject();
		List<CourseEntity> courses = courseService.getAllCourses() ;
		Iterator courseIterator = courses.iterator() ;
		
		while ( courseIterator.hasNext() ) {
			
			CourseEntity course = ( CourseEntity ) courseIterator.next() ;
			System.out.println("Course Id, Name : " + course.getId() + ", " + course.getName() ) ;

			 courseObj = new JSONObject() ;
		     courseObj.put("id", course.getId());
		     courseObj.put("name", course.getName());
		     courseObj.put("decription",course.getDescription()) ;
		     courseObj.put("course-intro-video",course.getIntroVideoPath());
			
			// Get the Instructors
			List<InstructorEntity> instructors = instructorService.getInstructorsByCourseId(course.getId()) ;
			Iterator instructorIterator = instructors.iterator() ;

			
			// Get the instructors
		    instructorArray = new JSONArray() ;
			while ( instructorIterator.hasNext() ) {
				InstructorEntity instructor = ( InstructorEntity ) instructorIterator.next() ;
				System.out.println("Instructor ID, Name : " + instructor.getId() + ", " + instructor.getName() ) ;
			    instructorArray.put(instructor.getId()) ;
			}
			
			courseObj.put("instructors",instructorArray) ;
			
			
			//TODO:  Is Syllabus going to be a one to one with course 
			
			List<SyllabusEntity> listOfSyllabus = syllabusService.getSyllabusByCourseId(course.getId()) ;
			Iterator syllabusIterator = listOfSyllabus.iterator() ;
			
			// Assuming there is only on Syllabus for each course ;
			while ( syllabusIterator.hasNext()) {
				SyllabusEntity syllabus = ( SyllabusEntity ) syllabusIterator.next() ;
				System.out.println("Syllabus Id, Name : " + syllabus.getId() + ", " + syllabus.getName() ) ;
				
				// Get the Syllabus
				courseObj.put("syllabus",syllabus.getId()) ;
				
				// Get all Subjects 
				List<SubjectEntity> subjects = subjectService.getSubjectsBySyllabusId(syllabus.getId() ) ;
				Iterator subjectIterator = subjects.iterator() ;
				
				subjectArray = new JSONArray() ;
				while ( subjectIterator.hasNext() ) {
					SubjectEntity subject = ( SubjectEntity ) subjectIterator.next() ;
					System.out.println("Subject Id, Name : " + subject.getId() + ", " + subject.getName()) ;
					subjectArray.put(subject.getId()) ;
				}
			     courseObj.put("subjects",subjectArray) ;
			     courseObj.put("faq","faq.html") ;					
			}
			
			// Add to main Array
			coursesArray.put(courseObj) ;
		}
		
		
		
		
/*	     JSONObject courseObj = new JSONObject();
	     courseObj.put("id", "1");
	     courseObj.put("name", "Preparation for 11 Plus exams");
	     courseObj.put("decription","Preparation for 11-plus exams is suitable for children who are aspiring for grammar school admissions") ;
	     courseObj.put("course-intro-video","videos/file.mp4");

	     JSONArray instructorArray = new JSONArray() ; ;
	     instructorArray.put("InstructorId 1") ;
	     instructorArray.put("InstructorId 2") ;
	     instructorArray.put("InstructorId 3") ;
	     
	     courseObj.put("instructors",instructorArray) ;
	     
	     courseObj.put("syllabus","Syllabus 1") ;
	     
	     JSONArray subjectArray = new JSONArray() ;
	     subjectArray.put("SubjectId 1") ;
	     subjectArray.put("SubjectId 2") ;
	     subjectArray.put("SubjectId 3") ;
	     courseObj.put("subjects",subjectArray) ;
	     courseObj.put("faq","faq.html") ;

	     coursesArray.put(courseObj) ;*/
	     
	     System.out.println(coursesArray.toString() ) ;
		//return jArray;
	}


}