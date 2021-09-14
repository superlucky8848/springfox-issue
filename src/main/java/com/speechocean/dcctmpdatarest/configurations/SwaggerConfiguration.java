package com.speechocean.dcctmpdatarest.configurations;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration 
{
    @Bean
    public Docket exampleTestDocket()
    {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
            .paths(PathSelectors.ant("/example_test/**"))
            .build()
            .pathMapping("/")
            .apiInfo(apiInfo())
            .groupName("exampleTest");
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfo(
            "example test", 
            "example test", 
            "v1.0", 
            "Open to All", 
            null, 
            null, 
            null,
            new ArrayList<>());
    } 
}
