public class Controller {
    /**
     * crea un cocheen el parking
     * @param modelo
     * @param matricula
     * @return el coche creado
     */
    public static Coche crearCocheC(String modelo, String matricula) {
        return Model.crearCoche(modelo, matricula);
    }

    /**
     * Muestra todos los coches del parking
     */
    public static void mostrarCochesC() {
        for (Coche coche : Model.parking) {
            View.mostrarCoche(coche);
        }
    }

    /**
     * Crea un parking con 3 coches de ejemplo
     */
    public static void inicioC() {
        Model.crearCoche("asd", "123po");
        Model.crearCoche("qwe", "098z");
        Model.crearCoche("zxc", "456x");
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param velocidad
     * @return nueva velocidad del coche o -1 si no se encuentra
     */
    public static int cambiarVelocidadC(String matricula, int velocidad) {
        return Model.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Muestra la velocidad de un coche
     * @param matricula
     * @return la velocidad del coche
     */
    public static int mostrarVelocidadC(String matricula) {
        return Model.getVelocidad(matricula);
    }

    /**
     * Avanza un coche una cantidad de metros
     * @param matricula
     * @param metros
     * @return true si se ha podido avanzar, false si no
     */
    public static boolean avanzarC(String matricula, int metros) {
        return Model.avanzar(matricula, metros);
    }

    /**
     * Añade gasolina a un coche
     * @param matricula
     * @param litros
     * @return true si se ha podido añadir gasolina, false si no
     */
    public static boolean ponerGasolinaC(String matricula, double litros) {
        return Model.ponerGasolina(matricula, litros);
    }

    /**
     * Obtiene la cantidad de gasolina de un coche
     * @param matricula
     * @return la cantidad de gasolina del coche
     */
    public static double getGasolinaC(String matricula) {
        return Model.getGasolina(matricula);
    }

}


