//package com.in28minutes.OO2_SpringManaged_Sec08;
//
//
//import com.in28minutes.OO2_SpringManaged_Sec08.game.GameRunner;
//import com.in28minutes.OO2_SpringManaged_Sec08.game.GamingConsole;
//import com.in28minutes.OO2_SpringManaged_Sec08.game.PacManConsole;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GamingConfiguration {
//
//    @Bean
//    public GamingConsole game(){
//        GamingConsole game = new PacManConsole();
//        return game;
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        GameRunner gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
//
//}
