package ie.hertz.tdd;

public class Multiplier {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Multiplier(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        int size = 100;
        Multiplier multiplier = new Multiplier(size);

    }
}
