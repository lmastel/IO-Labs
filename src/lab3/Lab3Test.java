package lab3;

import lab2.*;
import lab1.*;

public class Lab3Test {

    public static void main(String[] args) {
        
        //Read just the second record an output to the console
        Lab3Reader2 reader2 = new Lab3Reader2();
        //param = searchForRecordNumber 
        reader2.readFile(2);
        
        
    }
}
