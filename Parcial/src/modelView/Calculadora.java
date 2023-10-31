
package modelView;

import view.*;


public class Calculadora {

    public static registros historial1 = new registros();
    static FormularioCal operaciones = new FormularioCal();
    static FormularioHis historico = new FormularioHis();
    static bodega Bodega = new bodega();
    static Verificar agregar = new Verificar();
    static Agregar verif = new Agregar();
    public static void main(String[] args) {
        
        operaciones.setVisible(true);

    }

    public static void guardar(String operacion) {
        historial1.registrar(operacion);
    }
    public static void MostrarIni() {
        historico.setVisible(false);
        
        
        operaciones.setVisible(true);
        
    }

    public static void MostrarRegis() {
        historico.setVisible(true);
        
        
        operaciones.setVisible(false);
    }
    public static void Mostrarbod() {
        Bodega.setVisible(true);
        operaciones.setVisible(false);
        historico.setVisible(false);
    }
    public static void Mostrarbodeplus(){
        agregar.setVisible(true);
        
    }
    public static void Mostrarbodeprove(){
        verif.setVisible(true);
    
}
    
    

    
}
