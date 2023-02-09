package de.samples.schulungen.demos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Greeting("Hallo, ich bin eine Person.")
public class Person {

    private final String name;
    private final int age;

}
