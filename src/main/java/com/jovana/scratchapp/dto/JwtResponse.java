package com.jovana.scratchapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by jovana on 30.07.2021
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {

    private String jwt;
    private Long userId;
    private String username;
    private String email;
    private List<String> roles;

}
