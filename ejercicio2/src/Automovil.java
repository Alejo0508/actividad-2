public class Automovil {

    // atributos en estado privado
    private String color = "rojo";
    private int modelo = 2021;

    // ---- metodos ----
    public void arrancar(){
        // impresion del metodo
        System.out.println("- Esta arrancando el auto");
    }

    public void acelerar(){
        // impresion del metodo
        System.out.println("- El auto esta acelerando");
    }

   public void frenar(){
       // impresion del metodo
       System.out.println("- Frena de golpe.");
    }

    public void colorModelo(){
        // impresion del metodo usando los atributos privados
        System.out.println("- El auto es de color: "+color+", modelo: "+modelo);
    }



}
