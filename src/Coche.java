public class Coche {
    double gasolina;
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula, int posicion) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 0.0;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                ", gasolina=" + gasolina +
                '}';
    }
}
