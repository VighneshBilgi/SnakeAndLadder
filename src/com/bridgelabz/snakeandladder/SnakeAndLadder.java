package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

    static int playPos = 0;
    static int dieCount = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int WIN_POS = 100;

    private static int Options() {
        int options = (int)(Math.random()*10 %3) +1;
        return options;
    }

    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game:");


        while (playPos<=WIN_POS){

            int die = (int)(Math.random()*10 %6) +1;
            System.out.println("Die Number is:"+die);

            int options = Options();

            switch (options){
                case NO_PLAY:
                    System.out.println("Player stays in same position. Player is at position:" + playPos+ "\n");
                    break;
                case LADDER:
                    if (playPos +die <=WIN_POS) {
                        playPos = playPos + die;
                        System.out.println("Player moves ahead! Player is at position:" + playPos + "\n");
                   }
                    break;
                case SNAKE:
                    playPos = playPos -die;
                    if(playPos <0){
                        playPos =0;
                    }
                    System.out.println("Player moves behind! Player is at position:" + playPos+ "\n");
                    break;
                default:
            }
            dieCount++;
            if (playPos == WIN_POS)
                break;
        }
        System.out.println("Number of times Die was rolled is:"+dieCount);
    }


}
