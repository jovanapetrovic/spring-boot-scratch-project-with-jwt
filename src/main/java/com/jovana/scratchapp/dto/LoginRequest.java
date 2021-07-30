package com.jovana.scratchapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jovana on 30.07.2021
 */
@Getter
@Setter
@NoArgsConstructor
public class LoginRequest {

    private String username;
    private String password;

}
