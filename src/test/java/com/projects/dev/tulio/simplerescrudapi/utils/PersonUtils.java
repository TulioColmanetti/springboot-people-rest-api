package com.projects.dev.tulio.simplerescrudapi.utils;

import com.projects.dev.tulio.simplerescrudapi.dto.request.PersonDTO;
import com.projects.dev.tulio.simplerescrudapi.model.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Tulio";
    private static final String LAST_NAME = "Colmanetti";
    private static final String CPF_NUMBER = "298.115.950-03";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1999, 4, 1);
    private static final String EMAIL = "tulio@test.com";

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("01-04-1999")
                .email(EMAIL)
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .email(EMAIL)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
