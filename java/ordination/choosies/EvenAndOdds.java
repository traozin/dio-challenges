/*
Desafio
Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

-Primeiro os Pares
-Depois os Ímpares
-Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que vem logo a seguir. 
As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.

Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. 
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Antonio Neto
 */
public class EvenAndOdds {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        Map<Boolean, List<Integer>> map = br.lines()
                .limit(limit)
                .map(Integer::parseInt)
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
                
        List<Integer> evens = map.get(true);
        List<Integer> odds = map.get(false);
        
        evens.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        odds.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
