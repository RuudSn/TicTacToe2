package novi.basics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {


    private File scoresFile;


    public FileManager(File scoresFile) {
        this.scoresFile = scoresFile;
    }


    public void fileScores(String scoreA, String scoreB){

        try {
           // File scoresFile = new File("scores.txt");
            FileWriter pen = new FileWriter(scoresFile);
            BufferedWriter printer = new BufferedWriter(pen);

            printer.write(scoreA);
            printer.write(scoreB);

            printer.close();
        }catch(IOException e){
            System.out.println("Geen toegang tot deze locatie");
        }

        }



}
