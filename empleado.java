package Estructura;

public class empleado {

    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String carga;

    public empleado(String Nombre, String Apellido, String Direccion, int Edad, String Carga) {

        nombre = Nombre;
        apellido = Apellido;
        direccion = Direccion;
        edad = Edad;
        carga = Carga;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

}
