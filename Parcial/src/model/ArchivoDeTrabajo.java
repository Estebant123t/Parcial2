/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author locon
 */
public class ArchivoDeTrabajo {
    private FirebaseDatabase firebaseDatabase;
    public void initFirebase() {
        try {
            
            FirebaseOptions firebaseOptions = new FirebaseOptions.Builder()
                    .setDatabaseUrl("https://parcial-6395e-default-rtdb.firebaseio.com/") 
                    .setServiceAccount(new FileInputStream(new File("C:\\Users\\412DA\\Desktop\\firstApp\\parcial-6395e-firebase-adminsdk-6mk9z-03e39a0a98.json")))
                   
                    .build();

            FirebaseApp.initializeApp(firebaseOptions);
            firebaseDatabase = FirebaseDatabase.getInstance();
            System.out.println("La conexion se realizo exitosamente...");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public FirebaseDatabase getDatabase() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
