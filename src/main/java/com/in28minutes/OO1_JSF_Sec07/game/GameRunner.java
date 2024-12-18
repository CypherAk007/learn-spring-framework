package com.in28minutes.OO1_JSF_Sec07.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game = game;

    }

    public void  run(){
        System.out.println("Running Game: "+ game);
        game.up();
        game.down();
        game.right();
        game.left();
    }
}
