package ordination.caixa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author Antônio Neto
 */
public class BankQueue {

    private final static Set<Integer> uniqueValues = new HashSet();
    public static void main(String[] args) throws IOException {
        try ( var br = new BufferedReader(new InputStreamReader(System.in))) {
            int numTests = Integer.parseInt(br.readLine());
            for (int i = 0; i < numTests; i++) {

                Integer numPass = Integer.parseInt(br.readLine());

                int[] splitInt = Stream.of(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                
                selectionSort(splitInt);
                System.out.println(numPass - uniqueValues.size());
                uniqueValues.clear();
            }
        }
        
    }

    private static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }
            }
            swap(arr, min_idx, i);
        }
    }

    private static void swap(int arr[], int min_idx, int i) {
        if (arr[i] != arr[min_idx]) {
            uniqueValues.add(i);
            uniqueValues.add(min_idx);

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
