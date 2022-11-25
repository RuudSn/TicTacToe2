package novi.basics;

import java.io.File;
import java.util.Scanner;

public class Game {

    private Player playerA;
    private Player playerB;
    private Player currentPlayer;

    public Game(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;
        currentPlayer = playerA;
    }



    public void playGame(Board board){

        boolean hasWon = false;

        while (!hasWon) {

            makeMove(board);

            board.printBoard();

            Field[] row = board.getRow();
            hasWon = hasPlayerWon(row);

           callWinner(hasWon);

           switchPlayer();
        }
    }

    public void makeMove(Board board){
        boolean isPlaced = false;
        Scanner userInput = new Scanner(System.in);
        while(!isPlaced) {
            System.out.println("\nGeef nummer van vak waar je een " + getCurrentPlayer().getName() + " wilt zetten");
            int selectedField = userInput.nextInt() - 1;

            String currentPlayerToken = getCurrentPlayer().getToken();
            isPlaced = board.getRow()[selectedField].setToken(currentPlayerToken);
        }
    }

    public void callWinner(boolean hasWon){
        if (hasWon) {
            getCurrentPlayer().setScore(1);
            System.out.println();
            System.out.println(getCurrentPlayer().getName() + ", je hebt gewonnen");
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer(){
        if(currentPlayer == playerA){
            currentPlayer = playerB; }
        else{
            currentPlayer = playerA; }
    }

    public boolean hasPlayerWon(Field[] board){
        String currentPlayerToken = currentPlayer.getToken();

        if(board[0].getToken()==currentPlayerToken&&board[1].getToken()==currentPlayerToken&&board[2].getToken()==currentPlayerToken){
            return true; }
        if(board[3].getToken()==currentPlayerToken&&board[4].getToken()==currentPlayerToken&&board[5].getToken()==currentPlayerToken){
            return true; }
        if(board[6].getToken()==currentPlayerToken&&board[7].getToken()==currentPlayerToken&&board[8].getToken()==currentPlayerToken){
            return true; }
        if(board[0].getToken()==currentPlayerToken&&board[3].getToken()==currentPlayerToken&&board[6].getToken()==currentPlayerToken){
            return true; }
        if(board[1].getToken()==currentPlayerToken&&board[4].getToken()==currentPlayerToken&&board[7].getToken()==currentPlayerToken){
            return true; }
        if(board[2].getToken()==currentPlayerToken&&board[5].getToken()==currentPlayerToken&&board[8].getToken()==currentPlayerToken){
            return true; }
        if(board[0].getToken()==currentPlayerToken&&board[4].getToken()==currentPlayerToken&&board[8].getToken()==currentPlayerToken){
            return true; }
        if(board[2].getToken()==currentPlayerToken&&board[4].getToken()==currentPlayerToken&&board[6].getToken()==currentPlayerToken){
            return true; }
        return false;
    }


    public void printScores(int gameNr){
        System.out.println("resultaten na "+gameNr+"  potjes:" );
        System.out.println("Speler " + playerA.getName() + " heeft " + playerA.getScore() + " punten.");
        System.out.println("Speler " + playerB.getName() + " heeft " + playerB.getScore() + " punten.");
    }


    public void fileScores(){
        String scoreA = playerA.toString();
        String scoreB = playerB.toString();
        File file = new File("scores.txt");
        FileManager fileHandler = new FileManager(file);
        fileHandler.fileScores(scoreA, scoreB);
    }



}
