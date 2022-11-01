package com.syntax.class24;

public class CatEncap {
    String name;
    String breed;
    int age;
    double weight;

    public CatEncap(String name, String breed, int age, double weight) {

        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }


}
