package instanceOfString;

/**
 * @author Anna S. Almielka
 */

public class InstanceOfStringOldDay {

    public static void main(String[] args) {
        Object obj = "I love Java";
        outputValueInUppercase(obj);
    }

    private static void outputValueInUppercase(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }
    }

}