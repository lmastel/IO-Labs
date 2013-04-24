package lab4;

import java.io.File;

public class FileServiceTest {

    public static void main(String[] args) {
        
        /**
         * 
         * Start of Procedure 1
         * 
         * Build a file record procedure. 
         * Note: This procedure will be used by other procedures that are
         *       writing to a file
         * 
         * There can be many record types that an organization uses.
         * It is done here through setters but it could be 
         * be built through a GUI.
         * 
         * To use - modify the number in the param (String)in the setters 
         * to different values for different procedures so that you can determine
         * if things are working
         * 1.0 Declare fileRecord (FileRecord1)
         *     Note: Do NOT comment out as the declaration will be used by 
         *           other procedures
         * 2.0 Change the String param value to create different records

         */
        FileRecord1 fileRecord = new FileRecord1();
        fileRecord.setFirstName("Firstname4");
        fileRecord.setLastName("Lastname4");
        fileRecord.setStreetAddress("Streetaddress4");
        fileRecord.setCity("City4");
        fileRecord.setState("S4");
        fileRecord.setZip("Zip4");
        fileRecord.setEmail("Email4");
        fileRecord.setPhone("Phone4");
        
        /**
         * End of Procedure 1
         */
        
       

        /**
         * 
         * Start of Procedure 2
         * 
         * Write the file record that was just built to an existing file
         * containing the same record types. This procedure will append the record
         * if the specified file already exists or create a new file if the
         * file does not exist.
         * 
         * Note: 3 file records already exist in "src/lab1.txt"
         * 
         * 1.0 Declare the fs variable (FileService object)
         * 2.0 Set pathToFile (File object) to "src/lab1.txt"
         * 3.0 Declare the encode variable (FileEncodeStrategy object)
         * 3.0.1 param fileRecord (previously declared in Procedure 1)
         * 3.0.2 param String that provides a delimiter (field separator)
         * 3.0.2.1 Enter "#" and the fields in the fileRecord will be written
         *         on a single line separated by "#".
         * 3.0.2.2 Enter "\n" and the fields in the fileRecord will be written
         *         on separate lines(multi line file record)
         * 4.0 Declare the fos variable (FileOutputStrategy) to be used, 
         *     in this case TextFileWriter1
         * 5.0 Execute the setOutput method of the FileService passing the
         *    fos variable (FileOutputStrategy) 
         */
//        FileService fs = new FileService();
//        File pathToFile = new File("src" + File.separatorChar + "lab1.txt");
//        FileEncodeStrategy encoder = new FileEncoder1(fileRecord, "#");
//        FileOutputStrategy fos = new TextFileWriter1(pathToFile, encoder);
//        fs.setOutput(fos);
        
        /**
         * End of Procedure 2
        */


        /**
         * 
         * Start of Procedure 3
         * 
         * Read all the file records in the file that has just been appended to
         * 1.0 Declare a file decoder
         * 1.1    FileDecoder1 will read all file records with no special
         *        formatting
         *        Note: It will even work with a binary file that has been
         *              written "UTF"
         * 1.2    FileDecoder2 will read all file records and remove the 
         *        delimiter for display
         * 1.2.1    param fileRecord - the file record being read
         * 1.2.2    param "#" - a simple String, in this case "#" that is being
         *          used as a delimiter between data fields
         * 1.3   FileDecoder3 is just like FileDecoder2 but prints each data file
         *       in the file record on a separate line
         * 2.0 Declare a file input strategy object
         * 3.0 Execute the FileService getInput method passing the 
         *     the FileInputStrategy object
         */

        /**
         * FileDecoder1 - Use with files
         * lab1.txt
         * multiline.txt
         * lab4.dat
         */
//        FileDecodeStrategy decoder = new FileDecoder1();
//        File pathToFile = new File("src" + File.separatorChar + "lab1.txt");
//        //File pathToFile = new File("src" + File.separatorChar + "multiline.txt");
//        File pathToFile = new File("src" + File.separatorChar + "lab4.dat");
//        FileInputStrategy fis = new TextFileReader1(pathToFile, decoder);
//        FileService fs = new FileService();
//        fs.getInput(fis);
        
        /**
         * FileDecoder2 - Use with file
         * lab1.txt
         */
        //FileDecodeStrategy decoder = new FileDecoder2(fileRecord, "#"); 
        //FileDecodeStrategy decoder = new FileDecoder3(fileRecord, "#"); 
        File pathToFile = new File("src" + File.separatorChar + "lab1.txt");
        FileInputStrategy fis = new TextFileReader1(pathToFile, new FileDecoder2(fileRecord, "#"));
        FileService fs = new FileService();
        fs.getInput(fis);

        /**
         * End of Procedure 3
         */


        /**
         * 
         * Start of Procedure 4
         * 
         * Code to write out to a binary file 
         * Note: Code is written out "as "UTF" and must subsequently be read as
         *       "UTF" 
         * To use
         * 1.0 Perform Procedure 1 to build a new file record
         * 2.0 Set pathToFile (File object) to "src/lab4.dat"
         *     Note: .dat file to signify binary
         * 2.0 Set fos (FileOutputStrategy) to BinaryFileWriter1
         * 3.0.1 param pathToFile 
         * 2.0.2 param fileRecord (declared in Procedure 1)
         * 3.0 Execute setOutput method of fs variable  (FileService object)
         * 3.0.1 param fos (FileOutputStrategy)
         */


        //File pathToFile = new File("src" + File.separatorChar + "lab4.dat");
        //FileOutputStrategy fos = new BinaryFileWriter1(pathToFile, fileRecord);
        //fs.setOutput(fos);
        
        /**
         * End of Procedure 4
         */

        /**
         * 
         * Start of Procedure 5
         * 
         * Code to read the binary file 
         * Note: Code is written out "as "UTF" and must subsequently be read as
         *       "UTF" 
         * To use
         * 1.0 Set pathToFile (File object) to file ("src/lab4.dat") that was
         * previously written in Procedure 4             
         * 2.0 Set fis (FileInputStrategy) to BinaryFileReader1, this reader will
         *     output data fields on a single lines with space between the data
         *     fields
         * 1.0.1 param pathToFile (from 1.0)
         * 1.0.2 param fileRecord (from Procedure 1)
         * 2.0 Execute getInput method of fs (FileService)
         * 2.0.1 param fis (FileInputStrategy)
         */
//        File pathToFile = new File("src" + File.separatorChar + "lab4.dat");
//        FileInputStrategy fis = new BinaryFileReader1(pathToFile, fileRecord);
//        FileService fs = new FileService();
//        fs.getInput(fis);
        
        /**
         * End of Procedure 5
         */
    }
}
