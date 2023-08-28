package Cats_Project;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 25 items / all items
        Item ballRed = new Item(1, "Мяч красный", 10.0, 5);
        Item ballBlue = new Item(11, "Мяч синий", 10.0, 6);
        Item ballWhite = new Item(111, "Мяч белый", 10.0, 5);
        Item ballBlack = new Item(1111, "Мяч черный", 10.0, 4);
        Item ballGreen = new Item(11111, "Мяч зеленый", 10.0, 5);
        Item dollBarbie = new Item(2, "Кукла Барби", 20.0, 10);
        Item dollCandy = new Item(22, "Кукла Кенди", 20.0, 4);
        Item dollMary = new Item(222, "Кукла Мэри", 20.0, 8);
        Item dollKim = new Item(2222, "Кукла Ким", 20.0, 5);
        Item dollNina = new Item(22222, "Кукла Нина", 20.0, 9);
        Item puzzle1 = new Item(3, "Пазлы 1", 15.0, 5);
        Item puzzle2 = new Item(33, "Пазлы 2", 15.0, 9);
        Item puzzle3 = new Item(333, "Пазлы 3", 15.0, 8);
        Item puzzle4 = new Item(3333, "Пазлы 4", 15.0, 5);
        Item puzzle5 = new Item(33333, "Пазлы 5", 15.0, 2);
        Item carGreen = new Item(4, "Машинка зеленая", 25.0, 5);
        Item carBlack = new Item(4, "Машинка черная", 25.0, 5);
        Item carYellow = new Item(4, "Машинка желтая", 25.0, 5);
        Item carPink = new Item(4, "Машинка розовая", 25.0, 5);
        Item carPurple = new Item(4, "Машинка фиолетовая", 25.0, 5);
        Item constructorVeryEasy = new Item(5, "Конструктор очень легкий", 30.0, 5);
        Item constructorEasy = new Item(5, "Конструктор легкий", 30.0, 5);
        Item constructorMedium = new Item(5, "Конструктор средний", 30.0, 5);
        Item constructorHard = new Item(5, "Конструктор сложный", 30.0, 5);
        Item constructorVeryHard = new Item(5, "Конструктор очень сложный", 30.0, 5);

        // List of all items
        ArrayList<Item> allItems = new ArrayList<>();
        allItems.add(ballRed);
        allItems.add(ballBlue);
        allItems.add(ballWhite);
        allItems.add(ballGreen);
        allItems.add(ballBlack);
        allItems.add(dollBarbie);
        allItems.add(dollCandy);
        allItems.add(dollMary);
        allItems.add(dollKim);
        allItems.add(dollNina);
        allItems.add(puzzle5);
        allItems.add(puzzle4);
        allItems.add(puzzle3);
        allItems.add(puzzle2);
        allItems.add(puzzle1);
        allItems.add(carGreen);
        allItems.add(carBlack);
        allItems.add(carYellow);
        allItems.add(carPink);
        allItems.add(carPurple);
        allItems.add(constructorVeryEasy);
        allItems.add(constructorEasy);
        allItems.add(constructorMedium);
        allItems.add(constructorHard);
        allItems.add(constructorVeryHard);

        // Item lists by catalog (items added by type into each catalog)
        // Balls
        ArrayList<String> CatalogBalls = new ArrayList<>();
        CatalogBalls.add(ballRed.getName());
        CatalogBalls.add(ballBlue.getName());
        CatalogBalls.add(ballWhite.getName());
        CatalogBalls.add(ballGreen.getName());
        CatalogBalls.add(ballBlack.getName());

        // Dolls
        ArrayList<String> CatalogDolls = new ArrayList<>();
        CatalogDolls.add(dollBarbie.getName());
        CatalogDolls.add(dollCandy.getName());
        CatalogDolls.add(dollMary.getName());
        CatalogDolls.add(dollKim.getName());
        CatalogDolls.add(dollNina.getName());

        // Puzzles
        ArrayList<String> CatalogPuzzles = new ArrayList<>();
        CatalogPuzzles.add(puzzle1.getName());
        CatalogPuzzles.add(puzzle2.getName());
        CatalogPuzzles.add(puzzle3.getName());
        CatalogPuzzles.add(puzzle4.getName());
        CatalogPuzzles.add(puzzle5.getName());

        // Cars
        ArrayList<String> CatalogCars = new ArrayList<>();
        CatalogCars.add(carGreen.getName());
        CatalogCars.add(carBlack.getName());
        CatalogCars.add(carYellow.getName());
        CatalogCars.add(carPink.getName());
        CatalogCars.add(carPurple.getName());

        // Constructors
        ArrayList<String> CatalogConstructors = new ArrayList<>();
        CatalogConstructors.add(constructorVeryEasy.getName());
        CatalogConstructors.add(constructorEasy.getName());
        CatalogConstructors.add(constructorMedium.getName());
        CatalogConstructors.add(constructorHard.getName());
        CatalogConstructors.add(constructorVeryHard.getName());

        // 5 Catalogs types and items in them, using the above lists
        System.out.println("5 разделов каталога и товары в них:");
        Catalog balls = new Catalog(28, "Мячи", CatalogBalls);
        System.out.println(balls.getName() + ":" + balls.getItems());
        Catalog dolls = new Catalog(29, "Куклы", CatalogDolls);
        System.out.println(dolls.getName() + ":" + dolls.getItems());
        Catalog puzzles = new Catalog(30, "Пазлы", CatalogPuzzles);
        System.out.println(puzzles.getName() + ":" + puzzles.getItems());
        Catalog cars = new Catalog(31, "Машинки", CatalogCars);
        System.out.println(cars.getName() + ":" + cars.getItems());
        Catalog constructors = new Catalog(32, "Конструкторы", CatalogConstructors);
        System.out.println(constructors.getName() + ":" + constructors.getItems());
        System.out.println();

