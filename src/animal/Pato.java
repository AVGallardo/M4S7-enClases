package animal;

public class Pato extends Animal implements Alimentacion, Desplazamiento{

    private String colorPlumas;

    public Pato() {
    }

    public Pato(int numeroPatas, String tipoReproduccion, String colorPlumas) {
        super(numeroPatas, tipoReproduccion);
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String toString() {
        return "Pato{" +
                "numeroPatas='" + getNumeroPatas() + '\'' +
                ", tipoReproduccion='" + getTipoReproduccion() + '\'' +
                ", colorPlumas='" + colorPlumas + '\'' +
                '}';
    }

    @Override
    public void alimentacion() {
        System.out.println("comer de pato");
    }

    @Override
    public void desplazamiento() {
        System.out.println("ando como pato");

    }
}
