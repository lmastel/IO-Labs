package lab4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileLineReader1 implements FileInputStrategy {

    private ContactListFileRecord fr;
    private FileDecodeStrategy decoder;
    private FormatStrategy formatter;

    public BinaryFileLineReader1(ContactListFileRecord fr,
            FileDecodeStrategy decoder,
            FormatStrategy formatter) {
        this.fr = fr;
        this.decoder = decoder;
        this.formatter = formatter;
    }

    @Override
    public void readInput() {

//        File data = new File(File.separatorChar + "temp" + File.separatorChar
//                + "lab1.txt");
        //File data = new File("src" + File.separatorChar + "lab1.txt");
        File data = new File("src/lab4.dat");

        DataInputStream in = null;

//        FileDecodeStrategy decoder = new DelimitedFileDecoder(fr,line,"#");

        try {

            //File data = new File("src/lab4.dat");

            if (data.exists()) {
                in = new DataInputStream(
                        new BufferedInputStream(
                        new FileInputStream(data)));


//String string = in.readUTF();

                while (in.available() > 0) {
                    fr.setFirstName(in.readUTF());
                    System.out.println(fr.getFirstName());
                    fr.setLastName(in.readUTF());
                    System.out.println(fr.getLastName());
                    fr.setStreetAddress(in.readUTF());
                    System.out.println(fr.getStreetAddress());
                    fr.setCity(in.readUTF());
                    System.out.println(fr.getCity());
                    fr.setState(in.readUTF());
                    System.out.println(fr.getState());
                    fr.setZip(in.readUTF());
                    System.out.println(fr.getZip());
                    fr.setEmail(in.readUTF());
                    System.out.println(fr.getEmail());
                    fr.setPhone(in.readUTF());
                    System.out.println(fr.getPhone());
                }

//                fr.setFirstName(in.readUTF());
//                System.out.println(fr.getFirstName());
//                fr.setLastName(in.readUTF());
//                fr.setStreetAddress(in.readUTF());
//                fr.setCity(in.readUTF());
//                fr.setState(in.readUTF());
//                fr.setZip(in.readUTF());
//                fr.setEmail(in.readUTF());
//                fr.setPhone(in.readUTF());

                //formatter.setLineFormat();


            }

        } catch (IOException ioe) {
            System.out.println("IOException reading input file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
