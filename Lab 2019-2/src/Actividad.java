import java.util.Scanner;

public class Actividad {
    Scanner sc = new Scanner(System.in);
    private String[] nombre = {"futsal", "voley", "4xjugo", "glotones", "basquet"};
    private String actividades;
    private String cargo;
    private int horasApoyo;
    private int diezmo;

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasApoyo() {
        return horasApoyo;
    }

    public void setHorasApoyo(int horasApoyo) {
        this.horasApoyo = horasApoyo;
    }

    public int getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(int diezmo) {
        this.diezmo = diezmo;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public void verificarCargo(String cargo){
        while(true) {
            if (cargo.equals("Barras") || cargo.equals("Jugar")) {
                this.setCargo(cargo);
                break;
            } else {
                System.out.println("Ingresa una condición correcta");
                System.out.print("Ingrese su cargo (Barras o jugar): ");
                cargo = sc.nextLine();
            }
        }
    }
}
