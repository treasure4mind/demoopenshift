package com.example.demoopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoopenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoopenshiftApplication.class, args);
	}
	
	@RequestMapping("/hello")
    public String hello() {
        return "Hello welcome poc of openshift...!!!!!!!";
    }  

}
