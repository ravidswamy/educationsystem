package net.viralpatel.contact.controller;
 
import java.util.List;
import java.util.Map;
import net.viralpatel.contact.form.Contact;
import net.viralpatel.contact.service.ContactService;
 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class ContactController {
 
    @Autowired
    private ContactService contactService;
 
    @RequestMapping("/index")
    public ModelAndView listContact(Map<String, Object> map) {
    	
    	map.put("contact",new Contact()) ;
    	map.put("contactList",contactService.listContact()) ;
    	return new ModelAndView("contact", map) ;
    }
 
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {  
      contactService.addContact(contact);  
      return new ModelAndView("redirect:/index.html");  
    }
 
    @RequestMapping("/delete/{contactId}")
    public ModelAndView deleteContact(@PathVariable("contactId") Integer contactId) {
    	System.out.println("Id : " + contactId) ;
        contactService.removeContact(contactId);
        return new ModelAndView("redirect:/index.html") ;
    }
}