package java.ordination.uniform;

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
