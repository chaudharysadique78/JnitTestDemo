package com.test.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.entity.Person;
import com.test.repository.PersonRepo;

@SpringBootTest
public class PersonRepoTest {
	
	@Autowired
	private PersonRepo PersonRepo;
	
	@Test
	void testIsPersonByExtisByID() {
		Person person=new Person(1,"Sadik","Mumbai");
		PersonRepo.save(person);
		Boolean actualResult = PersonRepo.isPersonExsistsById(1);
		assertThat(actualResult).isTrue();
	}
	
	@AfterEach
	void tearDown() {
		System.err.println("tearing down");
		PersonRepo.deleteAll();
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("setting up");
	}

}
