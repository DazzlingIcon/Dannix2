import java.util.Scanner;

public class proyectopila {

    int[] pila;
    int tope, tamaño;

    // Constructor de la clase
    proyectopila(int tamaño) {
        // Guardar el tamaño dado
        this.tamaño = tamaño;
        // Inicializar el vector
        pila = new int[tamaño];
        // Inicializar el tope en -1, indica que está vacía
        tope = -1;
    }

    // Método para apilar o insertar en la pila
    void apilar(int valor) {
        if (tope == tamaño - 1) {
            System.out.println("La pila está llena");
        } else {
            pila[++tope] = valor;
            System.out.println("Valor " + valor + " apilado.");
        }
    }

    // Método para desapilar
    int desapilar() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return pila[tope--];
        }
    }

    // Método para obtener el Tope de la pila
    int obtenerTope() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return pila[tope];
        }
    }

    // Método para mostrar los elementos de la pila
    void mostrarElementos() {
        if (tope == -1) {
            System.out.println("La pila está vacía");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i] + " ");
            }
            System.out.println();
        }
    }

    // Método para verificar si la pila está vacía
    boolean isEmpty() {
        return tope == -1;
    }

    // Método para verificar si la pila está llena
    boolean isFull() {
        return tope == tamaño - 1;
    }

    // Método para obtener el tamaño de la pila
    int obtenerTamaño() {
        return tope + 1; // El tamaño es el índice del tope + 1
    }

    // Método para vaciar la pila
    void vaciarPila() {
        tope = -1;
        System.out.println("La pila ha sido vaciada.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la pila: ");
        int tamaño = scanner.nextInt();
        
    proyectopila pila1 = new proyectopila (tamaño);
        int opcion;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("\n                     MENÚ:");
            System.out.println("--------------------------------------------------");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Obtener Tope");
            System.out.println("4. Mostrar Elementos");
            System.out.println("5. Verificar si está vacía");
            System.out.println("6. Verificar si está llena");
            System.out.println("7. Obtener tamaño");
            System.out.println("8. Vaciar la pila");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor para apilar: ");
                    int valor = scanner.nextInt();
                    pila1.apilar(valor);
                    break;
                case 2:
                    int valorDesapilado = pila1.desapilar();
                    if (valorDesapilado != -1) {
                        System.out.println("Valor desapilado: " + valorDesapilado);
                    }
                    break;
                case 3:
                    int tope = pila1.obtenerTope();
                    if (tope != -1) {
                        System.out.println("El valor en el tope es: " + tope);
                    }
                    break;
                case 4:
                    pila1.mostrarElementos();
                    break;
                case 5:
                    System.out.println("¿La pila está vacía? " + pila1.isEmpty());
                    break;
                case 6:
                    System.out.println("¿La pila está llena? " + pila1.isFull());
                    break;
                case 7:
                    System.out.println("El tamaño de la pila es: " + pila1.obtenerTamaño());
                    break;
                case 8:
                    pila1.vaciarPila();
                    break;
                case 0:
                    System.out.println("SALIENDO");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}