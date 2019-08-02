package com.practice.service;

import com.practice.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Prashant
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ServiceTest {

    @Autowired
    TestService testService;

    @Before
    public void initializeConfig() {
        //Mockito.when(testService.getTestConfig().getData1()).thenReturn("someValue");
    }

    @Test
    public void myTest1() {
        Assert.assertEquals("value1",testService.getTestConfig().getData1());
    }


}
