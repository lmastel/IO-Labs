package lab4;

public class FileDecoder1 implements FileDecodeStrategy<String,String> {

    //private FileRecord1 fileRecord;
    
    //private String delimiter;
    
    private final String SPACE = " ";
    
  
    
        
    @Override
    public String getDatafromReader(String dataFromFile) {
        System.out.println(dataFromFile);           
               
        return dataFromFile;
    }



    
}
