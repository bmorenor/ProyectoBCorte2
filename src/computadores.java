import java.util.Scanner;

/**
 * Class computadores
 * INTEGRANTES:
 * Brayan Camilo Moreno
 * Miguel Angel Sierra
 * Sergio Alejandro Hernandez
 */
public class computadores {
    private static String t1 = "";
    private static int caso = 0;
    private static int min;
    private static int max;
    private static long[][] matriz;
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
        Scanner read = new Scanner(System.in);

        t1 = read.nextLine();
        t = Integer.parseInt(t1.trim());
        caso++;
        if (0 < t && t < 1000000) {

            for (int i = 1; i <= t; i++) {
                String numeros = read.nextLine();
                numeros(numeros);
                if (a > b) {
                    int c = a + 1;
                    matriz = new long[c][c];
                    min = b;
                    max = a;
                } else if (b > a) {
                    int c = b + 1;
                    matriz = new long[c][c];
                    min = a;
                    max = b;
                }

                if (m != 0) {
                    if (0 < n && n < 20000 && 0 < m && m < 50000 && 0 <= a && b <= (n - 1)) {

                        for (int j = 0; j < m; j++) {
                            String numeros_2 = read.nextLine();
                            numeros_2(numeros_2);
                            matriz[u][v] = w;
                            matriz[v][u] = w;

                        }

                        System.out.println(minimo_Tiempo(max, min, caso));
                        caso++;

                    }
                } else {
                    System.out.println("Caso#" + caso + ":\n" + "Inalcanzable");
                    caso++;
                }

            }
        }
    }

    public static String minimo_Tiempo(int max, int min, int caso) {
        String retorno;
        int tiempo_Menor = 0;


        tiempo_Menor = floyd(matriz, max, min);

        retorno = "Caso#" + caso + ":\n" +
                tiempo_Menor;

        return retorno;
    }

    public static void numeros(String string) {
        String primero = string.split(" ")[0];
        String segundo = string.split(" ")[1];
        String tercero = string.split(" ")[2];
        String cuarto = string.split(" ")[3];
        n = Integer.parseInt(primero);
        m = Integer.parseInt(segundo);
        a = Integer.parseInt(tercero);
        b = Integer.parseInt(cuarto);

    }

    public static void numeros_2(String string) {
        String primero = string.split(" ")[0];
        String segundo = string.split(" ")[1];
        String tercero = string.split(" ")[2];
        u = Integer.parseInt(primero);
        v = Integer.parseInt(segundo);
        w = Integer.parseInt(tercero);


    }

    public static int floyd(long[][] adyacencia, long max, long min) {
        int matriz1 = adyacencia.length;
        long D[][] = adyacencia;

        String enlaces[][] = new String[matriz1][matriz1];
        String[][] aux_enlaces = new String[adyacencia.length][adyacencia.length];

        for (int i = 0; i < matriz1; i++) {
            for (int j = 0; j < matriz1; j++) {
                enlaces[i][j] = "";
                aux_enlaces[i][j] = "";
            }
        }
        String enl_rec = "";
        for (int k = 0; k < matriz1; k++) {
            for (int i = 0; i < matriz1; i++) {
                for (int j = 0; j < matriz1; j++) {
                    float aux = D[i][j];
                    float aux2 = D[i][k];
                    float aux3 = D[k][j];
                    float aux4 = aux2 + aux3;
                    float result = Math.min(aux, aux4);
                    if (aux != aux4) {
                        if (result == aux4) {
                            enl_rec = "";
                            aux_enlaces[i][j] = k + "";
                            enlaces[i][j] = enlaces(i, k, aux_enlaces, enl_rec) + (k);
                        }
                    }
                    D[i][j] = (long) result;
                }
            }
        }

        String cadena = "";
        for (int i = 0; i < matriz1; i++) {
            for (int j = 0; j < matriz1; j++) {
                cadena += D[i][j] + " ";
            }
            cadena += "\n";
        }

        String enlacesres = "";

        enlacesres = D[(int) min][(int) max] + "";
        int resultado = Integer.parseInt(enlacesres);


        return resultado;
    }

    public static String enlaces(int i, int k, String[][] aux_enlaces, String enl_rec) {
        if (aux_enlaces[i][k].equals("") == true) {
            return "";
        } else {
            enl_rec += enlaces(i, Integer.parseInt(aux_enlaces[i][k].toString()), aux_enlaces, enl_rec) + (Integer.parseInt(aux_enlaces[i][k].toString()) + 1) + " , ";

            return enl_rec;
        }
    }
}
