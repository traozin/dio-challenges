package java.ordination.shopping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Antonio Neto
 */
public class Shopping {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        List<String> lines = br.lines()
                .limit(limit)
                .collect(Collectors.toList());

        lines.forEach(line -> {
            Set<String> items = new TreeSet();
            items.addAll(Arrays.asList(line.split(" ")));
            items.forEach(item -> {
                System.out.print(item + " ");
            });
            System.out.println();
        });
    }
}
