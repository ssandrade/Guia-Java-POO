/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import guia.poo.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c = new Cadena();

    public void mostrarVocales(Cadena c) {
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                cont++;
            }
        }

        System.out.println("En la frase hay " + cont + " vocales");
    }

    public void invertirFrase(Cadena c) {
        String vector[];
        vector = new String[c.getLongitud()];
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            vector[i] = letra;
            if (i == c.getLongitud() - 1) {
                System.out.print("Frase invertida: ");
                for (int j = c.getLongitud(); j > 0; j--) {
                    System.out.print("" + vector[j - 1]);
                }
            }
        }
    }

    public void vecesRepetido(Cadena c) {
        System.out.println("");
        System.out.println("ingrese la letra que quiere buscar");
        String n = leer.next();
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            String letra = c.getFrase().substring(i, i + 1);
            if (letra.equals(n)) {
                cont++;
            }

        }
        System.out.println("La letra (" + n + ") se repite " + cont + " veces");

    }

    public void compararLongitud(Cadena c) {
        System.out.println("ingrese una frase para identificar cual es mas larga");
        String cad = leer.next();
        int lcad = cad.length();

        if (lcad > c.getLongitud()) {
            System.out.println("La palabra " + cad + " es mas larga que " + c.getFrase());
        } else if (lcad == c.getLongitud()) {
            System.out.println("las palabras ingresadas tienen la misma cantidad de caracteres");
        } else {
            System.out.println("La palabra " + cad + " es mas corta que " + c.getFrase());
        }

    }

    public void unirFrases(Cadena c) {
        System.out.println("ingrese una frase para unir ");
        String s = leer.next();
        System.out.print("Frases unidas: " + c.getFrase() + " " + s);
        System.out.println("");

    }

    public void reemplazar(Cadena c) {
        System.out.println("¿Que letra quiere que reemplace a la letra(a)?");
        String s = leer.next();

        for (int i = 0; i < c.getLongitud(); i++) {
            String l = c.getFrase().substring(i, i + 1);
            if (l.equals("a")) {
                System.out.print(s);
            } else {
                System.out.print(l);
            }

        }
        System.out.println("");
    }

    public void contiene(Cadena c) {
        boolean d = true;
        System.out.println("Ingrese una letra para saber si la frase la contiene o no");
        String v = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            String l = c.getFrase().substring(i, i + 1);
            if (l.equals(v)) {
                d = true;
                break;
            } else {
                d = false;
            }
        }
        if (d) {
            System.out.println("VERDADERO");
        } else {
            System.out.println("FALSO");
        }

    }

}
