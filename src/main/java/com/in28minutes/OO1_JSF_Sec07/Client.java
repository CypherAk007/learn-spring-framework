package com.in28minutes.OO1_JSF_Sec07;

import com.in28minutes.OO1_JSF_Sec07.game.GameRunner;
import com.in28minutes.OO1_JSF_Sec07.game.GamingConsole;
import com.in28minutes.OO1_JSF_Sec07.game.MarioGamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        System.out.println("Hello World!!");
//        GamingConsole gamingConsole = new MarioGamingConsole();
//        GameRunner gameRunner =new GameRunner(gamingConsole);
//        gameRunner.run();

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();

        var gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
