package com.jpdev.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDTO {

    @NotBlank
    @NotNull
    public String name;

}
