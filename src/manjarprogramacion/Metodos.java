package manjarprogramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gallegomanuel88
 */
public class Metodos {
    
    
    public int generarNumero (){
        int numeroAleatorio = (int) (Math.random()*5);
        return numeroAleatorio;
    }
    //metodo sin hacer
    public void leerArchivo (int n){
        File f ;
        Scanner sc= null;
        try {
            f = new File ("src/manjarprogramacion/archivoCanciones.txt");
            sc = new Scanner (f);
            while (sc.hasNext()){
                String res = sc.nextLine();
                System.out.println(res);
                int numeroCancion = Integer.parseInt(res.substring(0,1));
                if (numeroCancion == n){
                    System.out.println("funciona");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1 "+ ex.toString());
        }
        finally {
            sc.close();
        }
    }
}
