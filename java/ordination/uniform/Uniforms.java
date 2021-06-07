/*
Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. 
Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. 
Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. 
As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). 
A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". 
A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Antonio Neto
 */
public class Uniforms {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        List<Uniform> result = new ArrayList();

        Deque<String> lines = br.lines()
                .limit((limit * 2))
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (!lines.isEmpty()) {
            String name = lines.pop();
            String[] pop = lines.pop().split(" ");
            String color = pop[0];
            String size = pop[1];
            result.add(new Uniform(name, size, color));
        }
        result.sort(Comparator.naturalOrder());
        result.forEach(System.out::println);
    }

    public static class Uniform implements Comparable<Uniform> {
        String name;
        String size;
        String color;

        public Uniform(String name, String size, String color) {
            this.name = name;
            this.size = size;
            this.color = color;
        }

        @Override
        public int compareTo(Uniform other) {
            return (color.equals(other.color)
                        ? (size.equals(other.size)
                            ? (name.equals(other.name)
                                ? 0 : name.compareTo(other.name))
                        : other.size.compareTo(size))
                    : color.compareTo(other.color));
        }

        @Override
        public String toString() {
            return color + " " + size + " " + name;
        }
    }
}
