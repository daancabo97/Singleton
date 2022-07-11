package paquete2;

import paquete1.Conexion;

public class Aplicacion {

    // Instancia por constructor es prohibido por ser private
    public static void main(String[] args) {
        // Conexion conec = new Conexion();
        /* Singleton : Hacer la instancia a traves de la clase */
        Conexion conec = Conexion.getInstancia();        
        conec.Conectar();
        conec.Desconectar();
        
        boolean respuesta = conec instanceof Conexion;
        System.out.println(respuesta);
    }

}
