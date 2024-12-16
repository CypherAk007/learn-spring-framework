package com.in28minutes.learnspringframework02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class App02GamingBasicJava {
    public static void main(String[] args) {
//      1:  Launch a Spring Context with the help of AnnotationConfigApplicationContext
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//        2: Configure the things that we want spring to manage - @Configuration
//        @Bean
//        public String name(){

//        3:
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("address")); // we have changed the name
        System.out.println(context.getBean("addressIND"));
//        Altenative for above
//        System.out.println(context.getBean(Address.class));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameter"));

        System.out.println(context.getBean("person4Parameter"));

    }
}
