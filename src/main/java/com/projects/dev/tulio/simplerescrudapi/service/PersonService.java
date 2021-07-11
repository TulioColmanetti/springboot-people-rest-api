package com.projects.dev.tulio.simplerescrudapi.service;

import com.projects.dev.tulio.simplerescrudapi.dto.response.MessageResponseDTO;
import com.projects.dev.tulio.simplerescrudapi.dto.request.PersonDTO;
import com.projects.dev.tulio.simplerescrudapi.mapper.PersonMapper;
import com.projects.dev.tulio.simplerescrudapi.model.Person;
import com.projects.dev.tulio.simplerescrudapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
