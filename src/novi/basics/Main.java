package novi.basics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welkom bij boter, kaas en eieren.");
        System.out.println();




        Field[] row = new Field[9];
        Board board = new Board(row);
        board.readyBoard();
        board.printBoard();
                System.out.println();

        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Nulletje", "O");

        Game game = new Game(playerA, playerB);

        game.playGame(board);


        System.out.println("Speler " + playerA.getName() + " heeft " + playerA.getScore() + " punten.");
        System.out.println("Speler " + playerB.getName() + " heeft " + playerB.getScore() + " punten.");


    }






    }






