package com.felipesilvino.version.per.subproject.person.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new PersonApplication()
                .configure(new SpringApplicationBuilder())
                .run(args);
    }
}
