package com.projects.passwordlaps.DTO;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class PasswordDTO {
    @NotBlank
    private String computerName;

    @Size(max = 20)
    private String password;

    @Size(max = 20)
    private String passwordExires;

    private boolean reset;
}
