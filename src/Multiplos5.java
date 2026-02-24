public class Multiplos5 {
    public static void main(String[] args) {
        int [][] multiplos = new int [3][3];
        int numero = 0;

        System.out.println("Numeros multiplos:");

        for (int i = 1; i < 200; i++) {
            if (i % 3 == 0) {
                numero ++;
                System.out.println(i);
            } else if (i%5==0) {
                numero ++;
                System.out.println(i);
            }
        }
        System.out.println("Numeros multiplos:" + numero);
    }
}