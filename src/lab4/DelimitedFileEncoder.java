package lab4;

public class DelimitedFileEncoder implements FileEncodeStrategy {

    ContactListFileRecord fr;
    String delimiter;

    DelimitedFileEncoder(ContactListFileRecord fr,String delimiter) {
        this.fr = fr;
        this.delimiter = delimiter;
    }

    @Override
    public String getEncodedOutput() {
        return fr.getFirstName()
                + delimiter
                + fr.getLastName()
                + delimiter
                + fr.getStreetAddress()
                + delimiter
                + fr.getCity()
                + delimiter
                + fr.getState()
                + delimiter
                + fr.getZip()
                + delimiter
                + fr.getEmail()
                + delimiter
                + fr.getPhone();

    }
}
