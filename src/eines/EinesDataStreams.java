package eines;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author joan
 */
public class EinesDataStreams {

    public static void escriuDades(String desti, double[] dades) throws FileNotFoundException, IOException {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(desti)))) {

            out.writeInt(dades.length);
            for (int index = 0; index < dades.length; index++) {
                out.writeDouble(dades[index]);
            }
        }

    }

    public static double[] llegeixDades(String origen) throws IOException {
        DataInputStream in = null;
        double[] resultat = null;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(origen)));
            resultat = new double[in.readInt()];
            int index = 0;
            while (true) {
                resultat[index++] = in.readDouble();
            }
        } catch (EOFException ex) {
            System.out.println(ex.getStackTrace()[0]);
        } finally {
            if (in != null) {
                in.close();
            }
            return resultat;
        }

    }
}
