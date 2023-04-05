package OP.boxing;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Fighter fighter1=new Fighter("Leonidas",10,25);
        Fighter fighter2=new Fighter("Duca",1000,200);

        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        String winner = boxingMatch.fight();
        System.out.println("Winner is: " + winner);
    }
}
