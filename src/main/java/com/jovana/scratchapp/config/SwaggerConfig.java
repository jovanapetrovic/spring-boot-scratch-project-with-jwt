package com.jovana.scratchapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Contact;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jovana on 01.08.2021
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .globalRequestParameters(authorizationParameter())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jovana.scratchapp.controller"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(Arrays.asList(authorization()));
    }

    private static Contact contact() {
        return new Contact(
                "Jovana Petrovic",
                "https://github.com/jovanapetrovic",
                "jovanapetrovic.it@gmail.rs"
        );
    }

    private static ApiInfo apiInfo() {
        return new ApiInfo(
                "Scratch App by Jovana",
                "This page documents Scratch App RESTful Web Service endpoints",
                "1.0", null, contact(),
                null, null, new ArrayList<>());
    }

    private static List<RequestParameter> authorizationParameter() {
        List<RequestParameter> params = new ArrayList<>();
        params.add(new RequestParameterBuilder()
                .name("Authorization")
                .description("JWT token; unique per user, response of api/login request; start it with 'Bearer'")
                .in("header")
                .required(false)
                .build());
        return params;
    }

    private ApiKey authorization() {
        return new ApiKey(HttpHeaders.AUTHORIZATION, "JWT", "header");
    }

}
