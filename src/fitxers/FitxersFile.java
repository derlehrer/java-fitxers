package fitxers;

import java.io.*;

/*
    Class File
*/
public class FitxersFile {

    public static void main(String[] args) {
        try {
            boolean newFile = false;
            File file = new File("/home/jose/NetBeansProjects/fitxers/src/fitxers/fileWriter.txt");
            //Aquí encara no hi ha fitxer, és només un objecte
            System.out.println("Existeix el fitxer? " + file.exists());
            //Cerca el fitxer real
            newFile = file.createNewFile();
            //Pot ser crea un fitxer!
            System.out.println(newFile);
            //Ja està creat?
            System.out.println("Existeix el fitxer? " + file.exists());
            //Mira de nou el fitxer real
        } catch (IOException e) {
            System.out.println("Error io");
        }
    }
}
