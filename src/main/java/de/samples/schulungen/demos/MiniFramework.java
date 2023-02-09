package de.samples.schulungen.demos;

public class MiniFramework {

    private static void greet(Object o) {
        Greeting annotation = o.getClass().getAnnotation(Greeting.class);
        if(null != annotation) {
            System.out.println(annotation.value());
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Tom", 35);
        greet(person);
    }

}
