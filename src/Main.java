import animal.Animal;
import animal.Leon;
import animal.Pato;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Leon leoncin = new Leon(4,"Meiosis",10);
//        System.out.println("Numero de patas: "+ leoncin.getNumeroPatas());
//        System.out.println("Reproduccion: "+ leoncin.getTipoReproduccion());
//        System.out.println("Leoncin "+ leoncin);
//
//        Pato patolin = new Pato(2, "Meiosis", "blue");
//        System.out.println("patolin "+ patolin);
//
//        Pato patoCarlos = new Pato();
//        patoCarlos.setNumeroPatas(3);
//        patoCarlos.setTipoReproduccion("por huevo");
//        patoCarlos.setColorPlumas("Red");
//        System.out.println("PatoCarlos "+ patoCarlos);
//
//        leoncin.alimentacion();
//        patolin.desplazamiento();
//        patoCarlos.desplazamiento();
//        patoCarlos.alimentacion();

        List<Animal> animals; //aca entran todos los animales
        List<Leon> leones; // aca solo van los leones
        List<Pato> patos; // y aca solo patos

        Animal animal = new Leon();
        System.out.println(animal);
    }
}