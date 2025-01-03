package com.in28minutes.OO2_SpringManaged_Sec08;



import com.in28minutes.OO2_SpringManaged_Sec08.game.GameRunner;
import com.in28minutes.OO2_SpringManaged_Sec08.game.GamingConsole;
import com.in28minutes.OO2_SpringManaged_Sec08.game.PacManConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.in28minutes.OO2_SpringManaged_Sec08.game")
public class Client {
//    @Bean
//    public GamingConsole game(){
//        GamingConsole game = new PacManConsole();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        GameRunner gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        try (var context = new AnnotationConfigApplicationContext(Client.class)) {
            context.getBean(GamingConsole.class).up();
            System.out.println( context.getBean("pacManConsole"));
            System.out.println( context.getBean("marioGamingConsole"));
            context.getBean("marioGamingConsole");
            GamingConsole console = (GamingConsole) context.getBean("marioGamingConsole");
            console.down();
            context.getBean(PacManConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
