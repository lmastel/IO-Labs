package lab4;

public class FileService {

    public void getInput(FileInputStrategy in) {
        in.readInput();
    }

    public void setOutput(FileOutputStrategy out){
        out.writeOutput();
      
    }
    public static void main(String[] args) {
        //Build a file record. There can be many record types that an 
        //organization uses.It is done here manually but it could be built
        //by through gui.
        ContactListFileRecord fr = new ContactListFileRecord();
        //fr = new FileRecord();
        fr.setFirstName("Firstname7");
        fr.setLastName("Lastname7");
        fr.setStreetAddress("Streetaddress7");
        fr.setCity("City7");
        fr.setState("S7");
        fr.setZip("Zip7");
        fr.setEmail("Email7");
        fr.setPhone("Phone7");
        
        //Now I need to delegate to the file service some input and/or
        //output task.

        FileService fs = new FileService();
        
        //append a file record to an existing file
        FileOutputStrategy fos = new TextFileLineWriter(fr);
        fos.writeOutput();
        
        //read all files records in the file that has just been appended
        FileInputStrategy fis = new TextFileLineReader(fr);
        fis.readInput();
        
        
    }
}
