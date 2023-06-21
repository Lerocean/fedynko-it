public class Fish implements Swimable {
    public void swim() {
        flipper();
        System.out.println("Я рыбка бульк-бульк, и я плыву");
    }
    private void flipper() {
        System.out.println("Я рыбка и чтобы плыть мне нужно быстро-быстро грести плавниками");
    }
}