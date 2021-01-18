package joinString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class joinStringJava8 {

    public static void main(String[] args) {

        System.out.println(String.join(" -> ", Arrays.asList("one", "two", "three")));
        List<String> list = new ArrayList<>();
        System.out.println(String.join(" -> ", list));

    }

}
