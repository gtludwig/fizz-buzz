package ie.hertz.tdd;

public class MultiplierApp {

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        for (int i = 1; i <= 100; i++ ) {
            multiplier.setSize(i);
            System.out.println(multiplier.toString());
        }
    }
}
