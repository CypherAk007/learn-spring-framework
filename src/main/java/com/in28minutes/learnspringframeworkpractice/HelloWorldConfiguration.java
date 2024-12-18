package com.in28minutes.learnspringframeworkpractice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Address(String name,int age,String address){
    
}

record Person(String name,int age,Address address){

}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "John";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    @Primary
    public Address address2(){
        return new Address("Ak",23,"BLR");
    }

    @Bean
    @Qualifier("address3qualifier")
    public Address address3(){
        return new Address("CK",23,"BLR");
    }

    @Bean
    public Person personParam(String name,int age,@Qualifier("address3qualifier") Address address){
        return new Person(name,age,address);
    }
}
