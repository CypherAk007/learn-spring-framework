package com.in28minutes.OO2_SpringManaged_Sec08.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("packmanQualifier")
public class PacManConsole implements GamingConsole {
    @Override
    public void up() {
        System.out.println("PacMan UP!!");
    }

    @Override
    public void down() {
        System.out.println("PacMan Down!!");
    }

    @Override
    public void left() {
        System.out.println("PacMan Left!!");
    }

    @Override
    public void right() {
        System.out.println("PacMan Right!!");
    }
}
