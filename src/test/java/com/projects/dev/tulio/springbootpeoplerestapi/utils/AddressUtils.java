package com.projects.dev.tulio.springbootpeoplerestapi.utils;

import com.projects.dev.tulio.springbootpeoplerestapi.dto.request.AddressDTO;
import com.projects.dev.tulio.springbootpeoplerestapi.model.Address;

public class AddressUtils {

    private static final String ADDRESS_STREET = "Avenida da Liberdade, 111";
    private static final String ADDRESS_CITY = "Sao Paulo - SP";
    private static final String ADDRESS_COUNTRY = "Brasil";
    private static final String ADDRESS_CEP = "11111-111";
    private static final long ADDRESS_ID = 1L;

    public static AddressDTO createFakeDTO(){
        return AddressDTO.builder()
                .street(ADDRESS_STREET)
                .city(ADDRESS_CITY)
                .country(ADDRESS_COUNTRY)
                .cep(ADDRESS_CEP)
                .build();
    }

    public static Address createFakeEntity(){
        return Address.builder()
                .id(ADDRESS_ID)
                .street(ADDRESS_STREET)
                .city(ADDRESS_CITY)
                .country(ADDRESS_COUNTRY)
                .cep(ADDRESS_CEP)
                .build();
    }
}
