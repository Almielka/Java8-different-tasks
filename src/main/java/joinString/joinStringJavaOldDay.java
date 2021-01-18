package joinString;

import java.util.Arrays;
import java.util.List;

/**
 * @author Anna S. Almielka
 */

public class joinStringJavaOldDay {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(join(" –> ", list));
        System.out.println(join(" –> ", null));

    }

    private static String join(String delimiter, List<String> list) {
        if (list == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(i == list.size() - 1 ? "" : delimiter);
        }
        return sb.toString();
    }

}