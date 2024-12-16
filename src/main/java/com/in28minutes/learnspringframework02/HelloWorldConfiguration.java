package com.in28minutes.learnspringframework02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration - Contains beans that we want spring to manage

//JDK16 -> no need to getter setter constructor
record Person(String name,int age,Address address){

}

record Address(String firstline, String city){

}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Abhishek";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi",20,new Address("Bakers Street","London"));
        return person;
    }

    @Bean(name="addressIND")
    public Address address(){
        var address = new Address("DLF New Town","Bangalore");
        return address;
    }

    @Bean(name="addressUSA")
    public Address address1(){
        var address = new Address("Bill Street","NYC");
        return address;
    }

//    use Existing bean to create new bean

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameter(){
        return new Person(name(),age(),address());
    }

//    Autowiring existing beans instead of methods()
    @Bean
    public Person person4Parameter(String name,int age,Address address1){
        return  new Person(name,age,address1);
    }
}
