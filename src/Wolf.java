public class Wolf extends AbstractAnimal {
    @Override
    void voice() {
        System.out.println("Я волк и я вою аууууу");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Я волк, я умею не только ходить, но еще и быстро бежать за добычей");
    }
}