package ru.geekbrins.Lesson11_Task3;

public abstract class Fruit{
    private String name;
    private float weight;

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }


}