public class Turtle extends AbstractAnimal{
    @Override
    void voice() {
        System.out.println("Я черепашка и я молчу");
    }
    @Override
    void walk() {
        System.out.println("Я черепашка, я могу и ходить, и плавать");
    }
}