package de.samples.schulungen.demos;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.function.Supplier;

public class SyntheticDemo {

    class NestedClass {

        private String myField;

    }

    public String getMyField() {
        return new NestedClass().myField;
    }

    private static void analyze(Class<?> c) {
        System.out.println("Analyzing class " + c.getSimpleName());
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
            System.out.println("Field: " + f.getName() + ":" + f.getType().getSimpleName() + ", isSynthetic: " +
              f.isSynthetic());
        }

        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName() + ", isSynthetic: " +
              m.isSynthetic());
        }
    }

    public static void main(String[] args) {
        Supplier<Date> s = Date::new;
        System.out.println(s);
        System.out.println(s.get());
        analyze(SyntheticDemo.class);
        analyze(SyntheticDemo.NestedClass.class);
        analyze(s.getClass());
    }

}
