package com.projects.dev.tulio.springbootpeoplerestapi.repository;

import com.projects.dev.tulio.springbootpeoplerestapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
