package com.in28minutes.OO1_JSF_Sec07.game;

public class MarioGamingConsole implements GamingConsole {
    public void up(){
        System.out.println("Jump!!");
    }

    public void down(){
        System.out.println("Go into a hole!!");
    }

    public void left(){
        System.out.println("Go Back!!");
    }

    public void right(){
        System.out.println("Accelerate!!");
    }
}
