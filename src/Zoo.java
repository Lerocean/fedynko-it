public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Goat goat = new Goat();
        Wolf wolf = new Wolf();
        Turtle turtle = new Turtle();

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ГОЛОС");
        System.out.println("----------------------------");
        zookeeper.makeVoid(goat);
        System.out.println("----------------------------");
        zookeeper.makeVoid(wolf);
        System.out.println("----------------------------");
        zookeeper.makeVoid(turtle);
        System.out.println("----------------------------");

        System.out.println("Сейчас смотритель за животными попросит выполнить команду ПРОГУЛКА");
        System.out.println("----------------------------");
        zookeeper.makeWalk(goat);
        System.out.println("----------------------------");
        zookeeper.makeWalk(wolf);
        System.out.println("----------------------------");
        zookeeper.makeWalk(turtle);
        System.out.println("----------------------------");
    }
}