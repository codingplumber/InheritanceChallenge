package jason.company;

public class Main {

    public static void main(String[] args) {
        Vehicle sedan = new Vehicle();
        Car ford = new Car(4);

//        sedan.turn("l");
//        sedan.drive(100);
//        sedan.brake();

        ford.drive(120);

        System.out.println(sedan.getColor());
        System.out.println(sedan.getTopSpeed());
    }
}