// printing out all existing items (25) and their data
        System.out.println("Список всех товаров на складе:");
        ballRed.printItemInfo();
        ballBlue.printItemInfo();
        ballWhite.printItemInfo();
        ballBlack.printItemInfo();
        ballGreen.printItemInfo();
        dollBarbie.printItemInfo();
        dollCandy.printItemInfo();
        dollMary.printItemInfo();
        dollKim.printItemInfo();
        dollNina.printItemInfo();
        puzzle1.printItemInfo();
        puzzle2.printItemInfo();
        puzzle3.printItemInfo();
        puzzle4.printItemInfo();
        puzzle5.printItemInfo();
        carGreen.printItemInfo();
        carBlack.printItemInfo();
        carYellow.printItemInfo();
        carPink.printItemInfo();
        carPurple.printItemInfo();
        constructorVeryEasy.printItemInfo();
        constructorEasy.printItemInfo();
        constructorMedium.printItemInfo();
        constructorHard.printItemInfo();
        constructorVeryHard.printItemInfo();

        // 5 users
        User user1 = new User(400, "Мария", "Савельева", "maria.savelieva@gmail.com", "женский", "15.06.2000");
        user1.printToString();
        User user2 = new User(401, "Елена", "Иванова", "elena.ivanove@gmail.com", "женский", "14.01.1998");
        user2.printToString();
        User user3 = new User(402, "Игорь", "Молев", "igor.molev@gmail.com", "мужской", "11.12.1991");
        user3.printToString();
        User user4 = new User(403, "Мелисса", "Белова", "melissa.white@gmail.com", "женский", "25.08.1983");
        user4.printToString();
        User user5 = new User(404, "Иван", "Черных", "ivan.black@gmail.com", "мужской", "08.07.2005");
        user5.printToString();

        // List of all users
        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(user1);
        allUsers.add(user2);
        allUsers.add(user3);
        allUsers.add(user4);
        allUsers.add(user5);

        // Random user actions using allUsers and allItems lists
        Random choices = new Random();
        for (int i = 0; i < 5; i++) {
            User randomUser = allUsers.get(choices.nextInt(allUsers.size()));
            Item randomItem = allItems.get(choices.nextInt(allItems.size()));
            System.out.println("Пользователь " + randomUser.getUser_name() + " " + randomUser.getUser_surname()
                    + " положил/a в корзину следующий товар: " + randomItem.getName() + ", ID товара: " + randomItem.getId());
        }

        // реализация метода create и добавление в каталог
        Item ballYellow = new Item(6, "Мяч желтый", 12.0, 5);
        ballYellow.create();
        System.out.println(ballYellow.getName() + " добавлен в каталог");
        ballYellow.printItemInfo();
        CatalogBalls.add(ballYellow.getName());

        // реализация метода delete и удаление из каталога
        ballYellow.delete();
        CatalogBalls.remove(ballYellow.getName());
        System.out.println(ballYellow.getName() + " id=" + ballYellow.getId() + " удален из каталога");

        // реализазция метода read и выведение информации о товаре
        ballYellow.read();

        // реализация метода create и добавление пользователя
        User user6 = new User(405, "Александр", "Пушкин", "alex.pushkin@mail.ru", "мужской", "06.07.1799");
        user6.create();
        user6.printToString();
        allUsers.add(user6);

        // реализация метода delete, удаление пользователя
        user6.delete();
        allUsers.remove(user6);
        System.out.println("Пользователь " + user6.getUser_id() + " " + user6.user_name + " " + user6.user_surname + " удален из списка");
    }
}
