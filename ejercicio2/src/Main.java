public class Main {
    public static void main(String[] args) {

        // Variable que se enviara al metodo en ferrari como parametro
        int velocidad = 100;

        // se instancia ferrari
        Ferrari objFerrari = new Ferrari();
        // se instancia automovil
        Automovil objAutomovil = new Automovil();


        // se usa los objetos instanciados
        objAutomovil.colorModelo();
        objFerrari.arrancar();
        objAutomovil.acelerar();
        objFerrari.acelerar(velocidad);
        objFerrari.frenar();

    }
}
