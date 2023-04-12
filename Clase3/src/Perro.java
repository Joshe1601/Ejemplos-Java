import java.util.Scanner;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    
    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del perro: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        String edad = sc.nextLine();
       
        this.setNombre(nombre);
        this.setEdad(Integer.parseInt(edad));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
