package com.projects.dev.tulio.simplerescrudapi.repository;

import com.projects.dev.tulio.simplerescrudapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
