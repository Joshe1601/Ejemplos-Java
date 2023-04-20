import java.util.Scanner;

public class Pc extends Equipo {
    void registrarPc(String name) {

        Scanner sc = new Scanner(System.in);
        this.setNombre(name);

        System.out.print("Ingrese el modelo del equipo: ");
        String model = sc.nextLine();
        this.setModelo(model);

    }
}
