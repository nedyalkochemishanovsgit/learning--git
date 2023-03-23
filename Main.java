import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("test:");

        List<Integer> numbers = Arrays.asList(8, 2, 2, 8, 2, 3, 2);

        Map<Double, Integer> map = new TreeMap<>();

        for (double digit : numbers) {

            if (map.containsKey(digit)) {
                int count = map.get(digit); // взима (V)

                map.put(digit, count + 1);
            } else {
                map.put(digit, 1);

            }
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());


        }
    }
}


