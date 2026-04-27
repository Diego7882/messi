package Ejercitacion3ejercicio4;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {

        Veterinario v1 = new Veterinario("Alexis");
        Veterinario v2 = new Veterinario("Luciano ");
        Veterinario v3 = new Veterinario("Leandro");
        
        Animal compartido = new Perro("Acavani");
        Animal a1 = new Gato("Benzema");
        Animal a2 = new Perro("Merentiel");
        Animal a3 = new Gato("Auzmendi");
        Animal a4 = new Perro("Velazco");
        Animal a5 = new Gato("Sanfilippo");
        Animal a6 = new Perro("Bareiro");

       
        System.out.println(v1.nombre + " atiende al burro de: " + compartido.nombre);
        System.out.println(v1.nombre + " atiende a: " + a1.nombre);
        System.out.println(v1.nombre + " atiende a: " + a2.nombre);
        System.out.println(v2.nombre + " atiende al burro de: " + compartido.nombre);
        System.out.println(v2.nombre + " atiende a: " + a3.nombre);
        System.out.println(v2.nombre + " atiende a: " + a4.nombre);
        System.out.println(v3.nombre + " atiende al burro de: " + compartido.nombre);
        System.out.println(v3.nombre + " atiende a: " + a5.nombre);
        System.out.println(v3.nombre + " atiende a: " + a6.nombre);
    }
}