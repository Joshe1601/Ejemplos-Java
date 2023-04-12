import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Demo.demoConArreglos();
        Demo.pruebasHashMap();

        Albergue albergue = new Albergue();

        System.out.println("Bienvenido al albergue");
        principal:
        while (true) {
            System.out.println("Ingrese la opción que desea realizar:");
            System.out.println("1) Registrar gato");
            System.out.println("2) Registrar perro");
            System.out.println("2.1) Registrar perro Forma 2");
            System.out.println("3) listar gato");
            System.out.println("4) listar perro");
            System.out.println("5) listar todo");
            System.out.println("6) salir");
            System.out.println("7) borrar gato");
            System.out.println("8) registrar cuy");
            System.out.println("9) listar cuyes");
            System.out.println("10) listar cuyes forma -foreach-");
            System.out.println("11) borrar cuy");
            System.out.print("Opción: ");

            Scanner sc = new Scanner(System.in);
            String opt = sc.nextLine();

            switch (opt) {
                case "1": //Registrar un gato
                    if (Albergue.indexArrGatos >= 10) {
                        System.out.printf("Ya no hay espacio gg");
                    } else {
                        System.out.print("Ingrese el nombre del gato: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el color: ");
                        String color = sc.nextLine();
                        Gato gato = new Gato();
                        gato.setNombre(nombre);
                        gato.setColor(color);

                        //albergue.getArregloGatos()[0] = gato;
                        Gato[] arr = albergue.getArregloGatos();
                        arr[Albergue.indexArrGatos] = gato;
                        Albergue.indexArrGatos++;
                    }
                    break;
                case "2":
                    albergue.registrarPerro();
                    break;
                case "2.1":
                    Perro perro = new Perro();
                    perro.registrarDatos();
                    albergue.registrarPerroEnArr(perro);
                    break;
                case "3": //listar gato
                    albergue.listarGatos();
                    break;
                case "4": // listar perro
                    albergue.listarPerros();
                    break;
                case "5": // listar todo
                    albergue.listarGatos();
                    albergue.listarPerros();
                    break;
                case "6":
                    break principal;
                case "7":
                    albergue.borrarGato();
                    break;
                case "8":
                    Cuy cuy = new Cuy();
                    cuy.registrarDatos();
                    albergue.registrarCuyEnLista(cuy);
                case "9":
                    albergue.listarCuyes();
                    break;
                case "10":
                    albergue.listarCuyesForEach();
                    break;
                case "11":
                    albergue.borrarOComerCuy();
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
            }
        }
    }
}