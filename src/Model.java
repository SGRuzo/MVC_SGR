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
     * Avanza un coche una distancia determinada
     * @param matricula
     * @param metros
     * @return
     */
    public static boolean avanzar(String matricula, int metros) {
        Coche coche = getCoche(matricula);
        if (coche == null || coche.velocidad <= 0) {
            return false;
        }
        double gasolinaNecesaria = (metros * coche.velocidad) / 1000.0;
        if (coche.gasolina < gasolinaNecesaria) {
            return false;
        }
        coche.gasolina -= gasolinaNecesaria;
        return true;
    }

    /**
     * Añade gasolina a un coche
     * @param matricula
     * @param litros
     * @return true si se ha podido añadir gasolina, false si no
     */
    public static boolean ponerGasolina(String matricula, double litros) {
        Coche coche = getCoche(matricula);
        if (coche == null) {
            return false;
        }
        coche.gasolina += litros;
        return true;
    }
    /**
     * Obtiene la cantidad de gasolina de un coche
     * @param matricula
     * @return la cantidad de gasolina del coche o -1 si no se encuentra
     */
    public static double getGasolina(String matricula) {
        Coche coche = getCoche(matricula);
        return coche != null ? coche.gasolina : -1;
    }
}