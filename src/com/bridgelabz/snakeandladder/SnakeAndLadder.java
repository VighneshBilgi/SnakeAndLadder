package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static int playPos = 0;

    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game:");

        int die = (int)(Math.random()*10 %6) +1;
        System.out.println("Die Number is:"+die);
    }
}
