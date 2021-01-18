package instanceOfString;

/**
 * @author Anna S. Almielka
 */

public class InstanceOfStringJava15Preview {

    public static void main(String[] args) {
        Object obj = "I love Java";
        outputValueInUppercase(obj);
    }

    private static void outputValueInUppercase(Object obj) {
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }

}
