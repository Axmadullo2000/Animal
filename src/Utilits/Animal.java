package Utilits;

public class Animal {
    private int age;
    private String color;
    private String type;
    private String meal;
    private boolean isReady;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public Animal() {
        System.out.println("------------------------------------------------");
        System.out.println("Animal got up!");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void eat() {
        System.out.println("Animal has finished eating meal!");
    }

    public int getAge() {
        return age;
    }

    public void live() {}

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

}
