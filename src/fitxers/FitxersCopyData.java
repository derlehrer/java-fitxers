package fitxers;

import java.io.*;

public class FitxersCopyData {

    public static void main(String args[]) throws IOException {

        // Escribim una cadena de caràctes a un fitxer codificat as UTF-8
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/datafile.txt"));
        dataOut.writeUTF("hello world");

        // Llegim data del mateix arxiu
        DataInputStream dataIn = new DataInputStream(new FileInputStream("/home/jose/NetBeansProjects/fitxers/src/fitxers/datafile.txt"));

        while (dataIn.available() > 0) {
            String k = dataIn.readUTF();
            System.out.print(k + " ");
        }
    }
}
