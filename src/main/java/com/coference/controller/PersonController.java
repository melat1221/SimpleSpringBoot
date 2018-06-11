package com.coference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coference.model.Person;
import com.coference.service.PersonService;

@Controller
@RequestMapping("/home")
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute Person person) {
		System.out.println(person.getFirstName() + " " + person.getLastName());
		personService.savePerson(person);
		return "welcome";
	}
}
