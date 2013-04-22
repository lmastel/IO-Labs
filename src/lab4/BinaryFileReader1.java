package lab4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader1 implements FileInputStrategy {

    private File pathToFile;
    private FileRecord1 fileRecord;
    private FileDecodeStrategy decoder;
    private final String SPACE = " ";

    public BinaryFileReader1(File pathToFile, FileRecord1 fileRecord) {
        this.pathToFile = pathToFile;
        this.decoder = decoder;
        this.fileRecord = fileRecord;
    }

    @Override
    public void readInput() {

        DataInputStream in = null;

        try {

            if (pathToFile.exists()) {
                in = new DataInputStream(
                        new BufferedInputStream(
                        new FileInputStream(pathToFile)));

                while (in.available() > 0) {
                    
                    fileRecord.setFirstName(in.readUTF());
                    fileRecord.setLastName(in.readUTF());
                    fileRecord.setStreetAddress(in.readUTF());
                    fileRecord.setCity(in.readUTF());
                    fileRecord.setState(in.readUTF());
                    fileRecord.setZip(in.readUTF());
                    fileRecord.setEmail(in.readUTF());
                    fileRecord.setPhone(in.readUTF());
                    
                    System.out.println(fileRecord.getFirstName()
                        + SPACE
                        + fileRecord.getLastName()
                        + SPACE
                        + fileRecord.getStreetAddress()
                        + SPACE
                        + fileRecord.getCity()
                        + SPACE
                        + fileRecord.getState()
                        + SPACE
                        + fileRecord.getZip()
                        + SPACE
                        + fileRecord.getEmail()
                        + SPACE
                        + fileRecord.getPhone());
                }
                
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
