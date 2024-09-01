import java.util.ArrayList;
import java.util.List;

public class TestOgGenerics {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        listOfAnimals.add(new Dog(1));
        listOfAnimals.add(new Dog(2));
        listOfAnimals.add(new Cat(3));
        listOfAnimals.add(new Cat(4));

        List<Dog> listOfDogs = new ArrayList<>();
        //listOfDogs.add(new Animal());  it's wrong!!!
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));


        testGeneric(listOfAnimals);
        System.out.println();
        testGeneric(listOfDogs);
    }

    public  static void testGeneric(List<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
            if(animal.getClass() == Dog.class){
                ((Dog) animal).bark();
            }
        }
    }
}
