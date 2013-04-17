
package lab4;

//Prints each field of the file record on a separate line
public class TextFileLineFormatter2 implements FormatStrategy {

    ContactListFileRecord fr;
    

    public TextFileLineFormatter2(ContactListFileRecord fr) {
        this.fr = fr;
    }

    @Override
    public void setLineFormat() {
        //Present file in a format that replaces the delimiter with a space. 
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
