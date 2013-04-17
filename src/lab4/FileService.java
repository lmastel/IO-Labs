package lab4;

public class FileService {
    
    public void getInput(FileInputStrategy inputStrategy, 
            FileDecodeStrategy decodeStrategy,
            FormatStrategy formatStrategy) {
        inputStrategy.readInput();
    }

    public void setOutput(FileOutputStrategy outputStrategy,
            FileEncodeStrategy encodeStrategy){
        outputStrategy.writeOutput();
      
    }
    public static void main(String[] args) {
        //Build a file record. There can be many record types that an 
        //organization uses.It is done here through code but it could be built
        //by through a gui.
        ContactListFileRecord fr = new ContactListFileRecord();
         
        fr.setFirstName("Firstname7");
        fr.setLastName("Lastname7");
        fr.setStreetAddress("Streetaddress7");
        fr.setCity("City7");
        fr.setState("S7");
        fr.setZip("Zip7");
        fr.setEmail("Email7");
        fr.setPhone("Phone7");    
        
        
        FileService fs = new FileService();
              
        //append a file record to an existing file
        FileEncodeStrategy encoder = new DelimitedFileEncoder(fr,"#");        
        FileOutputStrategy fos = new TextFileLineWriter(fr, encoder);
        fs.setOutput(fos, encoder);

        //read all files records in the file that has just been appended
        FileDecodeStrategy decoder  = new DelimitedFileDecoder(fr,"#");        
        FormatStrategy formatter = new TextFileLineFormatter1(fr);          
        FileInputStrategy fis = new TextFileLineReader(fr, decoder, formatter);        
        fs.getInput(fis, decoder, formatter);
        
        
    }
}
