
package lab4;


public interface FileDecodeStrategy<R,E> {
        
      public abstract R getDatafromReader (E dataFromFile);     

}