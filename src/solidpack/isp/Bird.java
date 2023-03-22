package solidpack.isp;

public class Bird implements FlyingAnimal {
    @Override
    public void eat() {
        System.out.println("Bird");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
