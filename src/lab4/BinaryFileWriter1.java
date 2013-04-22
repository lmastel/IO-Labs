package lab4;

import java.io.*;

public class BinaryFileWriter1 implements FileOutputStrategy {
    File pathToFile;
    FileRecord1 fileRecord;
    
    BinaryFileWriter1(File pathToFile, FileRecord1 fileRecord) {
        this.pathToFile = pathToFile;
        this.fileRecord = fileRecord;        
    }

    @Override
    public void writeOutput() {
        
        DataOutputStream out = null;

        try {

            out = new DataOutputStream(
                    new BufferedOutputStream(
                    new FileOutputStream(pathToFile,true)));
            
            out.writeUTF(fileRecord.getFirstName());
            out.writeUTF(fileRecord.getLastName());
            out.writeUTF(fileRecord.getStreetAddress());
            out.writeUTF(fileRecord.getCity());
            out.writeUTF(fileRecord.getState());
            out.writeUTF(fileRecord.getZip());
            out.writeUTF(fileRecord.getEmail());
            out.writeUTF(fileRecord.getPhone());              

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
