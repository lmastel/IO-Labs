package lab4;

public class DelimitedFileDecoder implements FileDecodeStrategy {
    
    ContactListFileRecord fr;
    String delimiter;

    DelimitedFileDecoder(ContactListFileRecord fr,String delimiter) {
        this.fr = fr;        
        this.delimiter = delimiter;
    }

    @Override
    public String[] getDecodedInput(String line) {
        String[] lineParts = line.split(delimiter);
        //FileRecord fr = new FileRecord();
        fr.setFirstName(lineParts[0]);
        fr.setLastName(lineParts[1]);
        fr.setStreetAddress(lineParts[2]);
        fr.setCity(lineParts[3]);
        fr.setState(lineParts[4]);
        fr.setZip(lineParts[5]);
        fr.setEmail(lineParts[6]);
        fr.setPhone(lineParts[7]);
        return lineParts;
    }
}
