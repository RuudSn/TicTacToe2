package novi.basics;

public class Board {

    private Field[] row;

    public Board(Field[] row) {
        this.row = row;
    }


    public Field[] getRow() {
        return row;
    }

    public void readyBoard(){
        for (int i = 0; i < 9; i++) {
            row[i] = new Field(Integer.toString(i + 1));
        }
    }

    public void printBoard() {
        for (int i = 0; i < row.length; i++) {
            boolean isEndOfRow = (i + 1) % 3 == 0;
            if (!isEndOfRow) {
                System.out.print(row[i].getToken() + " | ");
            } else {
                System.out.print(row[i].getToken());
                if (i < 8) {
                    System.out.println("\n__________");
                }
            }
        }
    }
















}
