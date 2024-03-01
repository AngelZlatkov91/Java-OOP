package Reflection_And_Annotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        System.out.println(reflectionClass);
        System.out.println(reflectionClass.getSuperclass());
        Arrays.stream(reflectionClass.getInterfaces()).forEach(System.out::println);

        






    }
}
