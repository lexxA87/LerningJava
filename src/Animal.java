public class Animal {
    protected int id;
    public Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.printf("Animal %s is eating...\n", id);
    }
}
