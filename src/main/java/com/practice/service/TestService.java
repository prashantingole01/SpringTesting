package com.practice.service;

import com.practice.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

import static org.springframework.util.StringUtils.isEmpty;

/**
 * @author Prashant
 */
@Service
public class TestService {

    @Autowired
    private TestConfig testConfig;

    public String getInfo (String param) {
        if (isEmpty(param)) { throw new InvalidParameterException(); }
        return getTestConfig().getData1();
    }

    public TestConfig getTestConfig() {
        return testConfig;
    }

    public void setTestConfig(TestConfig testConfig) {
        this.testConfig = testConfig;
    }
}
