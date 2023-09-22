package org.example;
public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // Добавление новых игрушек
        Toy toy1 = new Toy(1, "Самолет", 6, 20);
        Toy toy2 = new Toy(2, "Кукла", 8, 30);
        Toy toy3 = new Toy(3, "Машина", 10, 20);
        Toy toy4 = new Toy(4, "Пазл", 7, 40);
        Toy toy5 = new Toy(5, "Набор посуды", 3, 20);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);
        toyShop.addToy(toy4);
        toyShop.addToy(toy5);


        // Изменение веса выпадения игрушек
        toyShop.changeWeight(10, 50);

        // Организация розыгрыша игрушек
        for (int i = 0; i < 10; i++)
            toyShop.organizeGiveaway();


        // Получение призовой игрушки
        toyShop.getPrizeToy(1); // Выдача по номеру
        toyShop.getPrizeToy();  // Выдача всех игрушек
    }
}
