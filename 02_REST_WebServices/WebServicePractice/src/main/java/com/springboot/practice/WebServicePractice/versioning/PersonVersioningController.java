package com.springboot.practice.WebServicePractice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Versioning hands-on
 * Lecture #40 (Udemy - Mastering micro services with spring-boot & Spring cloud)
 * https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005678#overview
 */
@RestController
public class PersonVersioningController {

    /*Approach #1 (versioning) - starts */
    @GetMapping("/person/v1")
    public PersonV1 fetchPersonV1(){
        return new PersonV1("Velmurugan", "Moorthy");
    }

    @GetMapping("/person/v2")
    public PersonV2 fetchPersonV2(){
        return new PersonV2(new Name("Velu", "Murugan"));
    }
    /*Approach #1 (versioning) - ends */


    /*Approach #2 (versioning) - using path parameter starts */
    @GetMapping(value = "/person/params", params = "version=1")
    public PersonV1 fetchPersonByPathParamV1(){
        return new PersonV1("Velmurugan", "Moorthy");
    }

    @GetMapping(value = "/person/params", params = "version=2")
    public PersonV2 fetchPersonByPathParamV2(){
        return new PersonV2(new Name("Velu", "Murugan"));
    }
    /*Approach #2 (versioning) - ends */


    /*Approach #3 (versioning) - starts
    * using headers (header versioning)
    * */
    @GetMapping(value = "/person/headers", headers = "X-API-VERSION=1")
    public PersonV1 fetchPersonByHeadersV1(){
        return new PersonV1("Velmurugan", "Moorthy");
    }

    @GetMapping(value = "/person/headers", headers = "X-API-VERSION=2")
    public PersonV2 fetchPersonByHeadersV2(){
        return new PersonV2(new Name("Velu", "Murugan"));
    }


    /*Approach #3 (versioning) - ends */

    /*Approach #4 (versioning) - starts
    * using "produces"
    * Accept-header versioning / MIME type versioning / produces-type versioning
    * */

    @GetMapping(value = "/person/headers", produces = "application/vnd.app-v1+json")
    public PersonV1 fetchPersonByAcceptHeadersV1(){
        return new PersonV1("Velmurugan", "Moorthy");
    }

    @GetMapping(value = "/person/headers", produces = "application/vnd.app-v2+json")
    public PersonV2 fetchPersonByAcceptHeadersV2(){
        return new PersonV2(new Name("Velu", "Murugan"));
    }

    /*Approach #4 (versioning) - ends */

}
