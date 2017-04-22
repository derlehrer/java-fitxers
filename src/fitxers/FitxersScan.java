package fitxers;

import java.io.*;
import java.util.Scanner;

public class FitxersScan {

    public static void main(String[] args) throws IOException {
        
        Reader fileReader = new FileReader("/home/jose/NetBeansProjects/fitxers/src/fitxers/infile.txt");
        
        try (Scanner s = new Scanner(new BufferedReader(fileReader))) {
            //Per utilitzar un delimitador diferent a espai es fa servir
            //s.useDelimiter(",\\s*"); amb una expressió regular
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        }
    }
}
