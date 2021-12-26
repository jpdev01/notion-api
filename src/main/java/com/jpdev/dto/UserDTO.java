package com.jpdev.dto;

import com.jpdev.validation.group.OnCreate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserDTO {

    @NotBlank(groups = OnCreate.class)
    @NotNull(groups = OnCreate.class)
    public String name;

    @Pattern(regexp = "/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i", flags = Pattern.Flag.UNICODE_CASE)
    @NotNull(groups = OnCreate.class)
    public String email;

    public String phone;

    public String mobilePhone;


}
