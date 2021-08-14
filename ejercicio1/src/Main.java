import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumno = 0;

        // ----------- instanciamiento del alumnos --------------
        Alumno alumno1 = new Alumno("carlos", 25);
        Alumno alumno2 = new Alumno("alejandro", 29);
        Alumno alumno3 = new Alumno("eimi", 21);

        System.out.print("¿que alumno desea elegir: 1 ,2 o 3?: ");
        alumno = entrada.nextInt();

        switch (alumno){
            case 1:
                int menu = 0;
                int menu2 =0;
                while (menu == 0) {

                    // se crea arreglo para almacenar materias y notas
                    ArrayList<String> asignaturaAlumno1 = new ArrayList();
                    ArrayList<Double> notasAlumno1 = new ArrayList();

                    while(menu2 == 0){
                        //se le asignan materias nuevas
                        asignaturaAlumno1.add("ingles");
                        asignaturaAlumno1.add("español");

                        // se asignan notas de las materias
                        notasAlumno1.add(4.5);
                        notasAlumno1.add(3.4);
                        alumno1.setNombreAsignatura(asignaturaAlumno1);
                        alumno1.setNota(notasAlumno1);

                        menu2 = 1;
                    }

                    // se envian a los metodos set y get los nombres, edad, asignaturas, notas y se calcula el promedio
                    alumno1.setNombre("carlos");
                    alumno1.setEdad(25);
                    alumno1.promedio(alumno1.getNota());

                    // se imprimen nombre, edad y numerod e asignaturas vistas
                    System.out.println("el nombre es: "+alumno1.getNombre());
                    System.out.println("la edad es: "+alumno1.getEdad());
                    System.out.println("El alumno "+alumno1.getNombre()+", curso "+ alumno1.getNombreAsignatura().size() +" asignaturas");

                    // se recorre el arreglo de las asignaturas y se imprime
                    System.out.println("");
                    System.out.println("nombre de las asignatura es: ");
                    for (int i = 0; i < alumno1.getNombreAsignatura().size(); i++){
                        System.out.print(alumno1.getNombreAsignatura().get(i) +", ");
                    }
                    // se recorre el arreglo de las notas y se imprime
                    System.out.println("");
                    System.out.println("Las notas son: ");
                    for (int i = 0; i < alumno1.getNota().size(); i++){
                        System.out.print(alumno1.getNota().get(i) +", ");
                    }
                    // se imprime las materias que fueron o no aprobadas
                    System.out.println("");
                    alumno1.aprobado(alumno1.getNota(), alumno1.getNombreAsignatura());

                    //se imprime el promedio
                    System.out.println("el promedio es: " + alumno1.promedio(alumno1.getNota()));

                    int menuIterable = 0;
                    System.out.print("¿quiere ingresar otra materia?:  Si: 0 - No: 1: ");
                    menuIterable = entrada.nextInt();

                    if (menuIterable == 0){
                        String materia;
                        Double nota;

                        System.out.print("Ingrese la materia: ");
                        materia = entrada.next();

                        System.out.print("Ingrese la Nota: ");
                        nota = entrada.nextDouble();

                        asignaturaAlumno1.add(materia);
                        notasAlumno1.add(nota);
                        alumno1.setNombreAsignatura(asignaturaAlumno1);
                        alumno1.setNota(notasAlumno1);

                    }else{
                        menu = 1;
                    }
                }
                break;
            case 2:
                int menuAlum2 = 0;
                int menu2Alum2 =0;
                while (menuAlum2 == 0) {

                    // se crea arreglo para almacenar materias y notas
                    ArrayList<String> asignaturaAlumno2 = new ArrayList();
                    ArrayList<Double> notasAlumno2 = new ArrayList();

                    while(menu2Alum2 == 0){
                        //se le asignan materias nuevas
                        asignaturaAlumno2.add("Diseño Web");
                        asignaturaAlumno2.add("Moviles 3");

                        // se asignan notas de las materias
                        notasAlumno2.add(4.8);
                        notasAlumno2.add(5.0);
                        alumno2.setNombreAsignatura(asignaturaAlumno2);
                        alumno2.setNota(notasAlumno2);

                        menu2Alum2 = 1;
                    }

                    // se envian a los metodos set y get los nombres, edad, asignaturas, notas y se calcula el promedio
                    alumno2.setNombre("Alejandro");
                    alumno2.setEdad(29);
                    alumno2.promedio(alumno2.getNota());

                    // se imprimen nombre, edad y numerod e asignaturas vistas
                    System.out.println("el nombre es: "+alumno2.getNombre());
                    System.out.println("la edad es: "+alumno2.getEdad());
                    System.out.println("El alumno "+alumno2.getNombre()+", curso "+ alumno2.getNombreAsignatura().size() +" asignaturas");

                    // se recorre el arreglo de las asignaturas y se imprime
                    System.out.println("");
                    System.out.println("nombre de las asignatura es: ");
                    for (int i = 0; i < alumno2.getNombreAsignatura().size(); i++){
                        System.out.print(alumno2.getNombreAsignatura().get(i) +", ");
                    }
                    // se recorre el arreglo de las notas y se imprime
                    System.out.println("");
                    System.out.println("Las notas son: ");
                    for (int i = 0; i < alumno2.getNota().size(); i++){
                        System.out.print(alumno2.getNota().get(i) +", ");
                    }
                    // se imprime las materias que fueron o no aprobadas
                    System.out.println("");
                    alumno2.aprobado(alumno2.getNota(), alumno2.getNombreAsignatura());

                    //se imprime el promedio
                    System.out.println("el promedio es: " + alumno2.promedio(alumno2.getNota()));

                    int menuIterable = 0;
                    System.out.print("¿quiere ingresar otra materia?:  Si: 0 - No: 1: ");
                    menuIterable = entrada.nextInt();

                    if (menuIterable == 0){
                        String materia2;
                        Double nota2;

                        System.out.print("Ingrese la materia: ");
                        materia2 = entrada.next();

                        System.out.print("Ingrese la Nota: ");
                        nota2 = entrada.nextDouble();

                        asignaturaAlumno2.add(materia2);
                        notasAlumno2.add(nota2);
                        alumno2.setNombreAsignatura(asignaturaAlumno2);
                        alumno2.setNota(notasAlumno2);

                    }else{
                        menuAlum2 = 1;
                    }
                }
                break;
            case 3:
                int menuAlum3 = 0;
                int menu3Alum3 =0;
                while (menuAlum3 == 0) {

                    // se crea arreglo para almacenar materias y notas
                    ArrayList<String> asignaturaAlumno3 = new ArrayList();
                    ArrayList<Double> notasAlumno3 = new ArrayList();

                    while(menu3Alum3 == 0){
                        //se le asignan materias nuevas
                        asignaturaAlumno3.add("bases de datos");
                        asignaturaAlumno3.add("Css");

                        // se asignan notas de las materias
                        notasAlumno3.add(4.5);
                        notasAlumno3.add(3.4);
                        alumno3.setNombreAsignatura(asignaturaAlumno3);
                        alumno3.setNota(notasAlumno3);

                        menu3Alum3 = 1;
                    }

                    // se envian a los metodos set y get los nombres, edad, asignaturas, notas y se calcula el promedio
                    alumno3.setNombre("Eimi");
                    alumno3.setEdad(21);
                    alumno3.promedio(alumno3.getNota());

                    // se imprimen nombre, edad y numerod e asignaturas vistas
                    System.out.println("el nombre es: "+alumno3.getNombre());
                    System.out.println("la edad es: "+alumno3.getEdad());
                    System.out.println("El alumno "+alumno3.getNombre()+", curso "+ alumno3.getNombreAsignatura().size() +" asignaturas");

                    // se recorre el arreglo de las asignaturas y se imprime
                    System.out.println("");
                    System.out.println("nombre de las asignatura es: ");
                    for (int i = 0; i < alumno3.getNombreAsignatura().size(); i++){
                        System.out.print(alumno3.getNombreAsignatura().get(i) +", ");
                    }
                    // se recorre el arreglo de las notas y se imprime
                    System.out.println("");
                    System.out.println("Las notas son: ");
                    for (int i = 0; i < alumno3.getNota().size(); i++){
                        System.out.print(alumno3.getNota().get(i) +", ");
                    }
                    // se imprime las materias que fueron o no aprobadas
                    System.out.println("");
                    alumno3.aprobado(alumno3.getNota(), alumno3.getNombreAsignatura());

                    //se imprime el promedio
                    System.out.println("el promedio es: " + alumno3.promedio(alumno3.getNota()));

                    int menuIterable = 0;
                    System.out.print("¿quiere ingresar otra materia?:  Si: 0 - No: 1: ");
                    menuIterable = entrada.nextInt();

                    if (menuIterable == 0){
                        String materia3;
                        Double nota3;

                        System.out.print("Ingrese la materia: ");
                        materia3 = entrada.next();

                        System.out.print("Ingrese la Nota: ");
                        nota3 = entrada.nextDouble();

                        asignaturaAlumno3.add(materia3);
                        notasAlumno3.add(nota3);
                        alumno3.setNombreAsignatura(asignaturaAlumno3);
                        alumno3.setNota(notasAlumno3);

                    }else{
                        menuAlum3 = 1;
                    }
                }
                break;
        }








    }




}
