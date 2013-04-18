package lab4;

public class DelimitedFileEncoder implements FileEncodeStrategy {

    FileRecord fr;
    String delimiter;

    DelimitedFileEncoder(FileRecord fr,String delimiter) {
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
