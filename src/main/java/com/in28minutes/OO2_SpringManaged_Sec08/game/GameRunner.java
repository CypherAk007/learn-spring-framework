package com.in28minutes.OO2_SpringManaged_Sec08.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan("package com.in28minutes.OO2_SpringManaged_Sec08.game")//NO NEED THIS AS IT IS IN SAME PACKAGE
@Component
public class GameRunner {
    @Autowired
    @Qualifier("packmanQualifier")
    private GamingConsole game;
//    public GameRunner(@Qualifier("packmanQualifier") GamingConsole game){
//        this.game = game;
//    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
