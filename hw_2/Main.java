package itvdn_homeworks.itvdn_annotations.hw_2;

import java.lang.reflect.Method;

/**
 * @author Nazarii Soviak
 */

public class Main {
    public static void main(String[] args) {
        /**
         * creating an object from a Math Class
         */
        Math math = new Math();

        /**
         * Reflection of the Class
         */
        Class<?> cl = Math.class;

        /**
         * Implementing the program to work as we need to return the sum of two numbers
         */
        try {
            Method m = cl.getDeclaredMethod("result", int.class, int.class);
            Adding add = m.getAnnotation(Adding.class);
            math.result(add.num1(),add.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
