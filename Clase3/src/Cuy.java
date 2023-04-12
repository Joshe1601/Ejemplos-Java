import java.util.Scanner;

public class Cuy {
    private String nombre;
    private String color;

    public void registrarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cuy: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();

        this.setNombre(nombre);
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
