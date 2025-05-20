package Animals;

import Utilits.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        if (isReady()) {
            System.out.printf("%d year-old %s dog is ready to eat %s\n", getAge(), getColor(), getMeal());
        }else {
            System.out.println("Dog is not ready to eat!");
        }
    }
}
