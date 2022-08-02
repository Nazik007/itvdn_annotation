package itvdn_homeworks.itvdn_annotations.hw_3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        if (a.getClass().getAnnotations().length > 0) {
            System.out.println( s + "В класі 'A' застосовуються наступні анотації: ");
            for (Annotation annotation : a.getClass().getAnnotations()) {
                System.out.println(s2 + annotation);
            }
        }else {
            System.out.println(s + "В класі 'A' не застосовуються анотації");
        }

        if (b.getClass().getAnnotations().length > 0) {
            System.out.println(s + "В класі 'B' застосовуються наступні анотації: ");
            for (Annotation annotation : b.getClass().getAnnotations()) {
                System.out.println(s2 + annotation);
            }
        }else {
            System.out.println("В класі 'B' не застосовуються анотації");
        }
    }
}
