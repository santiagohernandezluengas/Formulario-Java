package sena;
import confi.Conexion;

public class run {
    Conexion cnn = new Conexion();
    public static void main(String[] args){
        Cargar cr = new Cargar();
        cr.setVisible(false);
        cr.setLocationRelativeTo(null);
        
        /*Inicio ini = new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);*/
    }
}
