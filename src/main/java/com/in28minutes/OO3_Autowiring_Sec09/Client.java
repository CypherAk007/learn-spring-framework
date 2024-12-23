package com.in28minutes.OO3_Autowiring_Sec09;

import com.in28minutes.OO3_Autowiring_Sec09.game.GameRunner;
import com.in28minutes.OO3_Autowiring_Sec09.game.GamingConsole;
import com.in28minutes.OO3_Autowiring_Sec09.game.PackmanGamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("package com.in28minutes.OO3_Autowiring_Sec09.game")
//@ComponentScan("package com.in28minutes.OO3_Autowiring_Sec09.game")
public class Client {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Client.class)){
//        GamingConsole gamingConsole = new PackmanGamingConsole();
//            GamingConsole gamingConsole = context.getBean(GamingConsole.class);

//            GameRunner gameRunner = new GameRunner(gamingConsole);
//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);
//            GameRunner gameRunner = context.getBean(GameRunner.class);
//            gameRunner.run();

//            -----------------------------xxxxxxxx----------------------------
//            Autowiring

        }

    }
}
