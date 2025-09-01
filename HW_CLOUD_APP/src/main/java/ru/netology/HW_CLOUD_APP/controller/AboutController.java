package ru.netology.HW_CLOUD_APP.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
public class AboutController {

    @Value("${spring.datasource.url}")
    private String dataSource;

    @GetMapping("/data-source")
    public String getDataSource() {
        return dataSource;
    }
}
