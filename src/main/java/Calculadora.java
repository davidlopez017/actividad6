import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        double[] resultados = new double[10]; // Arreglo para almacenar resultados
        int indice = 0; // Índice para rastrear la posición en el arreglo

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("Seleccione la figura geométrica:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Salir");

                int figura = scanner.nextInt();
                scanner.nextLine();

                if (figura == 6) {
                    continuar = false;
                    break;
                }

                System.out.println("Seleccione la operación:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");

                int operacion = scanner.nextInt();
                scanner.nextLine();

                double resultado = 0.0;

                switch (figura) {
                    case 1: // Círculo
                        if (operacion == 1) {
                            resultado = operaciones.calcularAreaCirculo(scanner);
                        } else if (operacion == 2) {
                            resultado = operaciones.calcularPerimetroCirculo(scanner);
                        }
                        break;
                    case 2: // Cuadrado
                        if (operacion == 1) {
                            resultado = operaciones.calcularAreaCuadrado(scanner);
                        } else if (operacion == 2) {
                            resultado = operaciones.calcularPerimetroCuadrado(scanner);
                        }
                        break;
                    case 3: // Triángulo
                        if (operacion == 1) {
                            resultado = operaciones.calcularAreaTriangulo(scanner);
                        } else if (operacion == 2) {
                            resultado = operaciones.calcularPerimetroTriangulo(scanner);
                        }
                        break;
                    case 4: // Rectángulo
                        if (operacion == 1) {
                            resultado = operaciones.calcularAreaRectangulo(scanner);
                        } else if (operacion == 2) {
                            resultado = operaciones.calcularPerimetroRectangulo(scanner);
                        }
                        break;
                    case 5: // Pentágono
                        if (operacion == 1) {
                            resultado = operaciones.calcularAreaPentagono(scanner);
                        } else if (operacion == 2) {
                            resultado = operaciones.calcularPerimetroPentagono(scanner);
                        }
                        break;
                    default:
                        System.out.println("Figura no válida");
                        continue; // Regresar al inicio del bucle while
                }

                resultados[indice++] = resultado; // Almacenar el resultado en el arreglo
                System.out.println("El resultado es: " + resultado);
            } catch (Exception e) {
                System.out.println("Error: Entrada no válida. Por favor, intente de nuevo.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        // Mostrar los resultados almacenados en el arreglo
        System.out.println("Resultados almacenados:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Operación " + (i + 1) + ": " + resultados[i]);
        }

        scanner.close();
    }
}
