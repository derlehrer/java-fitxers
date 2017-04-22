package fitxers;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/*
    I/O orientat a linies
    BufferedReader
    PrintWriter
 */
public class FitxersCopyLine {

    public static void main(String[] args) throws IOException {

        try (BufferedReader inputStream = new BufferedReader(new FileReader("/home/jose/NetBeansProjects/fitxers/src/fitxers/infile.txt")); 
                PrintWriter outputStream = new PrintWriter(new FileWriter("/home/jose/NetBeansProjects/fitxers/src/fitxers/outcharfile.txt"))) {

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
                System.out.println(l);
            }
        }
    }
}
