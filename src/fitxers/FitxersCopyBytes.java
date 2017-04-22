package fitxers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileInputStream
    FileOutputStream
    Usa un int per llegir i escriure bytes i desa a byte als sesus darrers 8 bits
 */
public class FitxersCopyBytes {

    public static void main(String[] args) throws IOException {

        try (FileInputStream in = new FileInputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/infile.txt"); 
                FileOutputStream out = new FileOutputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/outfile.txt")) {
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
    }
}
