package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader1 implements FileInputStrategy {

    private File pathToFile;  
    FileDecodeStrategy decoder;
   
    
    public TextFileReader1(File pathToFile,FileDecodeStrategy decoder) {
        this.pathToFile = pathToFile;
        this.decoder = decoder;
                
    }

    @Override
    public void readInput() {      

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(pathToFile));

            String line = in.readLine();
            
            while (line != null) {               
               
                decoder.getDatafromReader(line);                               

                line = in.readLine();  
            }

        } catch (IOException ioe) {
            System.out.println("IOException reading input file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
