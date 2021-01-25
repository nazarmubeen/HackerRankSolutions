package main.java.reflections;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        TestIObject test = new TestIObject();
        Class c = test.getClass();


        Arrays.stream(c.getConstructors()).forEach(a -> System.out.println(a.getName()));

        Arrays.stream(c.getMethods()).forEach(a -> System.out.println(a.getName()));

    }
}
