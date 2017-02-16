package masarchivosjava;

import java.util.StringTokenizer;
import java.io.*;

public class Inventario {
    public static void main (String [] args) {
        final int MAX = 100;
        Cosa [] items = new Cosa [MAX];
        StringTokenizer tokenizer;
        String línea, nombre, arch =  "inventario.dat";
        int unidades, cuenta = 0;
        float precio;
        
        try {
            FileReader fr = new FileReader (arch);
            BufferedReader archEnt = new BufferedReader (fr);            
            línea = archEnt.readLine ();
            while (línea != null) {
                tokenizer = new StringTokenizer (línea);
                nombre = tokenizer.nextToken ();
                try {
                    unidades = Integer.parseInt (tokenizer.nextToken ());
                    precio = Float.parseFloat (tokenizer.nextToken ());
                    items [cuenta++] = new Cosa (nombre, unidades, precio);
                } catch (NumberFormatException exc) {
                    System.out.println ("Error en la entrada. Linea ignorada");
                    System.out.println (línea);
                }
                línea = archEnt.readLine ();
            }
            archEnt.close ();            
            for (int s = 0; s < cuenta; s++)
                System.out.println (items [s]);
         } catch (FileNotFoundException exc) {
             System.out.println ("El archivo " + arch + " no fue encontrado ");
         } catch (IOException exc) {
             System.out.println (exc);
         }
     }
 }
