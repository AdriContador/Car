package cat.car;

public class Main {

    public static void main(String[] args) {
        Car fcar = new Car();

        fcar.setBrand("Ferrari");
        System.out.println(fcar.getBrand());

        fcar.setSpeed(350f);
        System.out.println(fcar.getSpeed());

        fcar.setColor("Red");
        System.out.println(fcar.getColor());
    }
}
