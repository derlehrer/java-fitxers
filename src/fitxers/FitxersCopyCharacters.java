package fitxers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    FileReader
    FileWriter
    Usa un int per llegir i escriure chars i desa el char als seus darrers 16 bits
    FileReader i FileWriter són uns Wrapper de FileInputStream and FileOutputStream
 */
public class FitxersCopyCharacters {

    public static void main(String[] args) throws IOException {

        try (FileReader inputStream = new FileReader("/home/jose/NetBeansProjects/fitxers/src/fitxers/infile.txt");
                FileWriter outputStream = new FileWriter("/home/jose/NetBeansProjects/fitxers/src/fitxers/charfile.txt")) {

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }
    }
}
