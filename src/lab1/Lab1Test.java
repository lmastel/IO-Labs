package lab1;

public class Lab1Test {

    public static void main(String[] args) {
        //1) Read all records and output to console
        Lab1Reader1 reader1 = new Lab1Reader1();
        reader1.readFile();

        //2) Read just the second record an output to the console
        //Lab1Reader2 reader2 = new Lab1Reader2();
        //reader2.readFile();
        
        //3) Add a new record by appending the file. Then read all 
        //records back in and output to console to confirm that the 
        //new record can be read.
        //Lab1Writer1 writer1 = new Lab1Writer1();
        //writer1.writeFile();
        
        //Lab1Reader3 reader3 = new Lab1Reader3();
        //reader3.readFile();
    }
}
