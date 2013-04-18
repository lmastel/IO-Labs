
package lab4;

//Prints each field of the file record on a separate line
public class Formatter2 implements FormatStrategy {

    ContactListFileRecord fr;
    

    public Formatter2(ContactListFileRecord fr) {
        this.fr = fr;
    }

    @Override
    public void setFormat() {
        
        System.out.println("");
        System.out.println(fr.getFirstName());
        System.out.println(fr.getLastName());
        System.out.println(fr.getStreetAddress());
        System.out.println(fr.getCity());
        System.out.println(fr.getState());
        System.out.println(fr.getZip());
        System.out.println(fr.getEmail());
        System.out.println(fr.getPhone());
    }
}
