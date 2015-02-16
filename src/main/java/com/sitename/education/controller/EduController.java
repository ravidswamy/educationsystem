package com.sitename.education.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.sitename.education.entity.UserEntity;
import com.sitename.education.service.UserService;

@Controller
@SessionAttributes("sessionUser")
public class EduController {

	@Autowired
	private UserService userService ;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		  dateFormat.setLenient(false);
		  binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	//First page of the site
	@RequestMapping(value = "/index")
	public ModelAndView userLogin(Model model, HttpSession session) {
		System.out.println("sessionID: " + session.getId()) ;
		model.addAttribute("user", new UserEntity());
		return new ModelAndView("login");
   }
	

	@RequestMapping( value = "/login")
	public ModelAndView gotoLogin(Model model) {
		model.addAttribute("user", new UserEntity() ) ;
		return new ModelAndView("login") ;
	}
	
	@RequestMapping( value = "/logout", method=RequestMethod.GET)
	public ModelAndView userLogout(HttpSession session, Model model, SessionStatus sessionStatus ) {
		
		sessionStatus.setComplete();
		session.removeAttribute("sessionUser");
		session.invalidate();
		model.addAttribute("user", new UserEntity()) ;
		return new ModelAndView("login") ;
		
	}
	//Check whether the user wants to Sign In or Sign Up and redirect based on the selection
	@RequestMapping( value ="/loginOrRegister" , method=RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute("user") UserEntity user, BindingResult result, HttpServletRequest request, Model model) {
		
		String signIn = request.getParameter("signIn") ;
		String signUp = request.getParameter("signUp") ;
		System.out.println("signIn : " + signIn ) ;
		System.out.println("signUp : " + signUp ) ;
		
		UserEntity userFromDB = new UserEntity() ;
		
		String nextPage = null ;
		
		if ( signUp != null ) {
			nextPage = "register" ;
		} else if ( signIn !=null ) {
			String userId = request.getParameter("userId") ;
			System.out.println("userId : " + userId ) ;
			userFromDB = userService.findByUserId(userId) ;
		
			
			if ( userFromDB == null  ) {
				System.out.println("user not found ") ;
				model.addAttribute("error","*** Authentication error ***") ;
				model.addAttribute("msg","Invalid username ...") ;
				nextPage = "login" ;
			} else {
				System.out.println("firstName : " + userFromDB.getFirstName() ) ;
				System.out.println("user.  : " + user.getPassword()) ;
				System.out.println("userFromDB  : " + userFromDB.getPassword()) ;
				if ( user.getPassword().equals(userFromDB.getPassword())) {
					System.out.println("passwords is the same ") ;
					nextPage = "home" ;
					user = userFromDB ;
				} else {
					model.addAttribute("error","*** Authentication error ***") ;
					model.addAttribute("msg","Invalid password ... ") ;
					nextPage = "login" ;
				}
				model.addAttribute("user",user) ;
				model.addAttribute("sessionUser",user) ;
				// do the checking for user credentials
			}
		}
		System.out.println("nextPage : " + nextPage) ;
    	return new ModelAndView(nextPage) ;	
	}
	
	@RequestMapping( value = "/register", method=RequestMethod.POST )
	public ModelAndView addUser(@ModelAttribute("user") UserEntity user, BindingResult result, Model model ) {

		System.out.println("Inside addUser") ;
		userService.save(user);
		model.addAttribute("sessionUser",user) ;
		
		return new ModelAndView("home");
	}
	
	@RequestMapping( value = "/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editUser(@PathVariable("id") long id, Model model, @ModelAttribute("user") UserEntity user, HttpSession session ) {
		
		System.out.println("in editUser : " + id) ;
		user = ( UserEntity ) session.getAttribute("sessionUser") ;
		model.addAttribute("user",user) ;
		return new ModelAndView("register") ;
	}

	@RequestMapping(value = "/startExam")
	public ModelAndView startExam( Model model) {
		return new ModelAndView("startExam") ;
	}

	@RequestMapping( value = "/question")
	public ModelAndView getQuestion() {
		System.out.println("Inside getQuestion") ;
		return new ModelAndView("question") ;
	}
}
