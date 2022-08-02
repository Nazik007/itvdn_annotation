package itvdn_homeworks.itvdn_annotations.hw_2;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Adding {
/**
 * Return 0 of two variables
 */
int num1 () default 0;
int num2 () default 0;
}
