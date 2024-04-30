package Excepciones.Clase16_04;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Intenta abrir un archivo que no existe para lanzar una IOException
            FileInputStream file = new FileInputStream("archivo_no_existente.txt");
        } catch (IOException e) {
            // Maneja la excepción
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
}
