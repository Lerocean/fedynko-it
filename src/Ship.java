public class Ship implements Swimable {
    public void swim() {
        fuel();
        System.out.println("Я корабль у-ууу, и я плыву");
    }
    private void fuel() {
        System.out.println("Я корабль и чтобы плыть мне нужно много топлива");
    }
}