package lab4;

public class FileDecoder2 implements FileDecodeStrategy {

    private FileRecord1 fileRecord;
    
    private String delimiter;
    
    private final String SPACE = " ";
    
    public FileDecoder2(FileRecord1 fileRecord, String delimiter){
        this.fileRecord = fileRecord;
        this.delimiter = delimiter;
    }
    
    
        
    @Override
    public Object getDatafromReader(Object dataFromFile) {
        //System.out.println(dataFromFile);
        String s = dataFromFile.toString();
        String[] lineParts = s.split(delimiter);
        
        fileRecord.setFirstName(lineParts[0]);
        fileRecord.setLastName(lineParts[1]);
        fileRecord.setStreetAddress(lineParts[2]);
        fileRecord.setCity(lineParts[3]);
        fileRecord.setState(lineParts[4]);
        fileRecord.setZip(lineParts[5]);
        fileRecord.setEmail(lineParts[6]);
        fileRecord.setPhone(lineParts[7]);
        
        System.out.println(fileRecord.getFirstName()
                + SPACE
                + fileRecord.getLastName()
                + SPACE
                + fileRecord.getStreetAddress()
                + SPACE
                + fileRecord.getCity()
                + SPACE
                + fileRecord.getState()
                + SPACE
                + fileRecord.getZip()
                + SPACE
                + fileRecord.getEmail()
                + SPACE
                + fileRecord.getPhone());
        
        return null;
    }



    
}
