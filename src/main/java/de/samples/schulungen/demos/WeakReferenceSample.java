package de.samples.schulungen.demos;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class WeakReferenceSample {

    public static void main(String[] args) {

        // strong -> keine GC
        Object o = new Object();

        // weak -> GC, solange keine andere (strong) ref
        Reference<Object> ref = new WeakReference<>(o);
        o = null;
        ref.get(); // könnte null sein

        // soft ref -> GC, bevor OutOfMemoryError
        // https://www.baeldung.com/java-weak-reference
    }

}
