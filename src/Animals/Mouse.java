package Animals;

import Utilits.Animal;

public class Mouse extends Animal {
    @Override
    public void eat() {
        if (isReady()) {
            System.out.printf("%d year-old %s mouse is ready to eat %s\n", getAge(), getColor(), getMeal());
        }else {
            System.out.println("Mouse is not ready to eat!");
        }
    }

}
