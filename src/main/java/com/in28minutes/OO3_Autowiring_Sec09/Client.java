package com.in28minutes.OO3_Autowiring_Sec09;

import com.in28minutes.OO3_Autowiring_Sec09.game.GameRunner;
import com.in28minutes.OO3_Autowiring_Sec09.game.GamingConsole;
import com.in28minutes.OO3_Autowiring_Sec09.game.PackmanGamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass{
//    Autowired here
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;
    public String toString(){
        return "Using "+dependency1+"and "+dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

}



@Configuration
@ComponentScan("package com.in28minutes.OO3_Autowiring_Sec09.game")
@ComponentScan("package com.in28minutes.OO3_Autowiring_Sec09")
public class Client {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Client.class)){
//        GamingConsole gamingConsole = new PackmanGamingConsole();
//            GamingConsole gamingConsole = context.getBean(GamingConsole.class);

//            GameRunner gameRunner = new GameRunner(gamingConsole);
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();

//            -----------------------------xxxxxxxx----------------------------
//            Autowiring
//            define classes in this client class only and dependency inject
            System.out.println(context.getBean(YourBusinessClass.class));
        }

    }
}
