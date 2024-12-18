package com.in28minutes.OO1_JSF_Sec07.game;

public class PacManConsole implements GamingConsole {
    public void up(){
        System.out.println("Jump UP!!");
    }

    public void down(){
        System.out.println("Sit Down!!");
    }

    public void left(){
        System.out.println("Go Reverse!!");
    }

    public void right(){
        System.out.println("Accelerate Fast!!");
    }

}
