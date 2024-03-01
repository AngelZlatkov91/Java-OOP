package Inheritance.RandomArrayLIst_03;

public class Main {
    public static void main(String[] args) {
        RandomArrayLIst<Integer> randomArrayLIst = new RandomArrayLIst<>();

          randomArrayLIst.add(52);
          randomArrayLIst.add(40);
          randomArrayLIst.add(3);
          randomArrayLIst.add(10);
          randomArrayLIst.add(20);
        System.out.println(randomArrayLIst.getRandomElement());
        System.out.println(randomArrayLIst.getRandomElement());
        System.out.println(randomArrayLIst.getRandomElement());

    }
}
