package com.in28minutes.OO2_SpringManaged_Sec08.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
