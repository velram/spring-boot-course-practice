package com.springboot.practice.currencyconversionservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Velmurugan Moorthy
 * 10.10.2019
 * This class would be invoked during Currency conversion
 */
@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean doConvertCurrency(
        @PathVariable String from, @PathVariable String to,
        @PathVariable BigDecimal quantity){

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);
        //uriVariables.put("quantity",String.valueOf(quantity));
        CurrencyConversionBean responseCurrencyConversionBean = null;
        ResponseEntity<CurrencyConversionBean> currencyConversionEntity = new RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                                             CurrencyConversionBean.class, uriVariables);

        responseCurrencyConversionBean = currencyConversionEntity.getBody();
        return new CurrencyConversionBean(responseCurrencyConversionBean.getId(),
                from, to, quantity,
                responseCurrencyConversionBean.getConversionMultiple(),
                quantity.multiply(responseCurrencyConversionBean.getConversionMultiple()),
                responseCurrencyConversionBean.getPort());
    }

}
