package com.in28minutes.leanspringframework;

import com.in28minutes.leanspringframework.game.GamingConsole;
import com.in28minutes.leanspringframework.game.GameRunner;
import com.in28minutes.leanspringframework.game.PacManConsole;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        Game game = new MarioGame();
//        GamingConsole gamingConsole = new SuperContraGamingConsole();
        GamingConsole gamingConsole = new PacManConsole();

        GameRunner gameRunner = new GameRunner(gamingConsole);
        gameRunner.run();
    }
}
