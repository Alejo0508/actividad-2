import java.util.ArrayList;

public  class Asignatura {

    ArrayList<String> nombreAsignatura;
    ArrayList<Double> nota;

    public Asignatura() {
    }

    // Constructor que acepte como parámetros el nombre de la asignatura y la nota obtenida
    public Asignatura(ArrayList<String> nombreAsignatura, ArrayList<Double> nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    //Métodos para modificar la nota (setNota()) y para consultar la nota getNota()).
    public ArrayList<Double> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Double> nota) {
        this.nota = nota;
    }

    // Método para agregar una Asignatura a su plan de estudio
    public ArrayList<String> getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(ArrayList<String> nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    // Método que nos devuelva "Aprobado" si la nota es mayor o igual a 3.5 o "Reprobado" si la nota es menor que 3.5.
    public void aprobado(ArrayList<Double> nota, ArrayList<String> nombreAsignatura) {
        this.nota = nota;
        this.nombreAsignatura = nombreAsignatura;

        for (int i = 0; i < nota.size(); i++) {

            if (nota.get(i) > 3.5){
                System.out.println("la asignatura "+ nombreAsignatura.get(i) +": Aprobado");
            }else{
                System.out.println("la asignatura "+ nombreAsignatura.get(i) +": Reprovado");
            }
        }

    }



}
