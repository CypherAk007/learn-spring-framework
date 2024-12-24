package com.in28minutes.OO4_BusinessCalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Client {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Client.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            BusinessCalculationService businessCalculationService = context.getBean(BusinessCalculationService.class);
            System.out.println(businessCalculationService.findMax());
        }
    }
}
