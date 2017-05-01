/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxers.test;

import eines.EinesObjectStream;
import eines.EinesDataStreams;
import eines.EinesBufferedStream;
import eines.EinesByteStream;
import eines.EinesCharacterStream;
import auxiliar.Cronometre;
import auxiliar.Dades;
import auxiliar.DadesComplexes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author joan
 */
public class ProvesStreams {

    private final Cronometre crono;
    private final String path;
    private final String fitxer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProvesStreams proves = new ProvesStreams("/home/joan/PauCasesnoves/SWPRO/Tema_9/", "loremIpsum.txt");//dialeg.png");//"Himne dels pirates UTF-8.txt");

       // proves.provesByte();
//        proves.provesCharacter();
        proves.provesBuffered();
        //proves.provesData();
        //proves.provesObjectSimple();
        //proves.provesObjectComplexe();
        //proves.provesObjectLlista();
        //proves.provesMantenirReferencies();
    }

    public ProvesStreams(String path, String fitxer) {
        this.path = path;
        this.fitxer = fitxer;
        crono = new Cronometre();
    }

    public void provesByte() {
        try {
            crono.inicia();
            //ProvesByteStream.mostraBytes(path + fitxer);
            // EinesByteStream.escriuBytes("Això era i no era, bon viatge faci la cadernera", path + "dades.txt");
             EinesByteStream.copiaBytes("eclipse-jee-mars-2-linux-gtk-x86_64.tar.gz", "eclipse-jee-mars-2-linux-gtk-x86_64-2.tar.gz");
            // EinesByteStream.escriuBytes("Insuficiència".getBytes(), path+"bonDia.dat");
            // byte[] valors={1,2,3,4,5,63,64,65,66};
            //ProvesByteStream.escriuBytes(valors, path+"bonDia.dat");
            // valors=EinesByteStream.tornaBytes(path+"bonDia.dat");
//           EinesByteStream.tornaBytes(path+"bonDia.dat");
//            for(byte b:valors){
//                System.out.print(b+"\t");
//            }
//            System.out.println("");
        //    EinesByteStream.mostraBytes(path + "Tirant lo Blanc - Joanot Martorell.txt");
             crono.atura();
            System.out.println(crono.mostra());
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void provesCharacter() {
        try {
            crono.inicia();
//            EinesCharacterStream.mostraCharacters(path + "Tirant lo Blanc - Joanot Martorell.txt");
            EinesCharacterStream.inutil(path + "Tirant lo Blanc - Joanot Martorell.txt");
//            EinesCharacterStream.escriuCharacters("Això era i no era, bon viatge faci la cadernera", path + "dades.txt");
//            EinesCharacterStream.copiaCharacters(path + fitxer, path + "copialorem.txt");
            crono.atura();
            System.out.println(crono.mostra());
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }

    }

    public void provesBuffered() {
        try {
            crono.inicia();
//            String[] cadenes = EinesBufferedStream.mostraLine(path + "Tirant lo Blanc - Joanot Martorell.txt");
//            EinesBufferedStream.inutil(path + "Tirant lo Blanc - Joanot Martorell.txt");
            //String[] cadenes = {"Això era i no era, bon viatge faci la cadernera"};//,"2Aixo era i no era, bon viatge faci la cadernera2","3Aixo era i no era, bon viatge faci la cadernera"};
//            EinesBufferedStream.escriuCadenes(cadenes, path+"dades.txt");
//            EinesBufferedStream.copiaLines(path + fitxer, path + "copia" + fitxer);
            EinesBufferedStream.copyaBytesBuffered("/home/joan/Baixades/ubuntu-16.04-desktop-amd64.iso",  "/home/joan/Baixades/ubuntu-16.04-desktop-amd64.iso-2.zip");
            crono.atura();
            System.out.println(crono.mostra());
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void provesData() {
        try {
            double[] dades = {2.5, 4.2, 7.8, 9.0, 12.32, 23.56};
            EinesDataStreams.escriuDades(path + "dades.dat", dades);
            double[] llegides = EinesDataStreams.llegeixDades(path + "dades2.dat");

            if (llegides != null) {
                for (int index = 0; index < llegides.length; index++) {
                    System.out.println(dades[index] + " " + llegides[index]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void provesObjectSimple() {
        try {
            Dades original = new Dades(2, "Hola");
            EinesObjectStream.escriuObject(original, path + "objectes.dat");
            Dades llegit = (Dades) EinesObjectStream.llegeixObject(path + "objectes.dat");
            System.out.println("S'ha llegit " + llegit);
            System.out.println(original.equals(llegit));
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void provesObjectComplexe() {
        try {
            DadesComplexes original = new DadesComplexes("Identificador", 2, "Hola");
            EinesObjectStream.escriuObject(original, path + "objectes.dat");
            System.out.println("S'ha escrit " + original);
            DadesComplexes llegit = (DadesComplexes) EinesObjectStream.llegeixObject(path + "objectes.dat");
            System.out.println("S'ha llegit " + llegit);
            System.out.println("Comparació: " + original.equals(llegit));
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    public void provesObjectLlista() {
        try {

            ArrayList<Dades> llista = new ArrayList<>();
            for (int index = 1; index <= 10; index++) {
                llista.add(new Dades(index, "Som l'objecte " + index));
            }
            EinesObjectStream.escriuObject(llista, path + "objectes.dat");
            llista = (ArrayList<Dades>) EinesObjectStream.llegeixObject(path + "objectes.dat");
            for (Dades d : llista) {
                System.out.println(d);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    private void mostraLlista(ArrayList<Dades> llista) {
        llista.stream().forEach((d) -> {
            System.out.println(d);
        });
    }

    public void provesMantenirReferencies() {
        try {
            //Definim un arrayList amb dues còpies del mateix objecte
            ArrayList<Dades> original = new ArrayList<>();
            Dades dades = new Dades(2, "Hola");
            original.add(dades);
            original.add(dades);
            //Comprovam que són dues referències al mateix objecte
            dades.setNumeric(4);
            mostraLlista(original);
            //Guardam la original
            EinesObjectStream.escriuObject(original, path + "objectes.dat");
            //Recuperam la original
            ArrayList<Dades> recuperada = (ArrayList<Dades>) EinesObjectStream.llegeixObject(path + "objectes.dat");
            System.out.println("Recuperada");
            mostraLlista(recuperada);
            //Comprovam que són dues referències al mateix objecte
            Dades auxiliar = recuperada.get(0);
            auxiliar.setNumeric(8);
            mostraLlista(recuperada);
            if (recuperada.get(0).getNumeric() == recuperada.get(1).getNumeric()) {
                System.out.println("S'han mantingut");
            } else {
                System.out.println("No s'han mantingut");
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }

    }
}
