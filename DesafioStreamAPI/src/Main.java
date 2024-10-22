import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Desafio 1: Mostrar a lista na ordem numérica
        System.out.println("Desafio 1 - Lista ordenada:");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        // Desafio 2: Imprimir a soma dos números pares da lista
        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Desafio 2 - Soma dos números pares: " + somaPares);

        // Desafio 3: Verifique se todos os números da lista são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);
        System.out.println("Desafio 3 - Todos os números são positivos: " + todosPositivos);

        // Desafio 4: Remover todos os valores ímpares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Desafio 4 - Números pares: " + pares);

        // Desafio 5: Calcule a média dos números maiores que 5
        OptionalDouble mediaMaioresQue5 = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Desafio 5 - Média dos números maiores que 5: " + mediaMaioresQue5.orElse(0.0));

        // Desafio 6: Verificar se a lista contém algum número maior que 10
        boolean temMaiorQue10 = numeros.stream()
                .anyMatch(n -> n > 10);
        System.out.println("Desafio 6 - Contém número maior que 10: " + temMaiorQue10);

        // Desafio 7: Encontrar o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted()
                .skip(numeros.size() - 2)
                .findFirst();
        System.out.println("Desafio 7 - Segundo maior número: " + segundoMaior.orElse(null));

        // Desafio 8: Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                .map(n -> String.valueOf(n).chars().map(Character::getNumericValue).sum())
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Desafio 8 - Soma dos dígitos de todos os números: " + somaDigitos);

        // Desafio 9: Verificar se todos os números da lista são distintos
        boolean todosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();
        System.out.println("Desafio 9 - Todos os números são distintos: " + todosDistintos);

        // Desafio 10: Agrupe os valores ímpares múltiplos de 3 ou de 5
        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .collect(Collectors.partitioningBy(n -> n % 2 != 0));
        System.out.println("Desafio 10 - Agrupados (ímpares múltiplos de 3 ou 5): " + agrupados);

        // Desafio 11: Encontre a soma dos quadrados de todos os números da lista
        int somaQuadrados = numeros.stream()
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Desafio 11 - Soma dos quadrados: " + somaQuadrados);

        // Desafio 12: Encontre o produto de todos os números da lista
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Desafio 12 - Produto de todos os números: " + produto);

        // Desafio 13: Filtrar os números que estão dentro de um intervalo (5 a 10)
        List<Integer> intervalo = numeros.stream()
                .filter(n -> n >= 5 && n <= 10)
                .collect(Collectors.toList());
        System.out.println("Desafio 13 - Números entre 5 e 10: " + intervalo);

        // Desafio 14: Encontre o maior número primo da lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Main::isPrime)
                .max(Integer::compareTo);
        System.out.println("Desafio 14 - Maior número primo: " + maiorPrimo.orElse(null));

        // Desafio 15: Verifique se a lista contém pelo menos um número negativo
        boolean temNegativo = numeros.stream()
                .anyMatch(n -> n < 0);
        System.out.println("Desafio 15 - Contém pelo menos um número negativo: " + temNegativo);

        // Desafio 16: Agrupe os números em pares e ímpares
        Map<Boolean, List<Integer>> paresEImpares = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Desafio 16 - Agrupados em pares e ímpares: " + paresEImpares);

        // Desafio 17: Filtrar os números primos da lista
        List<Integer> primos = numeros.stream()
                .filter(Main::isPrime)
                .collect(Collectors.toList());
        System.out.println("Desafio 17 - Números primos: " + primos);

        // Desafio 18: Verifique se todos os números da lista são iguais
        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;
        System.out.println("Desafio 18 - Todos os números são iguais: " + todosIguais);

        // Desafio 19: Encontre a soma dos números divisíveis por 3 e 5
        int somaDivisiveisPor3e5 = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Desafio 19 - Soma dos números divisíveis por 3 e 5: " + somaDivisiveisPor3e5);
    }

    // Método para verificar se um número é primo
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
