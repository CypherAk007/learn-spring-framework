package com.in28minutes.OO3_Autowiring_Sec09.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
//    @Autowired
////    @Qualifier("PackmanGamingConsole")
//    @Qualifier("MarioGamingConsole")
    private GamingConsole game;
//    Autowired is automatically applied no need to explicily mention for
//    constructor injection
    public GameRunner(@Qualifier("PackmanGamingConsole") GamingConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
