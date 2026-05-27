public class ex01 {
    static void main() {
        int[] numeros = {1, 2, 7, 9, 4, 6};

        int numeroMaior = 0;
        int numeroMenor = 100000;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
            if (numeros[i] > numeroMaior) {
                numeroMaior = numeros[i];
            }
        }
        IO.println("Maior numero=" + numeroMaior);
        IO.println("Menor numero=" + numeroMenor);
    }
}

