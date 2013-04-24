package lab4;

public class FileDecoder3 implements FileDecodeStrategy<String,String> {

    private FileRecord1 fileRecord;
    
    private String delimiter;
    
    private final String SPACE = " ";
    
    public FileDecoder3(FileRecord1 fileRecord, String delimiter){
        this.fileRecord = fileRecord;
        this.delimiter = delimiter;
    }
    
    
        
    @Override
    public String getDatafromReader(String dataFromFile) {
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
        
        System.out.println(fileRecord.getFirstName());        
        System.out.println(fileRecord.getLastName());
        System.out.println(fileRecord.getStreetAddress());
        System.out.println(fileRecord.getCity());
        System.out.println(fileRecord.getState());
        System.out.println(fileRecord.getZip());
        System.out.println(fileRecord.getEmail());
        System.out.println(fileRecord.getPhone());
        System.out.println("");
                        
        return null;
    }



    
}
