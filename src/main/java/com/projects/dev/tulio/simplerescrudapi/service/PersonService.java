package com.projects.dev.tulio.simplerescrudapi.service;

import com.projects.dev.tulio.simplerescrudapi.dto.MessageResponseDTO;
import com.projects.dev.tulio.simplerescrudapi.model.Person;
import com.projects.dev.tulio.simplerescrudapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
