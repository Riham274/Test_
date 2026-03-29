package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 20, 15, 3, 30);
        List<Integer> result = new ArrayList<>();
        // without stream
        for (int n : numbers) {

            if (n > 10) {

                result.add(n);

            }

        }

        System.out.println(result); // [20, 15, 30]
        // with stream
        numbers.stream()
                .filter(x -> x > 10)
                .forEach(x -> System.out.println(x));

        //name lenght > 4        
        List<String> names = List.of("Ali", "Omar", "Lina", "Ahmad");
        names.stream()
              .filter(name -> name.length()> 4)
              .forEach(name -> System.out.println(name));
    }
}