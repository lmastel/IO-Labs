package lab4;

import java.io.*;

public class TextFileWriter1 implements FileOutputStrategy {
    File pathToFile;
    FileRecord1 fr;
    FileEncodeStrategy encoder;
    
    TextFileWriter1(File pathToFile, FileEncodeStrategy encoder){
        this.pathToFile = pathToFile;
        this.encoder = encoder;
    }    

    @Override
    public void writeOutput() {
        String separator = System.getProperty( "line.separator" );
        
        boolean append = true; 

        PrintWriter out = null;        
        
        try {

            out = new PrintWriter(
                new BufferedWriter(
                new FileWriter(pathToFile, append)));            
            
            out.print(encoder.getEncodedOutput());            
            
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
