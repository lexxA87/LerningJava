public class Dog extends Animal{
    public Dog(int id) {
        super(id);
    }

    public void eat(){
        System.out.printf("Dog %s is eating...\n", this.id);
    }
    public void bark(){
        System.out.printf("Dog %s is barking...\n", this.id);
    }
}
