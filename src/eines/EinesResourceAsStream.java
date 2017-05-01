package eines;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author joan
 */
public abstract class EinesResourceAsStream {

    public static void mostraBytes(String origen) throws FileNotFoundException, IOException {
        try (FileInputStream in = (FileInputStream) EinesResourceAsStream.class.getResourceAsStream(origen)) {
            int c;
            while ((c = in.read()) != -1) {
                char d = (char) c;
                System.out.print(d);
            }

        }
    }
}