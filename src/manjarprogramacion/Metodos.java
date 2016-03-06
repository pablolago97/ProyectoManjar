package manjarprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author gallegomanuel88
 */
public class Metodos {

    public Clip clip;
    public String ruta = "/voces/";

    public int generarNumero() {
        int numeroAleatorio = (int) (Math.random() * 128);
        return numeroAleatorio;
    }

    //metodo sin hacer

    public void leerArchivo(int n) {
        File f;
        Scanner sc = null;
        try {
            f = new File("src/manjarprogramacion/voces.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                System.out.println(res);
                String [] arrayNumeroCancion = res.split(",");
                String [] arrayTituloCancion = res.split(".");
                if (Integer.parseInt(arrayNumeroCancion[0]) == n) {
                    System.out.println(arrayTituloCancion[0]);
                    sonido(arrayTituloCancion[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 " + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void sonido (String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
        }
    }
}
package manjarprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author gallegomanuel88
 */
public class Metodos {

    public Clip clip;
    public String ruta = "/audio/";

    public int generarNumero() {
        int numeroAleatorio = (int) (Math.random() * 5);
        return numeroAleatorio;
    }

    //metodo sin hacer

    public void leerArchivo(int n) {
        File f;
        Scanner sc = null;
        try {
            f = new File("src/manjarprogramacion/archivoCanciones.txt");
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String res = sc.nextLine();
                System.out.println(res);
                String [] arrayNumeroCancion = res.split(",");
                String [] arrayTituloCancion = res.split(".");
                if (Integer.parseInt(arrayNumeroCancion[0]) == n) {
                    sonido(arrayTituloCancion[0]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 " + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void sonido (String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
        }
    }
    
    
}
