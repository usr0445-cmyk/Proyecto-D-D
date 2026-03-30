import net.salesianos.carpeta1.Personaje;
import net.salesianos.carpeta2.Mago;
import net.salesianos.carpeta3.Guerrero;

public class App {
    
    public static void main(String[] args) {

        Personaje viajero = new Personaje("Eldrin", 3, 30);
        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();

        Guerrero thorak = new Guerrero("Thorak", 5, "Hacha doble");
        thorak.ataquePesado();
        thorak.mostrarInfo();
        thorak.descansar(10);
        
        Mago lyra = new Mago("Lyra", 4, "Fuego");
        lyra.mostrarInfo();
        
    }
}
