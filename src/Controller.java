import java.lang.module.ModuleDescriptor;

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
}


