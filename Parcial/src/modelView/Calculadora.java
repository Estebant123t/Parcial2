
package modelView;

import view.FormularioCal;
import view.FormularioHis;


public class Calculadora {

    public static registros historial1 = new registros();
    static FormularioCal operaciones = new FormularioCal();
    static FormularioHis historico = new FormularioHis();
    
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
    
    

    
}
