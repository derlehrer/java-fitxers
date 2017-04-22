package fitxers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FitxersReadFileInOneLine {

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("/home/jose/NetBeansProjects/fitxers/src/fitxers/infile.txt")));
    }
}
