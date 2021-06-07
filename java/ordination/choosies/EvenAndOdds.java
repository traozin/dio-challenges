package java.ordination.choosies;

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
