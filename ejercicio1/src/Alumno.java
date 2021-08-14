import java.util.ArrayList;

public class Alumno extends Asignatura{

    //atributos nombre y edad
    private String nombre;
    private int edad;

    public Alumno(ArrayList<String> nombreAsignatura, ArrayList<Double> nota, String nombre, int edad) {
        super(nombreAsignatura, nota);
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor que acepte como parámetro el nombre del alumno y edad.
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double promedio(ArrayList<Double> nota){
        Double promedio = 0.0;
        Double notasTotal = 0.0;

        for(int i = 0; i < nota.size(); i++) {
            notasTotal += nota.get(i);
        }
        promedio = notasTotal / nota.size();
          return promedio;
    }



}
