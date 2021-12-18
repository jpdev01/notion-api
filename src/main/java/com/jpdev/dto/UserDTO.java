package com.jpdev.dto;

import com.jpdev.validation.group.OnCreate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDTO {

    @NotBlank(groups = OnCreate.class)
    @NotNull(groups = OnCreate.class)
    public String name;

}
