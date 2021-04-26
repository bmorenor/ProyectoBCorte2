public class prueba {
    static AlgoritmoFloyd algoritmo = new AlgoritmoFloyd();
    public static void main(String[] args) {
        long[][] m = new long[2][2];
        m[0][0] = 100;
        m[0][1] = 150;
        m[1][0] = 0;
        m[1][1] = 50;

        System.out.println(algoritmo.floyd(m));
    }
}
