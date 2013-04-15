package lab4;

import java.io.*;

public class TextFileLineWriter implements FileOutputStrategy {
    
    ContactListFileRecord fr;
    
    TextFileLineWriter(ContactListFileRecord fr){
        this.fr = fr;
    }    

    @Override
    public void writeOutput() {
        String separator = System.getProperty( "line.separator" );
        
        boolean append = true;        
        
        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        PrintWriter out = null;
        
        //FileRecord fileRecord = new FileRecord();
        
        FileEncodeStrategy encoder = new DelimitedFileEncoder(fr,"#");     
        
        
        try {

            out = new PrintWriter(
                new BufferedWriter(
                new FileWriter(data, append)));            
            
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
