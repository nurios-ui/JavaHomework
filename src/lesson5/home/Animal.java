package lesson5.home;

import java.util.Random;

public abstract class Animal {
    private String animalType;
    private float runLength;
    private float swimLength;
    private float jumpHeight;

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;
    //private float Random random = new Random();

    public Animal(String animalType, float runLength, float swimLength, float jumpHeight) {
       /* float jumpDiff = random.nextFloat() * jumpHeight - (jumpHeight / 2);
        float runDiff = random.nextFloat() * runLength - (runLength / 2);
        float swimDiff = random.nextFloat() * swimLength - (swimLength / 2);*/

                this.runLength = runLength;
        this.animalType = animalType;
        this.swimLength = swimLength;
        this.jumpHeight = jumpHeight;
     }

    /*public Animal (String animalType, float runLength, float jumpHeight) {
        this.animalType = animalType;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }*/

    String getAnimalType() {
        return this.animalType;
    }

    float getRunLength() {
        return this.runLength;
    }

    float getSwimLength() {
        return this.swimLength;
    }

    float getJumpHeight() {
        return this.jumpHeight;
    }

    protected boolean run(float runDist) {
        return (runDist <= runLength);
    }

    protected boolean jump(float jumpDist) {
        return (jumpDist <= jumpHeight);
    }

    protected int swim(float swimDist) {
        return (swimDist <= swimLength) ? SWIM_OK : SWIM_FAIL;
    }

}

