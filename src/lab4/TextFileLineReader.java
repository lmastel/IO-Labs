package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class TextFileLineReader implements FileInputStrategy {
    private ContactListFileRecord fr;
    FileDecodeStrategy decoder;
    private final String SPACE = " ";
    
    public TextFileLineReader(ContactListFileRecord fr){
        this.fr = fr;
    }

    @Override
    public void readInput() {
        //PrintWriter out = null;

        File data = new File(File.separatorChar + "temp" + File.separatorChar
                + "lab1.txt");

        BufferedReader in = null;
        
//        FileDecodeStrategy decoder = new DelimitedFileDecoder(fr,line,"#");
        
        try {
            in = new BufferedReader(new java.io.FileReader(data));
            
            String line = in.readLine();
            
            decoder = new DelimitedFileDecoder(fr,"#");
            while (line != null) {
                //System.out.println(line);                
                String[] lineParts = decoder.getDecodedInput(line);
                
                fr.setFirstName(lineParts [0]);
                fr.setLastName(lineParts [1]);
                fr.setStreetAddress(lineParts [2]);
                fr.setCity(lineParts [3]);                
                fr.setState(lineParts [4]);
                fr.setZip(lineParts [5]);
                fr.setEmail(lineParts [6]);
                fr.setPhone(lineParts [7]);
                
                //Present file in a different format without delimiters                
                System.out.println(fr.getFirstName()+ 
                        SPACE +
                        fr.getLastName() +
                        SPACE +
                        fr.getStreetAddress() + 
                        SPACE +
                        fr.getCity() + 
                        SPACE +
                        fr.getState() + 
                        SPACE +
                        fr.getZip() + 
                        SPACE +
                        fr.getEmail() + 
                        SPACE +
                        fr.getPhone());
                
                line = in.readLine();  // strips out any carriage return chars
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
