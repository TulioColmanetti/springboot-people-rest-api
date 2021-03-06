package com.projects.dev.tulio.springbootpeoplerestapi.utils;

import com.projects.dev.tulio.springbootpeoplerestapi.dto.request.PhoneDTO;
import com.projects.dev.tulio.springbootpeoplerestapi.enums.PhoneType;
import com.projects.dev.tulio.springbootpeoplerestapi.model.Phone;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(11)99999-9999";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
