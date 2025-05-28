import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un nuevo coche en parking
     * @param modelo
     * @param matricula
     * @return el coche creado
     */
    public static Coche crearCoche(String modelo, String matricula) {
        int posicion = 0;
        Coche aux = new Coche(modelo, matricula, posicion);
        parking.add(aux);
        return aux;
    }

    /**
     * Obtiene un coche de la lista de coches
     * @param matricula
     * @return el coche o null si no se encuentra
     */
    public static Coche getCoche(String matricula) {
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                return e;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v
     * @return la nueva velocidad del coche o -1 si no se encuentra
     */
    public static int cambiarVelocidad(String matricula, int v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad = v;
            return coche.velocidad;
        }
        return -1;
    }

    /**
     * Obtiene la velocidad de un coche
     * @param matricula
     * @return  la velocidad del coche o -1 si no se encuentra
     */
    public static int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        return coche != null ? coche.velocidad : -1;
    }

    /**
     * aumenta la velocidad de un coche
     * @param matricula
     * @param v
     * @return la nueva velocidad del coche o -1 si no se encuentra
     */
    public static int aumentarV(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad += v;
            return coche.velocidad;
        }
        return -1;
    }

    /**
     * disminuye la velocidad de un coche
     * @param matricula
     * @param v
     * @return la nueva velocidad del coche o -1 si no se encuentra
     */
    public static int disminuirV(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.velocidad -= v;
            return coche.velocidad;
        }
        return -1;
    }

    /**
     * Avancce en metros de un coche
     * @param matricula
     * @param nmetros
     * @return  el avance de un coche o -1 si no se encuentra
     */
    public static int avanzar(String matricula, int nmetros) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return 0 + nmetros;
        }
        return -1;
    }

    /**
     * Añadir gasolina a un coche
     * @param matricula
     * @param nlitros
     * @return repostaje de un coche o -1 si no se encuentra
     */
    public static int añadirGasolina(String matricula, int nlitros){
        Coche coche= getCoche(matricula);
        if (coche != null) {
            coche.litros = + nlitros;
            return coche.litros;
        }
        return -1;
    }
}