package com.kaikeba.primary.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:custem.properties",encoding = "UTF-8")
@ConfigurationProperties("student")
@Data
public class StudentDto {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private int age;
    private double score;
}
