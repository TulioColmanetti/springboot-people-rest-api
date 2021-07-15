package com.projects.dev.tulio.springbootpeoplerestapi.dto.request;

import com.projects.dev.tulio.springbootpeoplerestapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Pattern(regexp = "\\(\\d{2}\\)( )?\\d{4,5}-\\d{4}")
    private String number;
}
