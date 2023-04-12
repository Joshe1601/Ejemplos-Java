import java.util.HashMap;

public class Demo {

    public static void demoConArreglos(){
        System.out.println("Hello world!");

        Perro perro = new Perro();
        System.out.println(perro);
        Perro[] arrPerros = new Perro[10];
        arrPerros[0] = new Perro();

        Perro p = new Perro();
        arrPerros[1] = p;

        p.setNombre("morita");

        Gato[] arrGatos = new Gato[5];
        for (int i = 0; i < arrGatos.length; i++) {
            arrGatos[i] = new Gato("michi " + i);
        }

        for (int i = 0; i < arrGatos.length; i++) {
            Gato g = arrGatos[i];
            System.out.println("nombre del gato: " + g.getNombre());
            //System.out.println("nombre del gato: " + arrGatos[i].getNombre());
        }

        int[] notas = {5,6,8,3}; //new int[4];
        Gato[] arr = {new Gato("felix"),new Gato("michi")};

        //System.out.println(arr[2].getNombre());

        int[] arrInts = new int[5];
        System.out.println(arrInts[0]);

        int[][] arrMulti2 = new int[2][3];
        arrMulti2[1] = new int[10];
        arrMulti2[1][0] = 5;

        arrMulti2[0] = new int[20];

        arrMulti2 = new int[5][];


    }

    public static void pruebasHashMap(){
        HashMap<String,String> map = new HashMap<>();
        map.put("1234568","Cesar");
        map.put("r43t4t","huvfidhfd");
        map.put("1234568","Juan");

        HashMap<Integer, Perro> map2 = new HashMap<>();
        map2.put(6,new Perro());
    }
}
