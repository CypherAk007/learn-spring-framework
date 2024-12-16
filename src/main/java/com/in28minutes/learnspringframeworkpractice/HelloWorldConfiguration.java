package com.in28minutes.learnspringframeworkpractice;

import org.springframework.context.annotation.Configuration;


record Address(String name,int age,Address address){
    
}

@Configuration
public class HelloWorldConfiguration {


}
