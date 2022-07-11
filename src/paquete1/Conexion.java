/* Singleton : Hacer la instancia a traves de la clase */
package paquete1;

public class Conexion {

    private static Conexion instancia;
    // private static Conexion instancia = new conexion();
    // para evitar la instancia mediante el operador new

    private Conexion() {
        // para obtener la instancia unicamente por este metodo
        // la palabra reservada static hace posible el acceso mediante la clase . y el metodo 

    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    
    //Metodo de prueba
    public void Conectar() {
        System.out.println("Me conecto a la base de datos");
        
    }
    public void Desconectar(){
        System.out.println("Me desconecto de la base de datos");
    }
}
