package com.bos.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ConfigurationProperties(prefix = "my")
@Component
public class TestProperties {

    @Value("${com.easy.springboot.h5perf.app.name}")
    private String appName;

    private List<String> server = new ArrayList<String>();

    public void printAppName () {
        System.out.println("APP名称为：" + appName);
        System.out.println("Servers为：" + Arrays.asList(getServers()));
    }

    public List<String> getServers() {
        return this.server;
    }

}