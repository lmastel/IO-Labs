package lab4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader1 implements FileInputStrategy {

    private FileRecord fr;
    private FileDecodeStrategy decoder;
    private FormatStrategy formatter;

    public BinaryFileReader1(FileRecord fr,
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
        
        File data = new File("src/lab4.dat");

        DataInputStream in = null;



        try {

            if (data.exists()) {
                in = new DataInputStream(
                        new BufferedInputStream(
                        new FileInputStream(data)));

                while (in.available() > 0) {
                    
                    fr.setFirstName(in.readUTF());                    
                    fr.setLastName(in.readUTF());                    
                    fr.setStreetAddress(in.readUTF());                    
                    fr.setCity(in.readUTF());                    
                    fr.setState(in.readUTF());                    
                    fr.setZip(in.readUTF());                    
                    fr.setEmail(in.readUTF());                    
                    fr.setPhone(in.readUTF());
                    
                }

                formatter.setFormat();

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
