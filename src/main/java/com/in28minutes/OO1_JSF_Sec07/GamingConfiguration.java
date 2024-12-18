package com.in28minutes.OO1_JSF_Sec07;

import com.in28minutes.OO1_JSF_Sec07.game.GameRunner;
import com.in28minutes.OO1_JSF_Sec07.game.GamingConsole;
import com.in28minutes.OO1_JSF_Sec07.game.PacManConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacManConsole();
        return game;
    }


    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner =new GameRunner(game);
        return gameRunner;
    }
}
