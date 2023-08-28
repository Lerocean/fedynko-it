package Cats_Project;

import  java.util.ArrayList;
public class Catalog {
    private int id;
    private String name;
    public ArrayList<String> catalogItems; // добавила создание списка, поменяла доступ public

    public Catalog(int id, String name, ArrayList <String> catalogItems) {
        this.id = id;
        this.name = name;
        this.catalogItems = catalogItems;
    }
    // пустой конструктор
    public Catalog() {
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getItems() {
        return catalogItems;
    }
    public void setItems(ArrayList<String> catalogItems) {
        this.catalogItems = catalogItems;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalogItems=" + catalogItems +
                '}';
    }
}

