import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NetworkManager manager = new NetworkManager();
        System.out.println("---- Bienvenido ----");
        System.out.println("Ingrese el nombre de su red:");
        String nombreRed = sc.nextLine();

        NetworkManager network = new NetworkManager();
        network.setNombreRed(nombreRed);

        principal:
        while(true) {
            System.out.println("----------------------------");
            System.out.println("1. Agregar Vlan");
            System.out.println("2. Agregar Pc");
            System.out.println("3. Agregar Switch");
            System.out.println("4. Borrar Vlan");
            System.out.println("5. Borrar Pc");
            System.out.println("6. Reporte");
            System.out.println("0. Salir");

            System.out.println("--> Indique su opción:");
            String opt = sc.nextLine();

            switch(opt){
                case "1":
                    Vlan vlan = new Vlan();

                    System.out.print("Ingrese el nombre de la Vlan: ");
                    String name = sc.nextLine();

                    if(manager.getListaVlan().isEmpty()) {
                        vlan.registrarVlan(name);
                        manager.getListaVlan().add(vlan);
                        System.out.println("---- Vlan agregada----\n\n");

                    } else {
                        boolean nombreEncontrado = false;
                        for(Vlan n : manager.getListaVlan()){
                                if(n.getNombre().equals(name)){
                                    nombreEncontrado = true;
                                }
                            }

                        if(nombreEncontrado){
                            System.out.println("La vlan ya existe!");
                        } else {
                            vlan.registrarVlan(name);
                            manager.getListaVlan().add(vlan);
                            System.out.println("---- Vlan agregada----\n\n");
                        }
                    }
                    break;

                case "2":
                    Pc pc = new Pc();

                    System.out.print("Ingrese el nombre del equipo: ");
                    String name1 = sc.nextLine();
                    System.out.print("Ingrese el modelo del equipo: ");
                    String model = sc.nextLine();

                    if(manager.getListaequiposDisponibles().isEmpty()) {
                        pc.registrarPc(name1);
                        manager.getListaequiposDisponibles().add(pc);
                        System.out.println("---- Pc agregada----\n\n");

                    } else {
                        boolean nombreEncontrado = false;
                        for(Pc n : manager.getListaequiposDisponibles()){
                            if(n.getNombre().equals(name)){
                                nombreEncontrado = true;
                            }
                        }

                        if(nombreEncontrado){
                            System.out.println("La vlan ya existe!");
                        } else {
                            vlan.registrarVlan(name);
                            manager.getListaVlan().add(vlan);
                            System.out.println("---- Vlan agregada----\n\n");
                        }
                    }
                    break;

                    break;

                case "3":
                    if(manager.getListaVlan().isEmpty() && manager.getListaequiposDisponibles().isEmpty() ){
                        System.out.println("Debe registrar al menos una PC y una Vlan");
                    } else {
                        boolean vlanEncontrado = false;
                        boolean pcEncontrado = false;

                        for(Vlan n : manager.getListaVlan()){
                            if(n.getNombre().equals(name)){
                                vlanEncontrado = true;
                            }
                        }
                        for(Vlan n : manager.getListaVlan()){
                            if(n.getNombre().equals(name)){
                                pcEncontrado = true;
                            }
                        }
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "0":
                    break principal;
            }

        }

    }
}