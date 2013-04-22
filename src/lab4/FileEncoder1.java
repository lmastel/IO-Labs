package lab4;

public class FileEncoder1 implements FileEncodeStrategy {

    FileRecord1 fr;
    String delimiter;
    
    String separator = System.getProperty( "line.separator" );

    FileEncoder1(FileRecord1 fr,String delimiter) {
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
