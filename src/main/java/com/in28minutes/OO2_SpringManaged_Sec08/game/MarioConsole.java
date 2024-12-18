package com.in28minutes.OO2_SpringManaged_Sec08.game;

public class MarioConsole implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Mario UP!!");
    }

    @Override
    public void down() {
        System.out.println("Mario Down!!");
    }

    @Override
    public void left() {
        System.out.println("Mario Left!!");
    }

    @Override
    public void right() {
        System.out.println("Mario Right!!");
    }
}
