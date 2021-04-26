import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class computadores
 */
public class computadores {
    private static Scanner read;
    private static List<Caso> list_Casos;
    private static List<Conexion> list_conexiones;
    private static int t;
    private static int n;
    private static int m;
    private static int a;
    private static int b;
    private static int u;
    private static int v;
    private static int w;


    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {

        String t1 = read.nextLine();
        t = Integer.parseInt(t1.trim());
        if (0 < t && t < 1000000) {
            for (int i = 1; i <= t; i++) {
                String numeros = read.nextLine();
                numeros(numeros);
                if (m != 0) {
                    if (0 < n && n < 20000 && 0 < m && m < 50000 && 0 <= a && b <= (n - 1)) {
                        for (int j = 0; j < m; j++) {
                            String numeros_2 = read.nextLine();
                            numeros_2(numeros_2);
                            Conexion conexion = new Conexion(u, v, w);
                            list_conexiones.add(conexion);
                        }
                        add(n, m, a, b, list_conexiones);
                        System.out.println(minimo_Tiempo(list_Casos, i));
                        list_conexiones.clear();
                    }
                } else {
                    System.out.println("Inalcanzable");
                }

            }
        }
    }

    public static void add(int n, int m, int a, int b, List<Conexion> list) {
        Caso caso = new Caso(n, m, a, b, list);
        list_Casos.add(caso);
    }

    public static String minimo_Tiempo(List<Caso> lista_De_Casos, int caso) {
        String retorno;
        int tiempo_Menor = 0;
         AlgoritmoFloyd algoritmo = new AlgoritmoFloyd();

        tiempo_Menor = algoritmo.floyd();

        retorno = "Caso#" + caso + ":\n" +
                tiempo_Menor;

        return retorno;
    }

    public static void numeros(String string) {
        int inicio = string.indexOf(" ");
        List<String> numeros = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            numeros.add(String.valueOf(string.indexOf(" ", inicio + i)));
        }
        n = Integer.parseInt(numeros.get(0));
        m = Integer.parseInt(numeros.get(1));
        a = Integer.parseInt(numeros.get(2));
        b = Integer.parseInt(numeros.get(3));
        numeros.clear();
    }

    public static void numeros_2(String string) {
        int inicio = string.indexOf(" ");
        List<String> numeros = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            numeros.add(String.valueOf(string.indexOf(" ", inicio + i)));
        }
        u = Integer.parseInt(numeros.get(0));
        v = Integer.parseInt(numeros.get(1));
        w = Integer.parseInt(numeros.get(2));
        numeros.clear();
    }
}
