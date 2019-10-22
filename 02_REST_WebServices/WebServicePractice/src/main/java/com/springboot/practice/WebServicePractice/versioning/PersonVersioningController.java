package com.springboot.practice.WebServicePractice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("/person/v1")
    public PersonV1 fetchPersonV1(){
        return new PersonV1("Velmurugan", "Moorthy");
    }

    @GetMapping("/person/v2")
    public PersonV2 fetchPersonV2(){
        return new PersonV2(new Name("Velu", "Murugan"));
    }
}
