package com.min.edu.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {
    private String name;
    private String email;
    private String password;
    public RequestDto() {
    }


}
