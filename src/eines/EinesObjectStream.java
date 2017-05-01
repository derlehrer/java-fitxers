package eines;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author joan
 */
public class EinesObjectStream {

    public static Object llegeixObject(String origen) throws ClassNotFoundException, IOException {
        ObjectInputStream in = null;
        Object dades = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(origen)));

            try {
                while (true) {
                    dades = in.readObject();
                }
            } catch (EOFException e) {
                System.out.println("EOF");
            }
        } finally {
            if (in != null) {
                in.close();
            }
            return dades;
        }
    }

    public static void escriuObject(Serializable objecte, String desti) throws FileNotFoundException, IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))) {

            out.writeObject(objecte);
        }
    }
}
