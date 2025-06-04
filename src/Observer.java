
public class Observer {
    // límite mínimo de gasolina
    final static double LIMITE_GASOLINA = 10.0;

    /**
     * Metodo que se llama para actualizar el estado del coche
     * @param coche el coche a actualizar
     */
    public static void update(Coche coche) {
        if (coche.gasolina<LIMITE_GASOLINA){
            View.alarmaReportar(coche.matricula);
        }
    }
}