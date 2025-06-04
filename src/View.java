import java.util.Scanner;

public class View {
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("0. Mostrar coches");
            System.out.println("1. Crear coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("3. Mostrar velocidad");
            System.out.println("4. Avanzar");
            System.out.println("5. Añadir Gasolina");
            System.out.println("6. Salir");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 0:
                    System.out.println("Mostrando coches:");
                    Controller.mostrarCochesC();

                    break;

                case 1:
                    System.out.println("Introduce el modelo:");
                    String modelo = teclado.nextLine();
                    System.out.println("Introduce la matrícula:");
                    String matricula = teclado.nextLine();
                    System.out.println("Introduce los litros de gasolina actuales:");
                    double gasolina = Double.parseDouble(teclado.nextLine());
                    Controller.crearCocheC(modelo, matricula, gasolina);
                    Coche aux1= Controller.crearCocheC(modelo, matricula, gasolina);
                    if(aux1!=null) mostrarCoche(aux1);
                    else System.out.println("Parámetros no válidos");
                    break;

                case 2:
                    System.out.println("Introduce la matrícula:");
                    matricula = teclado.nextLine();
                    System.out.println("Introduce la nueva velocidad:");
                    int nvelocidad = teclado.nextInt();
                    if (Controller.avanzarC(matricula, nvelocidad)) {
                        System.out.println("Velocidad cambiada correctamente.");
                    } else {
                        System.out.println("Coche no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Introduce la matrícula del coche:");
                    matricula = teclado.nextLine();
                    int velocidad = Controller.mostrarVelocidadC(matricula);
                    if (velocidad != -1) {
                        System.out.println("La velocidad del coche es: " + velocidad + " km/h");
                    } else {
                        System.out.println("Coche no encontrado.");
                    }
                    break;

                case 4: // Avanzar
                    System.out.println("Introduce la matrícula:");
                    String matriculaAvanzar = teclado.nextLine();
                    System.out.println("Introduce los metros a avanzar:");
                    int metros = teclado.nextInt();
                    if (Controller.avanzarC(matriculaAvanzar, metros)) {
                        System.out.println("El coche ha avanzado " + metros + " metros.");
                        double gasolinaRestante = Controller.getGasolinaC(matriculaAvanzar);
                        System.out.println("Gasolina restante: " + gasolinaRestante + " litros.");
                    } else {
                        System.out.println("No se pudo avanzar. Verifica la matrícula, velocidad o gasolina.");
                    }
                    break;

                case 5: // Añadir Gasolina
                    System.out.println("Introduce la matrícula:");
                    String matriculaGasolina = teclado.nextLine();
                    System.out.println("Introduce los litros a añadir:");
                    double litros = teclado.nextDouble();
                    if (Controller.ponerGasolinaC(matriculaGasolina, litros)) {
                        System.out.println("Gasolina añadida correctamente.");
                        double gasolinaActual = Controller.getGasolinaC(matriculaGasolina);
                        System.out.println("Gasolina actual: " + gasolinaActual + " litros.");
                    } else {
                        System.out.println("No se pudo añadir gasolina. Verifica la matrícula.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    /**
     * Muestra la velocidad de un coche
     * @param matricula
     * @param v
     * @return true
     */
    public static boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println(matricula + ": " + v + " km/h");
        return true;
    }

    /**
     * Muestra un coche
     * @param aux
     */
    public static void mostrarCoche(Coche aux){
        System.out.println("Modelo: "+ aux.modelo+" Matricula: "+aux.matricula+" Velocidad: "+aux.velocidad);
    }

    public static void alarmaReportar(String matricula) {
        System.out.println("[VIEW] El coche con matrícula "+matricula+" necesita repostar gasolina (nivel bajo)");
    }

}