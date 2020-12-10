package filterArraySimple;

import java.util.Arrays;

/**
 * @author Anna S. Almielka
 */

public class FilterJava8 {

    public static void main(String[] args) {

        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        long count = Arrays.stream(numbers).filter(v -> v > 0).count();
        System.out.println(count);

    }
}