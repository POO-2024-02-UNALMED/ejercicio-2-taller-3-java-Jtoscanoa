package gestionHumana; //Nombre de la 'carpeta'
public class Empleado {
    public final long cedula; //Necesita ser accedido en otra clase de otro paquete
    private String nombre; //No necesita ser accedido en otra clase de otro paquete
    private String cargo; //No necesita ser accedido en otra clase de otro paquete
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public boolean tengoPermiso() {  //Necesita ser accedida desde otra clase de otro paquete
        return cargo.contains("Administrador");
    }
}