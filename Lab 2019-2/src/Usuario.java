import java.util.Scanner;

public class Usuario {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private Integer codigoPucp;
    private String email;
    private String condicion;
    private int edad;
    private int sueldo;
    private int anhoEgreso;
    private Actividad actividad;




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

    public Integer getCodigoPucp() {
        return codigoPucp;
    }

    public void setCodigoPucp(Integer codigoPucp) {
        this.codigoPucp = codigoPucp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnhoEgreso() {
        return anhoEgreso;
    }

    public void setAnhoEgreso(int anhoEgreso) {
        this.anhoEgreso = anhoEgreso;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public void registrarNombre(String nombre){
        while (true) {
            if (nombre.trim().isEmpty()) {
                System.out.print("Ingrese un nombre no vacio:");
                nombre = sc.nextLine();
            } else {
                break;
            }
        }
        this.setNombre(nombre);
    }

    public void registrarApellido(String apellido){
        while (true) {
            if (apellido.trim().isEmpty()) {
                System.out.print("Ingrese un nombre no vacio:");
                apellido = sc.nextLine();
            } else {
                break;
            }
        }
        this.setApellido(apellido);
    }

    public int contarCifras(Integer codigoPucp){
        int numeroCifras = 0;
        while (codigoPucp > 0){
            numeroCifras++;
            codigoPucp/=10;
        }
        return numeroCifras;
    }
}



