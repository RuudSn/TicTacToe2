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

                System.out.println();


        Player playerA = new Player("Kruisje", "X");
        Player playerB = new Player("Nulletje", "O");

        Game game = new Game(playerA, playerB);


        int gameNr;
        for(gameNr=0; gameNr<3; gameNr++) {

            board.readyBoard();
            board.printBoard();
            game.playGame(board);
        }


            game.printScores(gameNr);


            game.fileScores();



    }






    }






