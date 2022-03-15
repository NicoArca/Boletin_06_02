
package exercicio10;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        // Inicio
        Scanner sc = new Scanner(System.in);
        TreeSet<String> lista = new TreeSet();
        

        boolean fin = false;
        String fin_lista = "_FIN_";

        System.out.println("Introduce texto hasta cuando quieras.");
        System.out.println("Para parar escribe: _FIN_ ");

        while (fin != true) {
            String palabra = sc.next();
            
            if (palabra.equals(fin_lista)) {
                fin = true;
            }
            else{
                String palabra_minuscula = palabra.toLowerCase();
                lista.add(palabra_minuscula);
            }
        }
        
        Iterator<String> it = lista.iterator();
        System.out.println("Listado de las palabras ordenadas alfabeticamente:");
        
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
}
