package com.practice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Prashant
 */
@PropertySource("classpath:testConfig.properties")
@Component
public class TestConfig {

    @Value( "${data1}" )
    private String data1;

    @Value( "${data2}" )
    private String data2;

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }
}
