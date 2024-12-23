package com.in28minutes.OO3_Autowiring_Sec09.game;


import org.springframework.stereotype.Component;

@Component("PackmanGamingConsole")
public class PackmanGamingConsole implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Packman UP");
    }

    @Override
    public void down() {
        System.out.println("Packman Down");
    }

    @Override
    public void left() {
        System.out.println("Packman Left");
    }

    @Override
    public void right() {
        System.out.println("Packman Right");
    }
}
