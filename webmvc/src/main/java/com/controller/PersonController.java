package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Person;
import com.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	PersonService ps;
	@RequestMapping(value = "/createPerson",method = RequestMethod.POST)
	public ModelAndView createPerson(@ModelAttribute("person") Person p) {
		System.out.println("7..controller create");
		Person person = ps.createPerson(p);
		ModelAndView mv=new ModelAndView();
		mv.addObject(person);
		mv.setViewName("showPerson");
		return mv;
	}
	@RequestMapping(value = "/deletePerson",method = RequestMethod.POST)
	public String deletePerson(@ModelAttribute("id") int  id) {
		System.out.println("7..controller delete");
		 ps.deletePerson(id);
		return "showDeletePerson";
	}
	@RequestMapping(value = "/updatePerson",method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute("person") Person p) {
		System.out.println("7..controller update");
		 ps.updatePerson(p);
		return"showUpdatePerson" ;
	}
	@RequestMapping(value = "/getPersonByid",method = RequestMethod.GET)
	public ModelAndView getPersonById( int id) {
		System.out.println("7..controller id");
		Person p1 = ps.getPersonByid(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject(p1);
		System.out.println(p1);
		mv.setViewName("showPerson");
		return mv ;
	}
		
}
