package com.coference.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coference.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
