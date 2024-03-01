package Inheritance.RandomArrayLIst_03;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayLIst<T> extends ArrayList<T> {
    private final static  Random RANDOM = ThreadLocalRandom.current();

    public T getRandomElement() {
        int randomIndex = RANDOM.nextInt(super.size());
        return super.get(randomIndex);
    }






}
