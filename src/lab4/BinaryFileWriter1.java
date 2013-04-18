package lab4;

import java.io.*;

public class BinaryFileWriter1 implements FileOutputStrategy {

    FileRecord fr;
    FileEncodeStrategy encoder;

    BinaryFileWriter1(FileRecord fr, FileEncodeStrategy encoder) {
        this.fr = fr;
        this.encoder = encoder;
    }

    @Override
    public void writeOutput() {
        
//        File data = new File(File.separatorChar + "temp" + File.separatorChar
//                + "lab1.txt");

        File data = new File("src/lab4.dat");

        DataOutputStream out = null;

        try {

            out = new DataOutputStream(
                    new BufferedOutputStream(
                    new FileOutputStream(data)));
            
            out.writeUTF(fr.getFirstName());
            out.writeUTF(fr.getLastName());
            out.writeUTF(fr.getStreetAddress());
            out.writeUTF(fr.getCity());
            out.writeUTF(fr.getState());
            out.writeUTF(fr.getZip());
            out.writeUTF(fr.getEmail());
            out.writeUTF(fr.getPhone());           

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
