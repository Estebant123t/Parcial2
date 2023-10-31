/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelView;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author locon
 */
public class registros {
    public static ArchivoDeTrabajo conection = new ArchivoDeTrabajo();
    
    ArrayList<String> Transacciones;
    
    public registros() {
        Transacciones = new ArrayList<>();
    }

    public void registrar(String Operacion) {
        
        this.Transacciones.add(Operacion);
    }

    public ArrayList<String> getTransacciones() {
        return Transacciones;
    }
    public void guardarTransaccionesEnFirebase() {
    // Obtén una referencia a la base de datos de Firebase
    FirebaseDatabase database = conection.getDatabase();

    // Obtén una referencia al nodo "transacciones" en la base de datos
    DatabaseReference databaseReference = database.getReference("transacciones");

    // Guarda la lista de transacciones en Firebase
    databaseReference.setValue(Transacciones);
    }
}
