package com.coference.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coference.model.Person;
import com.coference.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	
	public void savePerson(Person person) {
		personRepository.save(person);
	}

}
