package solidpack.isp;

public class Car implements WalkingAnimal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat is running");

    }
}
