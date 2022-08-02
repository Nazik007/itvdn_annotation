package itvdn_homeworks.itvdn_annotations.hw_4;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface addingTwoNumbers {
    int num1 () default 0;
    int num2 () default 0;
}
