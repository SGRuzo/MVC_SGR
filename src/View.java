import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamentee
     */

    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una opcion");
            System.out.println("1. Crear coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("3. Mostrar velocidad");
            System.out.println("4. Salir");
            Controller.inico();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 :
                    System.out.println("Introduce el modelo ");
                    String mooodelo = teclado.nextLine();
                    System.out.println("Introduce la matricula");
                    String matricula = teclado.next();
                    Controller.crearCocheC(mooodelo,matricula);
                    break;

                case 2:
                    System.out.println("Introduce la matricula");
                     matricula = teclado.nextLine();
                    System.out.println("Introduce la nueva velocidad");
                    int nvelocidad = teclado.nextInt();
                    Controller.cambiarVelocidadC(matricula,nvelocidad);
                    break;

                case 3 :
                    System.out.println("De que coche queres conocer la velocidad, introduce la matricula");
                    matricula = teclado.nextLine();
                    Controller.mostrarVelocidadC(matricula);

            }

        }while (opcion != 4);




    }


    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

}
