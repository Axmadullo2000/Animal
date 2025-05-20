import Animals.Cat;
import Animals.Dog;
import Animals.Mouse;

public class Main {
    public static void main(String[] args) {
        /// Cat

        Cat cat = new Cat();

        cat.setType("Siamese cat");
        cat.setColor("Dark brown");
        cat.setAge(11);
        cat.setMeal("little bird");
        cat.setReady(false);

        cat.eat();

        /// Mouse

        Mouse mouse = new Mouse();
        mouse.setType("Rattus norvegicus");
        mouse.setColor("light black");
        mouse.setAge(11);
        mouse.setMeal("cheese");
        mouse.setReady(false);

        mouse.eat();

        /// Dog

        Dog dog = new Dog();
        dog.setType("Hound Group");
        dog.setColor("white blend brown");
        dog.setAge(14);
        dog.setMeal("meat cans");
        dog.setReady(false);

        dog.eat();

        System.out.println("------------------------------------------------");
    }
}
