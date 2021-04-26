package lesson5.home;

public class Cat extends Animal{
    public Cat(int runLength, float swimLength, float jumpHeight) {
        super("Cat", runLength, swimLength, jumpHeight);
    }

    @Override
    protected int swim(float swimLength) {
        return Animal.SWIM_NONE;
    }
}
