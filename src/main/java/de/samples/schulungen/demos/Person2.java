package de.samples.schulungen.demos;

public record Person2(String name, int age) {

    public static void main(String[] args) {
        Person2 p2 = new Person2("name", 18);
        System.out.println(p2.name());
    }

}
