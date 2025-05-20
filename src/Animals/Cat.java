package Animals;

import Utilits.Animal;

public class Cat extends Animal {

    @Override
    public void eat() {
        if (isReady()) {
            if (getAge() > 0 && getAge() < 15) {
                System.out.printf("%d year-old %s %s is eating %s right now!\n", getAge(), getColor(), getType(), getMeal());
                super.eat();
            }else {
                System.out.println("Beside that, cat's age must be in [1-14] gap");
            }
        }else {
            System.out.println("Cat is not ready to eat!");
        }

    }
}
