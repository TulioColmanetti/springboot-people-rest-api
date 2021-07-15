package com.projects.dev.tulio.simplerescrudapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 150)
    private String street;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String country;

    @NotEmpty
    @Pattern(regexp = "\\d{5}-\\d{3}")
    private String cep;
}
