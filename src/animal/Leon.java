package animal;

public class Leon extends Animal implements Alimentacion, Desplazamiento{
    private int kilosDeCarne;

    public Leon() {}

    public Leon(int numeroPatas, String tipoReproduccion, int kilosDeCarne) {
        super(numeroPatas, tipoReproduccion);
        this.kilosDeCarne = kilosDeCarne;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numeroPatas=" + getNumeroPatas() +
                ", tipoReproduccion=" + getTipoReproduccion() +
                ", kilosDeCarne=" + kilosDeCarne +
                '}';
    }

    @Override
    public void alimentacion() {
        System.out.println("Carne, de pato especialmente");
    }

    @Override
    public void desplazamiento() {
        System.out.println("Solo por tierra");
    }
}
