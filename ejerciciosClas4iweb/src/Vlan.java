import java.util.Scanner;

public class Vlan{
    private String nombre;
    private boolean permiteCorreo;
    private boolean permiteFacebook;
    private boolean permiteWow;


    void registrarVlan(String name){
        Scanner sc = new Scanner(System.in);
        this.setNombre(name);

        System.out.print("Permite correo? (S/N): ");
        String pCorreo = sc.nextLine();
        if (pCorreo.equalsIgnoreCase("s")) {
            this.setPermiteCorreo(true);
        } else {
            this.setPermiteCorreo(false);
        }

        System.out.print("Permite Facebook? (S/N): ");
        String pFace = sc.nextLine();
        if (pFace.equalsIgnoreCase("s")) {
            this.setPermiteFacebook(true);
        } else {
            this.setPermiteFacebook(false);
        }

        System.out.print("Permite WoW? (S/N): ");
        String pWow = sc.nextLine();
        if (pWow.equalsIgnoreCase("s")) {
            this.setPermiteWow(true);
        } else {
            this.setPermiteWow(false);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPermiteCorreo() {
        return permiteCorreo;
    }

    public void setPermiteCorreo(boolean permiteCorreo) {
        this.permiteCorreo = permiteCorreo;
    }

    public boolean isPermiteFacebook() {
        return permiteFacebook;
    }

    public void setPermiteFacebook(boolean permiteFacebook) {
        this.permiteFacebook = permiteFacebook;
    }

    public boolean isPermiteWow() {
        return permiteWow;
    }

    public void setPermiteWow(boolean permiteWow) {
        this.permiteWow = permiteWow;
    }
}
