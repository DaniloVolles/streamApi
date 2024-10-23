import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface {
    public static void main(String[] args) {

    }
}


class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumeroPar);

        /*
        * A forma mais sucinta de resolver esse problema seria passando o Consumer
        * para o próprio foreach, resultando no código a seguir:
        * */

        numeros.forEach(numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        });
    }
}

