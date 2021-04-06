package ru.geekbrins.Lesson11_Task3;

public class App{

    public static void main(String[] args) {

// Создаю Класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// Заполяню коробки фруктами методом putFruit()

// Коробка 1 с яблоками
        Box<Apple> boxOne = new Box<>();
        boxOne.putFruit(new Apple("Антоновка", 1.0f));
        boxOne.replace(new Apple("Антоновка", 1.0f));

// Коробка 2 с яблоками
        Box<Apple> boxTwo = new Box<>();
        boxTwo.putFruit(new Apple("Антоновка", 1.0f));
        boxTwo.putFruit(new Apple("Антоновка", 1.0f));
        boxTwo.putFruit(new Apple("Антоновка", 1.0f));
        boxTwo.putFruit(new Apple("Антоновка", 1.0f));

// Коробка 3 с апельсинами
        Box<Orange> boxThree = new Box<>();
        boxThree.putFruit(new Orange("Павловский", 1.5f));

// Коробка 4 с апельсинами
        Box<Orange> boxFour = new Box<>();
        boxFour.putFruit(new Orange("Павловский", 1.5f));
        boxFour.putFruit(new Orange("Павловский", 1.5f));
        boxFour.putFruit(new Orange("Павловский", 1.5f));
        boxFour.putFruit(new Orange("Павловский", 1.5f));

// Определяю вес коробок
        final float firstBoxWeight = boxOne.getBoxWeight();
        final float secondBoxWeight = boxTwo.getBoxWeight();
        final float thirdBoxWeight = boxThree.getBoxWeight();
        final float fourchBoxWeight = boxFour.getBoxWeight();

// Срваниваю вес
        int resultWeightCompare = boxOne.compareTo(boxTwo);
        System.out.println("Сравнение веса методом compareTo()");
        System.out.println("Сравниваем первую со второй:");
        System.out.println("Вес первой коробки: " + firstBoxWeight);
        System.out.println("Вес второй коробки: " + secondBoxWeight);

        if(resultWeightCompare == -1){
            System.out.println("Вес текщей коробки меньше взвешиваемой!");
        }else if(resultWeightCompare == 0) {
            System.out.println("Вес коробок одинаковый!");
        }else if(resultWeightCompare == 1) {
            System.out.println("Вес текщей коробки больше взвешиваемой!");
        }
    }

}
