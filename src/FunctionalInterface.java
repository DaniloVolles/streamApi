import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

/**
 * Operação que não aceita argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.forEach(s -> System.out.println(s));

        // forma mais sucinta
        List<String> listaSaudacoesSimples = Stream.generate(() -> "Olá, seja bem vinda!")
                .limit(5)
                .toList();

        listaSaudacoesSimples.forEach(s -> System.out.println(s));
    }
}