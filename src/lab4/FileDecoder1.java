package lab4;

public class FileDecoder1 implements FileDecodeStrategy {

    //private FileRecord1 fileRecord;
    
    //private String delimiter;
    
    private final String SPACE = " ";
    
//    public FileDecoder1(FileRecord1 fileRecord){
//        this.fileRecord = fileRecord;
//        
//    }
    
    
        
    @Override
    public Object getDatafromReader(Object dataFromFile) {
        System.out.println(dataFromFile);           
               
        return null;
    }



    
}
