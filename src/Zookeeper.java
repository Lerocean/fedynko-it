public class Zookeeper {
    void makeVoid(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными в зоопарке и сейчас я попрошу животное выполнить команду ГОЛОС");
        abstractAnimal.voice();
    }

    void makeWalk(AbstractAnimal abstractAnimal){
        System.out.println("Я смотритель за животными и сейчас я поведу животное на прогулку");
        abstractAnimal.walk();
    }
}