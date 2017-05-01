package eines;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author joan
 */
public class EinesBufferedStream {

//    outputStream = new BufferedWriter(new FileWriter("characteroutput.txt"));
//    inputStream = new BufferedReader(new FileReader("xanadu.txt"));
    public static String[] mostraLine(String origen) throws FileNotFoundException, IOException {
        ArrayList<String> cadenes = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(origen))) {
            String linia;
            while ((linia = in.readLine()) != null) {
                System.out.println(linia);
                cadenes.add(linia);
            }
            String[] resultat = new String[cadenes.size()];
            for (int index = 0; index < resultat.length; index++) {
                resultat[index] = cadenes.get(index);
            }
            return resultat;
        }
    }


    public static void inutil(String origen) throws FileNotFoundException, IOException {

        try (BufferedReader in = new BufferedReader(new FileReader(origen))) {
            String linia;
            while ((linia = in.readLine()) != null) {
                
            }
        }
    }

    public static void escriuCadenes(String[] cadenes, String desti) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(desti))) {
            for (String s : cadenes) {
                out.write(s);
                out.newLine();
            }
        }

    }

    public static void copiaLines(String origen, String desti) throws FileNotFoundException, IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader(origen));
            out = new BufferedWriter(new FileWriter(desti));
            String linia;
            while ((linia = in.readLine()) != null) {
                out.write(linia);
                out.newLine();
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
        public static void copyaBytesBuffered(String origen, String desti) throws FileNotFoundException, IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(origen));
            out = new BufferedOutputStream(new FileOutputStream(desti));
            int linia;
            while ((linia = in.read()) != -1) {
                out.write(linia);
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
