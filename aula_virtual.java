import java.util.Scanner;
public class aula_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[10];
        String[] codigos = new String[10];
        String[] cursos = new String[10];
        String[] instructores = new String[10];
        int[] estudiantes = new int[10];
        String[] horarios = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------//
        //--|menu_principal_de_aula_virtual|--//
        //------------------------------------//
        do {
            System.out.println("menu principal de aula virtual");
            System.out.println("1) Registrar aula");
            System.out.println("2) Editar aula");
            System.out.println("3) Listar aulas");
            System.out.println("4) Buscar aula");
            System.out.println("5) Eliminar aula");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------//
                //--|registrar_aula|--//
                //--------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del aula");
                    System.out.println("id del aula a registrar: " + id);
                    System.out.print("nombre del aula: ");
                    nombres[total] = entrada.nextLine();
                    System.out.print("codigo del aula: ");
                    codigos[total] = entrada.nextLine();
                    System.out.print("nombre del curso: ");
                    cursos[total] = entrada.nextLine();
                    System.out.print("instructor: ");
                    instructores[total] = entrada.nextLine();
                    System.out.print("cantidad de estudiantes: ");
                    estudiantes[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("horario: ");
                    horarios[total] = entrada.nextLine();
                    System.out.print("estado del aula: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Aula registrada correctamente.");
                    total++;
                    break;
                //-----------------//
                //--|editar_aula|--//
                //-----------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen aulas registradas.");
                        break;
                    }
                    System.out.println("Datos de las aulas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Codigo: " + codigos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Estudiantes: " + estudiantes[i] + " | Horario: " + horarios[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del aula: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del aula");
                        System.out.print("Nuevo nombre del aula: ");
                        nombres[posicion] = entrada.nextLine();
                        System.out.print("Nuevo codigo del aula: ");
                        codigos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nombre del curso: ");
                        cursos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo instructor: ");
                        instructores[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de estudiantes: ");
                        estudiantes[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo horario: ");
                        horarios[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del aula: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Aula actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------//
                //--|listar_aulas|--//
                //------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen aulas registradas.");
                    } else {
                        System.out.println("Lista de aulas");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Codigo: " + codigos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Estudiantes: " + estudiantes[i] + " | Horario: " + horarios[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------//
                //--|buscar_aula|--//
                //-----------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen aulas registradas.");
                        break;
                    }
                    System.out.println("busqueda de aula");
                    System.out.print("ingresa la id para buscar aula: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del aula encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Nombre: " + nombres[posicion] + " | Codigo: " + codigos[posicion] + " | Curso: " + cursos[posicion] + " | Instructor: " + instructores[posicion] + " | Estudiantes: " + estudiantes[posicion] + " | Horario: " + horarios[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------//
                //--|eliminar_aula|--//
                //-------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen aulas registradas.");
                        break;
                    }
                    System.out.println("Datos de las aulas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Nombre: " + nombres[i] + " | Codigo: " + codigos[i] + " | Curso: " + cursos[i] + " | Instructor: " + instructores[i] + " | Estudiantes: " + estudiantes[i] + " | Horario: " + horarios[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del aula a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombres[i] = nombres[i + 1];
                            codigos[i] = codigos[i + 1];
                            cursos[i] = cursos[i + 1];
                            instructores[i] = instructores[i + 1];
                            estudiantes[i] = estudiantes[i + 1];
                            horarios[i] = horarios[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Aula eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Aula Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}