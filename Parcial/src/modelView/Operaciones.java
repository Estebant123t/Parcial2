
package modelView;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
    
    public static String Agregarelementos(String elemento){
        
        try {
            FileWriter fileWriter = new FileWriter("Usuarios.txt", true); // El segundo parámetro "true" permite agregar al archivo existente
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            System.out.println("Ingrese el elemento a agregar:");
            
            
            bufferedWriter.write(elemento);
            bufferedWriter.newLine();
            
            bufferedWriter.close();
            return "Elemento agregado correctamente.";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void borrarElemento(String elemento) {
        try {
            File inputFile = new File("archivo.txt");
            File tempFile = new File("tempFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            String currentLine;
            
            while ((currentLine = reader.readLine()) != null) {
                if (!currentLine.equals(elemento)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
            
            writer.close();
            reader.close();
            
            if (inputFile.delete()) {
                if (tempFile.renameTo(inputFile)) {
                    System.out.println("Elemento borrado correctamente.");
                } else {
                    System.out.println("Error al renombrar el archivo temporal.");
                }
            } else {
                System.out.println("Error al eliminar el archivo original.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
