package filterArraySimple;

/**
 * @author Anna S. Almielka
 */

public class FilterJavaOldDay {

    public static void main(String[] args) {

        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count = 0;
        for (int i : numbers) {
            if (i > 0) count++;
        }
        System.out.println(count);

    }
}