package de.samples.schulungen.demos;

public class GenericsSample {

    static class Warenkorb<T> {

        private T inhalt;

        public T getInhalt() {
            return inhalt;
        }

        public void setInhalt(T inhalt) {
            this.inhalt = inhalt;
        }

    }


    public static void main(String[] args) {

        Warenkorb<String> w = new Warenkorb<>();
        w.setInhalt("Inhalt");

        // Warenkorb<int> w2 = new Warenkorb<>();
        Warenkorb<Integer> w2 = new Warenkorb<>();

        // ...

        String inhalt = w.getInhalt();
        System.out.println(inhalt.toLowerCase());

    }


}
