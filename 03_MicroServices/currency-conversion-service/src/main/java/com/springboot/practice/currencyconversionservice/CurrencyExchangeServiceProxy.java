package com.springboot.practice.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient("currency-exchange-service")
//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")//Old approach to call a micro-service directly
@FeignClient(name = "zuul-api-gateway-server") // New approach to call a micr-service thru gateway
public interface CurrencyExchangeServiceProxy {

    //@GetMapping("/currency-exchange/from/{from}/to/{to}")//Old approach
    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")//New approach
    public CurrencyConversionBean fetchCurrencyExchangeValue(
            @PathVariable String from, @PathVariable String to
    );

}
