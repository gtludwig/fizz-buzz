package ie.hertz.tdd;

public class Multiplier {

    public Multiplier() {}

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return replacement(size);
    }

    private String replacement(int size) {

        if (size >= 1 && size % 15 == 0) {
            return "FizzBuzz";
        } else if (size >= 1 && size % 5 == 0) {
            return "Buzz";
        } else if (size >= 1 && size % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(size);
        }
    }
}
