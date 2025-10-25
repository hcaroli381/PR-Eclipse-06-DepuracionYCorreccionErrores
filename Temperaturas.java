package tema2_debug;

import java.util.Scanner;

/**
 * Programa con errores para practicar la depuración.
 * El programa pide una temperatura y muestra si hace frío, calor o temperatura templada.
 * Después, repite mientras el usuario quiera continuar.
 */
public class Temperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrarMensajeBienvenida() ;//HCO20252410 ponemos ;

        boolean continuar = true;

        while (continuar==true) {//HCO20252410 false no es un valor valido por si mismo
            double temperatura = pedirTemperatura(sc);//HCO20252410 ponemos ;
            mostrarResultado(temperatura);//HCO20252410 ponemos ;

            System.out.print("¿Desea introducir otra temperatura? (s/n): ");
            String respuesta = sc.next();

            if (respuesta.equals("n") || respuesta.equals("N"))////HCO20252410 cambiamos esa forma de igualar cadenas y la sustituimos por equals, tambien podriamos usar equalsIgnoreCase
                continuar = false;
        }

        sc.close();//HCO20252410 ponemos ;
        System.out.println("Programa finalizado.");//HCO20252410 ponemos ; y borramos */
    }

    public static void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al analizador de temperaturas.");//HCO20252410 ponemos ;
        System.out.println("Este programa indica si hace frío, calor o está templado.");//HCO20252410 ponemos ;
    }

    public static double pedirTemperatura(Scanner sc) {
        double t;
        do {
            System.out.print("Introduce la temperatura en grados: ");
            t = sc.nextDouble();
            if (t < -10 || t > 50) {//HCO20252410 cambiamos un AND por OR, para que el if haga su funcion correctamente
                System.out.println("Temperatura fuera del rango permitido (-10 a 50).");//HCO20252410 ponemos ;
            }
        } while (t < -10 || t > 50);//HCO20252410 cambiamos un AND por OR, para que el while haga su funcion correctamente
        return t;
    }

    public static void mostrarResultado(double temperatura) {
        if (temperatura < 15)
            System.out.println("Hace frío.");//HCO20252410 ponemos ;
        else if (temperatura >= 15 && temperatura < 30)
            System.out.println("Temperatura templada.");//HCO20252410 ponemos ;
        else if (temperatura >= 30)
            System.out.println("¡Hace mucho calor!");//HCO20252410 ponemos ;
        else
            System.out.println("Valor no reconocido.");//HCO20252410 ponemos ;
    }
}


