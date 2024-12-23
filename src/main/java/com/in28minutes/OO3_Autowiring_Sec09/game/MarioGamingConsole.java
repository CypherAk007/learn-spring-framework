package com.in28minutes.OO3_Autowiring_Sec09.game;

import org.springframework.stereotype.Component;

@Component("MarioGamingConsole")
public class MarioGamingConsole implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Mario UP");
    }

    @Override
    public void down() {
        System.out.println("Mario Down");
    }

    @Override
    public void left() {
        System.out.println("Mario Left");
    }

    @Override
    public void right() {
        System.out.println("Mario Right");
    }
}
