
package modelView;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import model.ArchivoDeTrabajo;


public class Operaciones {
    public static String iniciarsesion(String nombre, String Contraseña){
        
        try {
            FileWriter fileWriter = new FileWriter("Usuarios.txt", true); // El segundo parámetro "true" permite agregar al archivo existente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            System.out.println("Ingrese el elemento a agregar:");
            
            
            bufferedWriter.write(nombre);
            bufferedWriter.write(" ");
            bufferedWriter.write(Contraseña);
            
            bufferedWriter.newLine();
            
            bufferedWriter.close();
            return "Elemento agregado correctamente.";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String Registrar(String nombre, String Contraseña, String Contraseña1){
        
        try {
            if (Contraseña == Contraseña1){
                FileWriter fileWriter = new FileWriter("Usuarios.txt", true); // El segundo parámetro "true" permite agregar al archivo existente
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
               System.out.println("Ingrese el elemento a agregar:");
            
            
                bufferedWriter.write(nombre);
                bufferedWriter.write(" ");
                bufferedWriter.write(Contraseña);
            
                bufferedWriter.newLine();
               
                bufferedWriter.close();
                return "Elemento agregado correctamente.";
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    

    
}
