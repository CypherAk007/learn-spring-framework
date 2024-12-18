package com.in28minutes.learnspringframeworkpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Auto closing -> context.close();
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
        System.out.println(context.getBean("address3"));
        System.out.println(context.getBean("personParam"));
        System.out.println(context.getBean(Address.class));
        System.out.println();

        }


    }
}
