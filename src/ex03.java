public class ex03 {
    static void main() {
        int[] impares = {3, 9, 6, 10};

        for (int i = 0; i < impares.length; i++) {
            if (impares[i] % 2 == 1) {
                IO.println(impares[i]);
            }
        }
    }
}
