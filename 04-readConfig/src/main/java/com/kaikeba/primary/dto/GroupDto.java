package com.kaikeba.primary.dto;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(value="classpath:custem.properties",encoding = "UTF-8")
@ConfigurationProperties("group")
@Data
public class GroupDto {

    private List<User> users;


}
