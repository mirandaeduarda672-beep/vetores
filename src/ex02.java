public class ex02 {
    static void main() {
        int[] numeros = {1, 2, 3, 4};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                IO.println(numeros[i] + " é par");
            }
        }
    }
}
