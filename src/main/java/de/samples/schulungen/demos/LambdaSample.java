package de.samples.schulungen.demos;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaSample {

    @FunctionalInterface
    private interface MyInterface {

        int calculate();

    }


    public static void main(String[] args) {

        MyInterface m = new MyInterface() { // anonyme Klasse
            @Override
            public int calculate() {
                return 0;
            }
        };
        // anonyme Klasse
        MyInterface m2 = () -> 0;


        // verzögerte Ausführung
        int calculate = m2.calculate();


        Collection<String> namen = Arrays.asList("Tom", "Maximilian", "Julia")
          .stream()
          .filter(name -> name.length()<=5)
          .map(String::toUpperCase)
          .collect(Collectors.toList());

        // Stream von integers
        Arrays.asList(1,5,8)
          .stream()
          .map(z -> Integer.valueOf(z.intValue()*2))
          .forEach(System.out::println);

//        IntStream

    }

}
