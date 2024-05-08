package com.project;

import com.project.controllers.GameController;
import com.project.models.Player;
import com.project.models.ThingType;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        int size=100;
        GameController gameController = new GameController(size);

        gameController.insertThing(99,9, ThingType.Snake);
        gameController.insertThing(30,3, ThingType.Snake);
        gameController.insertThing(5,25, ThingType.Ladder);

        gameController.insertThing(13,95, ThingType.Ladder);
//        gameController.insertThing(8,13, ThingType.Ladder);
        gameController.insertPlayer(new Player(1,"aa"));

        int diceVal=5;
        while(true) {
            System.out.print("Rolling dice"+" ");
            System.out.println(diceVal);
            boolean b = gameController.moveMove(diceVal);
            if(b) {
                break;
            }
        }
    }

}
