package com.practice;

import com.practice.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Prashant
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestService service = context.getBean("testService", TestService.class);
        service.getTestConfig().getData1();
    }
}
