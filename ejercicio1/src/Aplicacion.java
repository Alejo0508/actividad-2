import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

    public static  void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int alumno = 0;

        // se crea arreglos con los nombres y edades
        String[] nombres = {"Carlos", "Alejandro", "Eimi"};
        int[] edades = {25, 29, 21};

        // se instancia un objeto de alumno
        Alumno objAlumno;

        // ----------- instanciamiento de los 3 alumnos y se le agrega su posicion en los arreglos de nombres y edad--------------
        Alumno alumno1 = new Alumno(nombres[0], edades[0]);
        Alumno alumno2 = new Alumno(nombres[1], edades[1]);
        Alumno alumno3 = new Alumno(nombres[2], edades[2]);

        // se pregunta que alumno quiere para trabajar
        System.out.print("¿que alumno desea elegir: 1 ,2 o 3?: ");
        alumno = entrada.nextInt();

        // se crea switch para elejir el alumno que se trabajara
        switch (alumno){
            case 1:
                objAlumno = alumno1;  // se iguala el objAlumno al alumno correspondiente al caso
                break;
            case 2:
                objAlumno = alumno2;  // se iguala el objAlumno al alumno correspondiente al caso
                break;
            case 3:
                objAlumno = alumno3;  // se iguala el objAlumno al alumno correspondiente al caso
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + alumno);
        }

        int menu = 0;
        int iterador =0;
        while (menu == 0) {

            // se crea arreglo para almacenar materias y notas
            ArrayList<String> asignaturaAlumno = new ArrayList();
            ArrayList<Double> notasAlumno = new ArrayList();

            while(iterador == 0){
                //se le asignan materias nuevas
                asignaturaAlumno.add("ingles");
                asignaturaAlumno.add("español");

                // se asignan notas de las materias
                notasAlumno.add(4.5);
                notasAlumno.add(3.4);
                objAlumno.setNombreAsignatura(asignaturaAlumno);
                objAlumno.setNota(notasAlumno);

                iterador = 1;
            }

            // se envian a los metodos set y get los nombres, edad, asignaturas, notas y se calcula el promedio
            objAlumno.setNombre(nombres[alumno-1]);
            objAlumno.setEdad(edades[alumno-1]);
            objAlumno.promedio(objAlumno.getNota());

            // se imprimen nombre, edad y numerod e asignaturas vistas
            System.out.println("el nombre es: "+objAlumno.getNombre());
            System.out.println("la edad es: "+objAlumno.getEdad());
            System.out.println("El alumno "+objAlumno.getNombre()+", curso "+ objAlumno.getNombreAsignatura().size() +" asignaturas");

            // se recorre el arreglo de las asignaturas y se imprime
            System.out.println("");
            System.out.println("nombre de las asignatura es: ");
            for (int i = 0; i < objAlumno.getNombreAsignatura().size(); i++){
                System.out.print(objAlumno.getNombreAsignatura().get(i) +", ");
            }
            // se recorre el arreglo de las notas y se imprime
            System.out.println("");
            System.out.println("Las notas son: ");
            for (int i = 0; i < objAlumno.getNota().size(); i++){
                System.out.print(objAlumno.getNota().get(i) +", ");
            }
            // se imprime las materias que fueron o no aprobadas
            System.out.println("");
            objAlumno.aprobado(objAlumno.getNota(), objAlumno.getNombreAsignatura());

            //se imprime el promedio
            System.out.println("el promedio es: " + objAlumno.promedio(objAlumno.getNota()));

            int menuIterable = 0;
            System.out.print("¿quiere ingresar otra materia?:  Si: 0 - No: 1: ");
            menuIterable = entrada.nextInt();

            // menu que pregunta por una nueva materia o no
            if (menuIterable == 0){
                String materia;
                Double nota;

                System.out.print("Ingrese la materia: ");
                materia = entrada.next();

                System.out.print("Ingrese la Nota: ");
                nota = entrada.nextDouble();

                asignaturaAlumno.add(materia);
                notasAlumno.add(nota);
                objAlumno.setNombreAsignatura(asignaturaAlumno);
                objAlumno.setNota(notasAlumno);

            }else {
                menu = 1;
            }
        }
    }
}
