package itvdn_homeworks.itvdn_annotations.hw_4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args)  {
        Math math = new Math();
        Class<?> cl = Math.class;

        try {
            Method m = cl.getDeclaredMethod("sum", int.class, int.class);
            addingTwoNumbers add = m.getAnnotation(addingTwoNumbers.class);
            math.sum(add.num1(),add.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
