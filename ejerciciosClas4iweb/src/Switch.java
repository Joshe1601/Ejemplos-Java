import java.util.ArrayList;
import java.util.Scanner;

public class Switch extends Equipo{
    private ArrayList<Puerto> listaPuertos = new ArrayList<>();

    void registrarSwitch(String name){
        Scanner sc = new Scanner(System.in);
        this.setNombre(name);

        System.out.print("Ingrese el modelo del equipo: ");
        String model = sc.nextLine();
        this.setModelo(model);

        System.out.print("Agregar puertos al Switch?: (S/N):");
        String pPuertos = sc.nextLine();

        Puerto p = new Puerto();

        boolean puertos = true;
        if (pPuertos.equalsIgnoreCase("n")) {
            puertos = false;
        }

        if(puertos){
            System.out.print("Puerto agregado: ");
            String puertoStr = sc.nextLine();
            int nPuerto = Integer.parseInt(puertoStr);
            p.setNumeroPuertos(nPuerto);


        } else {

            if(listaPuertos.isEmpty()){

            }
        }
    }

}
