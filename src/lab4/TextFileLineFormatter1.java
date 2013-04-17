/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

//Prints eacg field in the file record on one line with the delimiter 
//replaced by a space
public class TextFileLineFormatter1 implements FormatStrategy {
    ContactListFileRecord fr;
    private final String SPACE = " ";
    
    
    public TextFileLineFormatter1(ContactListFileRecord fr){
        this.fr = fr;
    }
     

    @Override
    public void setLineFormat() {
        //Present file in a format that replaces the delimiter with a space.            
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
