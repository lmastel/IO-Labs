package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class TextFileReader1 implements FileInputStrategy {

    private ContactListFileRecord fr;
    private FileDecodeStrategy decoder;
    private FormatStrategy formatter;
    

    public TextFileReader1(ContactListFileRecord fr, 
            FileDecodeStrategy decoder, 
            FormatStrategy formatter) {
        this.fr = fr;
        this.decoder = decoder;
        this.formatter = formatter;
    }

    @Override
    public void readInput() {
        
//        File data = new File(File.separatorChar + "temp" + File.separatorChar
//                + "lab1.txt");
        File data = new File("src" + File.separatorChar + "lab1.txt");

        BufferedReader in = null;

        try {
            in = new BufferedReader(new java.io.FileReader(data));

            String line = in.readLine();
            
            while (line != null) {
                //System.out.println(line);                
                String[] lineParts = decoder.getDecodedInput(line);

                fr.setFirstName(lineParts[0]);
                fr.setLastName(lineParts[1]);
                fr.setStreetAddress(lineParts[2]);
                fr.setCity(lineParts[3]);
                fr.setState(lineParts[4]);
                fr.setZip(lineParts[5]);
                fr.setEmail(lineParts[6]);
                fr.setPhone(lineParts[7]);
                
                formatter.setFormat();

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
