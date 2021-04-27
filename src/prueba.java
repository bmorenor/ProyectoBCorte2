public class prueba {
    static AlgoritmoFloyd algoritmo = new AlgoritmoFloyd();
    public static void main(String[] args) {
        long[][] m = new long[3][3];
        m[0][0] = 0;
        m[0][1] = 100;
        m[0][2] = 8;
        m[1][0] = 100;
        m[1][1] = 0;
        m[1][2] = 50;
        m[2][0] = 8;
        m[2][1] = 50;
        m[2][2] = 0;


        System.out.println(algoritmo.floyd(m,2,0));
    }
}
