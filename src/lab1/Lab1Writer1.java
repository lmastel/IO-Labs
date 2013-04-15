package lab1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lab1Writer1 {
    

    public void writeFile() {
        String separator = System.getProperty( "line.separator" );

        
        boolean append = true;
        
        
        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        PrintWriter out = null;
        try {

            out = new PrintWriter(
                new BufferedWriter(
                new FileWriter(data, append)));
            
            //out.print("\n");

            out.print("Firstname4");
            out.print("#");
            out.print("Lastname4");
            out.print("#");
            out.print("Streetaddress4");
            out.print("#");
            out.print("City4");
            out.print("#");
            out.print("S4");
            out.print("#");
            out.print("Zip4");
            out.print("#");
            out.print("Email4");
            out.print("#");
            out.print("Phone4");
            
            out.append(separator);

            
            out.close();
            
        } catch (IOException ioe) {
            System.out.println("IOException writing output file");
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
    }
}
