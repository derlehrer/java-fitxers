package eines;

/**
 *
 * @author joan
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public abstract class EinesByteStream {

    public static void mostraBytes(String origen) throws FileNotFoundException, IOException {
        try (FileInputStream in = new FileInputStream(origen)) {
            int c;
            while ((c = in.read()) != -1) {                
                System.out.print(c);
            }

        }
    }
    public static byte[] tornaBytes(String origen) throws FileNotFoundException, IOException {
        ArrayList<Byte> bytes=new ArrayList<>();
        try (FileInputStream in = new FileInputStream(origen)) {
            int c;
            while ((c = in.read()) != -1) {
                bytes.add((byte) c);
            }

        }
        byte[]dades = new byte[bytes.size()];
        int i=0;
        for(Byte b:bytes){
            dades[i++]=b;
        }
        return dades;
    }
    public static void escriuBytes(byte[] dades, String desti) throws FileNotFoundException, IOException {
        //   byte[] dades = cadena.getBytes();

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(desti);
            for (byte b : dades) {
                out.write(b);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }

    public static void copiaBytes(String origen, String desti) throws FileNotFoundException, IOException {

        try (FileInputStream in = new FileInputStream(origen);
                FileOutputStream out = new FileOutputStream(desti)) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        }
    }
}
