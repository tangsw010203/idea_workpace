package com.kaikeba.primary.controller;

import com.kaikeba.primary.dto.CountryDto;
import com.kaikeba.primary.dto.GroupDto;
import com.kaikeba.primary.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value="classpath:custem.properties",encoding="UTF-8")
public class SomeController {

    @Value("${company.name}")
    private String companyName;

    @Value("${city.name}")
    private String cityName;

    @Autowired
    private StudentDto studentDto;


    @Autowired
    private CountryDto countryDto;

    @Autowired
    private GroupDto groupDto;

    @GetMapping("/some")
    public String someHandle(){
        return groupDto.toString();
    }


}
