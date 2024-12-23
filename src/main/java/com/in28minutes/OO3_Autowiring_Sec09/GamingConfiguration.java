//package com.in28minutes.OO3_Autowiring_Sec09;
//
//import com.in28minutes.OO3_Autowiring_Sec09.game.GameRunner;
//import com.in28minutes.OO3_Autowiring_Sec09.game.GamingConsole;
//import com.in28minutes.OO3_Autowiring_Sec09.game.MarioGamingConsole;
//import com.in28minutes.OO3_Autowiring_Sec09.game.PackmanGamingConsole;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GamingConfiguration {
//    @Bean
//    public GamingConsole marioGamingConsole(){
//        GamingConsole game = new MarioGamingConsole();
//        return game;
//    }
//
//    @Bean
//    @Qualifier("PackmanGamingConsole")
//    public GamingConsole packmanGamingConsole(){
//        GamingConsole game = new PackmanGamingConsole();
//        return game;
//    }
//
//    @Bean
//    public GameRunner gameRunner(@Qualifier("PackmanGamingConsole") GamingConsole game){
//        GameRunner gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
//}
