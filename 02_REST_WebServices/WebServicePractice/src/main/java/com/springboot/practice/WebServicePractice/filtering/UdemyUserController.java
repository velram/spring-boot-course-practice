package com.springboot.practice.WebServicePractice.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * To practice Dynamic filtering (Udemy lecture #39)
 * https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005676#overview
 */
@RestController
public class UdemyUserController {

    @GetMapping("/dynamic-filtering-sample")
    public MappingJacksonValue retrieveFilteredUdemyUser(){

        UdemyUserBean udemyUser = new UdemyUserBean("Velmurugan", "Helloworld", "1234567890", "Mastering Spring cloud");
        FilterProvider udemyUserFilterProvider = udemyUserFilterOutAllExceptFilter("creditCardNumber", "password", "UdemyUserFilter");
        MappingJacksonValue udemyUserMapping = new MappingJacksonValue(udemyUser);
        udemyUserMapping.setFilters(udemyUserFilterProvider);
        return udemyUserMapping;
    }

    @GetMapping("/filter-payment-info-dynamic")
    public MappingJacksonValue retrieveFilteredPaymentInfo(){

        UdemyUserBean udemyUser = new UdemyUserBean("Velmurugan", "Helloworld", "1234567890", "Mastering Spring cloud");
        FilterProvider udemyUserFilterProvider = udemyUserSerializeAllExceptFilter("creditCardNumber", "password", "UdemyUserFilter");
        MappingJacksonValue udemyUserMapping = new MappingJacksonValue(udemyUser);
        udemyUserMapping.setFilters(udemyUserFilterProvider);
        return udemyUserMapping;
    }

    // serializeAll() - hands-on - given properties will not be displayed in response
    private FilterProvider udemyUserSerializeAllExceptFilter(String property1, String property2, String filterName) {
        PropertyFilter udemyUserFilter = SimpleBeanPropertyFilter.serializeAllExcept(property1, property2);
        return new SimpleFilterProvider().addFilter(filterName, udemyUserFilter);
    }

    // filterOutAllExcept() - hands-on - only given properties will be displayed in response
    private FilterProvider udemyUserFilterOutAllExceptFilter(String property1, String property2, String filterName) {
        PropertyFilter udemyUserFilter = SimpleBeanPropertyFilter.filterOutAllExcept(property1, property2);
        return new SimpleFilterProvider().addFilter(filterName, udemyUserFilter);
    }
}
