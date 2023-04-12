import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Actividad actividad = new Actividad();
        Usuario user1 = new Usuario();
        user1.setActividad(actividad);

        int codeAux = 0;

        principal:
        while(true) {
            System.out.println("\n\nBIENVENIDOS AL LABORATORIO 1\n\n");

            if (codeAux == 0) {
                System.out.println("Usted aún no se ha registrado, ingrese sus datos personales:");

/*
              System.out.print("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                while (true) {
                    if (nombre.trim().isEmpty()) {
                        System.out.print("Ingrese un nombre no vacio:");
                        nombre = sc.nextLine();
                    } else {
                        break;
                    }
                }
*/
                System.out.print("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                user1.registrarNombre(nombre);

                System.out.print("Ingrese su apellido: ");
                String apellido = sc.nextLine();
                user1.registrarApellido(apellido);

                System.out.print("Ingrese su código PUCP: ");
                Integer codigo = sc.nextInt();
                codeAux = codigo;
                sc.nextLine();

                System.out.print("Ingrese su mail PUCP: ");
                String email = sc.nextLine();

                while (true) {
                    System.out.print("Ingrese su condición (Alumno o Egresado): ");
                    String condition = sc.nextLine();

                    if (condition.equals("Alumno") || condition.equals("Egresado")) {
                        user1.setCondicion(condition);
                        break;
                    } else {
                        System.out.println("Ingresa una condición correcta");
                    }
                }

                System.out.print("Ingrese su edad: ");
                int edad = sc.nextInt();

                if (user1.getCondicion().equals("Alumno")) {
                    user1.setSueldo(0);
                } else {
                    System.out.print("Ingrese su sueldo: ");
                    int sueldo = sc.nextInt();
                    user1.setSueldo(sueldo);
                }


                if (user1.getCondicion().equals("Alumno")) {
                    user1.setAnhoEgreso(0);
                } else {
                    System.out.print("Ingrese su año de egreso: ");
                    int anhoEgreso = sc.nextInt();
                    user1.setAnhoEgreso(anhoEgreso);
                }

//                user1.setNombre(nombre);
//                user1.setApellido(apellido);
                user1.setCodigoPucp(codigo);
                user1.setEmail(email);
                user1.setEdad(edad);

            }else {

                System.out.println("Ingrese su código PUCP: ");
                int input = sc.nextInt();
                sc.nextLine();
                if (input == user1.getCodigoPucp()) {

//                    principal:
                    while(true) {
                        System.out.println("\n\nBienvenido " + user1.getNombre() + " " + user1.getApellido());
                        System.out.println("Escoja una de las siguientes opciones:");
                        System.out.println("Opcion (1): Registrar actividad a la cual apoyare");
                        System.out.println("Opcion (2): Diagnóstico de apoyo");
                        System.out.println("Opcion (3): Ver mi resumen");
                        System.out.println("Opcion (4): Salir del menu");

                        System.out.println("\nIngrese su opcion: ");
                        String opt = sc.nextLine();

                        switch (opt) {
                            case "1":
                                System.out.print("Ingrese la actividad a la cual apoyara:");

                                boolean nombreEnc = false;
//                            String[] arr = actividad.getNombre();

                                while (true) {
                                    String activ = sc.nextLine();
                                    for (String nombre : actividad.getNombre()) {
                                        if (nombre.equals(activ)) {
                                            nombreEnc = true;
                                            break;
                                        }
                                    }

                                    if (nombreEnc) {
                                        actividad.setActividades(activ);

                                        System.out.print("Ingrese su cargo (Barras o jugar): ");
                                        String cargo = sc.nextLine();
                                        actividad.verificarCargo(cargo);

                                        System.out.print("Ingrese sus horas de apoyo a la fibra: ");
                                        String horasStr = sc.nextLine();
                                        int horas = Integer.parseInt(horasStr);
                                        actividad.setHorasApoyo(horas);

                                        System.out.print("Ingrese su diezmo: ");
                                        String diezmoStr = sc.nextLine();
                                        int diezmo = Integer.parseInt(diezmoStr);
                                        actividad.setDiezmo(diezmo);

                                        break;
                                    } else {
                                        System.out.println("Ingrese un nombre de actividad correcto");
                                        System.out.print("Ingrese la actividad a la cual apoyara:");
                                    }
                                }
                                break;

                            case "2":
                                if (user1.getCondicion().equals("Egresado")) {
                                    int lengthCifras = user1.contarCifras(user1.getCodigoPucp());
                                    double factor = user1.getEdad() + lengthCifras;
                                    double diezmoDeseado = user1.getSueldo() * 0.1 + (2023 - user1.getAnhoEgreso()) * factor;

                                    if (actividad.getDiezmo() > diezmoDeseado) {

                                        int diezmoDeseadoInt = Double.valueOf(diezmoDeseado).intValue();
                                        actividad.setDiezmo(diezmoDeseadoInt);
                                    }

                                    double delta = (1 - (actividad.getDiezmo() * 1f / diezmoDeseado)) * 100;

                                    if (0 <= delta && delta <= 10) {
                                        System.out.println("Usted es un hincha de naacimiento, se agradece profundamente");
                                    } else if (11 <= delta && delta <= 30) {
                                        System.out.println("Usted es un hincha, la fibra está con usted");

                                    } else if (31 <= delta && delta <= 50) {
                                        System.out.println("Usted necesita alentar más a la fibra, pero la fibra está conforme");

                                    } else if (51 <= delta && delta <= 70) {
                                        System.out.println("Necesita encariñarse más con la fibra, sabemos que el prox año");

                                    } else if (71 <= delta && delta <= 99) {
                                        System.out.println("Usted es un pecho frío, pero se agradece la colaboración");

                                    } else if (delta == 100) {
                                        System.out.println("Usted no tiene comentarios puesto que no apoyó a la fibra");

                                    }
                                } else {
                                    System.out.println("Usted apoyó con " + actividad.getDiezmo() + " soles y se le agradece");
                                }
                                break;

                            case "3":
                                System.out.println("Nombre completo: " + user1.getNombre() + " " + user1.getApellido());
                                System.out.println("Edad: " + user1.getEdad());
                                System.out.println("Codigo PUCP: " + user1.getCodigoPucp());
                                System.out.println("Apoyo a la actividad de: " + actividad.getActividades() + " como parte de " + actividad.getCargo());
                                System.out.println("Ademas apoyó a la fibra con " + actividad.getHorasApoyo() + " horas");
                                break;

                            case "4":
                                break principal;
                            default:
                                System.out.println("Ingrese una opcion correcta");
                        }
                    }
//                    break;
                } else {
                    System.out.print("Código incorrecto, ingreselo de nuevo");
                }
            }
        }
    }
}



