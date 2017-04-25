package fitxers;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FitxersObjectXStream {

    public static void main(String[] args) {
        writeObject();
        readObject();
        writeLoopObject();
        readLoopObject();
    }

    private static void writeLoopObject() {
        ObjectOutputStream objOut = null;
        try {
            FileOutputStream fileOut = new FileOutputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/objectfile.txt");

            objOut = new ObjectOutputStream(fileOut);

            for (int i = 0; i < 5; i++) {
                Usuari u = new Usuari("Jose" + i, "Professor" + i, "email" + i);
                objOut.writeObject(u);
            }
            objOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            //Provar la opció de java 7 Autoclose
            try {
                if (objOut != null) {
                    objOut.close();
                }
            } catch (IOException closeException) {
                closeException.printStackTrace();
            }
        }
    }

    private static void readLoopObject() {
        ObjectInputStream objIn = null;
        try {
            FileInputStream fileIn = new FileInputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/objectfile.txt");
            if (fileIn == null) {
                throw new IOException("No trob fitxer.");
            }
            objIn = new ObjectInputStream(fileIn);

            while (true) {
                Usuari u = (Usuari) objIn.readObject();
                System.out.print("Nom: " + u.getNom());
                System.out.print(", Llinatge: " + u.getLlinatge());
                System.out.print(", Email: " + u.getEmail() + "\n");
            }
        } catch (EOFException e) {
            // Ignoram o feim el que sigui al final de fitxer.
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            //Provar la opció de java 7 Autoclose
            try {
                if (objIn != null) {
                    objIn.close();
                }
            } catch (IOException closeException) {
                closeException.printStackTrace();
            }
        }
    }

    private static void writeObject() {
        try {
            // Desa objecte usuari serialitzat a l'arxiu
            FileOutputStream fileOutputStream = new FileOutputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/objectfile.txt");
            Usuari user = new Usuari("Jose", "Professor", "email");
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
            output.writeObject(user);
            output.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObject() {
        try {
            //Llegeix file de l'arxiu desat

            FileInputStream fileInputStream = new FileInputStream(new File(
                    "/home/jose/NetBeansProjects/fitxers/src/fitxers/objectfile.txt"));
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            Usuari user2 = (Usuari) input.readObject();
            System.out.println(user2.getNom() + " " + user2.getLlinatge() + " " + user2.getEmail());
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
