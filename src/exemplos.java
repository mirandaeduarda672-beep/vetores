import java.util.Arrays;

public class exemplos {
    static void main() {

        String[] nomes = {"Ricardo", "Madu", "Guel"};
        IO.println("    Exemplo 1");
        Arrays.sort(nomes);
        for (int i = 0; i < nomes.length; i++) {
            IO.println("." + nomes[i]);

        }
        IO.println("    Exemplo 2");
        int[] num = {1, 5, 7, 9, 2};
        Arrays.sort(num);
        for (int j = num.length-1; j >= 0; j--) {
            IO.println("." + num[j]);

        }
    }
}