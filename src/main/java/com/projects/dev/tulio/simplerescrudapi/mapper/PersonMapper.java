package com.projects.dev.tulio.simplerescrudapi.mapper;

import com.projects.dev.tulio.simplerescrudapi.dto.request.PersonDTO;
import com.projects.dev.tulio.simplerescrudapi.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
