package lesson5.home;

public class Bird extends Animal{
    public Bird(int runLength, float swimLength, float jumpHeight) {
        super("Bird", swimLength, runLength, jumpHeight);
    }

    @Override
    protected int swim(float swimLength) {
        return Animal.SWIM_NONE;
    }
}
