package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryCodeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryCodeController.class);

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = (List<Country>) context.getBean("countryList");

        for (Country c : countryList) {
            if (c.getCode().equalsIgnoreCase(code)) {
                LOGGER.info("END");
                return c;
            }
        }

        LOGGER.info("END");
        return null;  // You could later throw exception here
    }
}
