package net.salesianos.carpeta1;

public class Personaje {
    
    private String nombre;
    private int nivel;
    private int energia;

    public Personaje(String nombre, int nivel, int energia){
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }


    public int setNivel() {
        return energia;
    }

    public int getNivel(){
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public void entrenar(int niveles) {
        if (niveles > 0) {
            nivel = nivel + niveles;
        }
    }

    public void descansar(int cantidad) {
        if (cantidad > 0) {
            energia = energia + cantidad;
            if (energia > 100) {
                energia = 100;
            }
        }

    }
    public void gastarEnergia(int cantidad) {
        if (cantidad > 0) {
            energia = energia - cantidad;
            if (energia < 0) {
                energia = 0;
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Energía: " + energia);
    }
}
