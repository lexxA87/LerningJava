public class TestOfPolimirfizm {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Dog dog = new Dog(2);
        Cat cat = new Cat(3);

        Animal animal1 = new Dog(4);

        test(animal);
        test(animal1);
        test(dog);
        test(cat);

        //test1(animal1);

    }

    public static void test(Animal animal){
        animal.eat();
    }
    public static void test1(Dog dog){
        dog.eat();
    }
}
