
import java.util.ArrayList;
import java.util.Scanner;

public class Albergue {

    private String nombre;
    private Gato[] arregloGatos = new Gato[10];
    private Perro[] arregloPerros = new Perro[10];
    public static int indexArrGatos = 0;
    public static int indexArrPerros = 0;
    private ArrayList<Cuy> listaCuyes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void registrarPerro() {
        System.out.print("Ingrese el nombre del perro: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        String edad = sc.nextLine();
        Perro perro = new Perro();
        perro.setNombre(nombre);
        perro.setEdad(Integer.parseInt(edad));

        arregloPerros[indexArrPerros] = perro;
        indexArrPerros++;
    }

    public void registrarPerroEnArr(Perro perro) {
        arregloPerros[indexArrPerros] = perro;
        indexArrPerros++;
    }

    public void listarGatos() {
        System.out.println("--- Lista de gatos ---");
        for (int i = 0; i < arregloGatos.length; i++) {
            if (arregloGatos[i] == null) {
                break;
            }
            System.out.println("Nombre gato: " + arregloGatos[i].getNombre());
        }
    }

    public void listarPerros() {
        System.out.println("--- Lista de perros ---");
        for (int i = 0; i < indexArrPerros; i++) {
            System.out.println("Nombre perro: " + arregloPerros[i].getNombre());
        }
    }

    public void borrarGato() {
        System.out.print("Ingrese el nombre del gato: ");
        String nombreGato = sc.nextLine();
        int enc = 0;
        for (int i = 0; i < indexArrGatos; i++) {
            if (arregloGatos[i].getNombre().equals(nombreGato)) {
                arregloGatos[i] = null;
                enc++;
            }
        }

        if (enc == 0) {
            System.out.println("gato no encontrado");
        } else {
            System.out.println(enc + " gatos borrados");
        }


    }

    public void registrarCuyEnLista(Cuy cuy) {
        listaCuyes.add(cuy);
    }

    public void listarCuyes() {
        System.out.println("-- lista cuyes para tómbola :D --");
        for (int i = 0; i < listaCuyes.size(); i++) {
            System.out.println("Nombre: " + listaCuyes.get(i).getNombre());
        }
    }

    public void listarCuyesForEach() {
        System.out.println("-- lista cuyes para tómbola foreach :D --");
        for (Cuy cuy : listaCuyes) {
            System.out.println("Nombre: " + cuy.getNombre());
        }
    }

    public void borrarOComerCuy() {
        System.out.print("Ingrese el color de cuy para cocinar: ");
        String color = sc.nextLine();

       /*for (Cuy c : listaCuyes) { //cuidado con esta forma de borrar!!
            if (c.getColor().equals(color)) {
                listaCuyes.remove(c);
            }
        }*/
        for(int i = 0 ; i< listaCuyes.size(); i++){
            if(listaCuyes.get(i).getColor().equals(color)){
                listaCuyes.remove(i);
                i--;
            }
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gato[] getArregloGatos() {
        return arregloGatos;
    }

    public void setArregloGatos(Gato[] arregloGatos) {
        this.arregloGatos = arregloGatos;
    }

    public Perro[] getArregloPerros() {
        return arregloPerros;
    }

    public void setArregloPerros(Perro[] arregloPerros) {
        this.arregloPerros = arregloPerros;
    }
}
