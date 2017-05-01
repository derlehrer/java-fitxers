package eines;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author joan
 */
public class EinesCharacterStream {

    public static void mostraCharacters(String origen) throws FileNotFoundException, IOException {
        try (FileReader in = new FileReader(origen)) {
//            while ((c = in.read()) != -1) {
            while (in.ready()) {
                char d = (char) in.read();
                System.out.print(d);
            }

        }
    }
    public static void inutil(String origen) throws FileNotFoundException, IOException {
        try (FileReader in = new FileReader(origen)) {
//            while ((c = in.read()) != -1) {
            while (in.ready()) {
                char d = (char) in.read();
                
            }

        }
    }

    public static void escriuCharacters(String cadena, String desti) throws IOException {
        try (FileWriter out = new FileWriter(desti)) {
//            for (int i=0; i<cadena.length(); i++) {
//                       out.write(cadena.charAt(i));
            out.write(cadena);
            }
        }

    

    public static void copiaCharacters(String origen, String desti) throws FileNotFoundException, IOException  {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader(origen);
            out = new FileWriter(desti);
           
            while(in.ready()){
                int c = in.read();
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
