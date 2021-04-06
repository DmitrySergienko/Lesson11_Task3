package ru.geekbrins.Lesson11_Task3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> implements Comparable<Box<T>> {
    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }

    //тут храним фрукты
    private final List<T> fruits;

//иницализирем фрукты
    public Box() {
        fruits = new ArrayList<>();
    }

//метод для укладывания фрукта в коробку
    public boolean putFruit (T fruit) {
        return fruits.add(fruit);
    }

// метод для перекладывания фрукта (недописан)
    public T replace (T fruit){
        if(fruits.contains(fruit)){
            fruits.remove(fruit);
        }
        return null;
    }

// метод для подсчитывания веса коробки
    public float getBoxWeight(){
        float sum = 0;
        for (T a: this.fruits)
        {
            sum += a.getWeight();
        }return sum;
    }

//метод для сравнения коробок
   @Override
  public int compareTo(Box myBox) {
      if (this.getBoxWeight() > myBox.getBoxWeight()) {
          return 1;
      }else if(this.getBoxWeight() < myBox.getBoxWeight()){
          return -1;
      }else {
      return 0;}
  }
}
