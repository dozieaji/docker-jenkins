package com.dozie.jenkinsdockerintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDockerIntegrationApplication {

    public String displayHello(){
        return "Here to say hello to world...!!!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
    }

}
