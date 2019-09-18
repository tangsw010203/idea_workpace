package com.kaikeba.primary.dto;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(value="classpath:custem.properties",encoding = "UTF-8")
@ConfigurationProperties("country")
@Data
public class CountryDto {

    private List<String> cities;


}
