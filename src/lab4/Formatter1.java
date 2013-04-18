
package lab4;

//Prints each field in the file record on one line with the delimiter 
//replaced by a space
public class Formatter1 implements FormatStrategy {
    FileRecord fr;
    private final String SPACE = " ";
    
    
    public Formatter1(FileRecord fr){
        this.fr = fr;
    }
     

    @Override
    public void setFormat() {
                   
        System.out.println(fr.getFirstName()
                + SPACE
                + fr.getLastName()
                + SPACE
                + fr.getStreetAddress()
                + SPACE
                + fr.getCity()
                + SPACE
                + fr.getState()
                + SPACE
                + fr.getZip()
                + SPACE
                + fr.getEmail()
                + SPACE
                + fr.getPhone());
    }
}
