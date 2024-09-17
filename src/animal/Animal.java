package animal;

public abstract class Animal {
    private int numeroPatas;
    private String tipoReproduccion;

    public Animal() {}

    public Animal(int numeroPatas, String tipoReproduccion) {
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numeroPatas=" + numeroPatas +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                '}';
    }
}
