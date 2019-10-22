package com.springboot.practice.WebServicePractice.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeBeanFilteringController {

    @GetMapping("/static-filtering-bean")
    public SomeBean doStaticFilterSomeBean(){
        return new SomeBean("Value1", "Value2",
                "Value3", "value4",
                "value5");
    }

}
