package lab4;

import java.io.*;

public class TextFileWriter1 implements FileOutputStrategy {
    
    ContactListFileRecord fr;
    FileEncodeStrategy encoder;
    
    TextFileWriter1(ContactListFileRecord fr, FileEncodeStrategy encoder){
        this.fr = fr;
        this.encoder = encoder;
    }    

    @Override
    public void writeOutput() {
        String separator = System.getProperty( "line.separator" );
        
        boolean append = true;        
        
//        File data = new File(File.separatorChar + "temp" + File.separatorChar
//                + "lab1.txt");
        File data = new File("src/lab1.txt");

        PrintWriter out = null;        
        
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
