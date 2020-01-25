package jason.company;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int seatPosition;
    private double radioStation;
    private boolean sunroof;

    public Car() {
        this(2, 5, 107.5, false);
    }

    public Car(int numberOfDoors) {
        this(numberOfDoors, 5, 107.5, false);
    }

    public Car(int numberOfDoors, int seatPosition, double radioStation, boolean sunroof) {
        this.numberOfDoors = numberOfDoors;
        this.seatPosition = seatPosition;
        this.radioStation = radioStation;
        this.sunroof = sunroof;
    }

    public Car(int numberOfGears, int topSpeed, int numberOfDoors, int seatPosition, double radioStation, boolean sunroof) {
        super(numberOfGears, topSpeed);
        this.numberOfDoors = numberOfDoors;
        this.seatPosition = seatPosition;
        this.radioStation = radioStation;
        this.sunroof = sunroof;
    }

    public Car(String make, String model, String year, String color, int numberOfDoors, int seatPosition, double radioStation, boolean sunroof) {
        super(make, model, year, color);
        this.numberOfDoors = numberOfDoors;
        this.seatPosition = seatPosition;
        this.radioStation = radioStation;
        this.sunroof = sunroof;
    }

    public Car(String make, String model, String year, String color, int numberOFGears, int topSpeed, String direction, int gear, int speed, int numberOfDoors, int seatPosition, double radioStation, boolean sunroof) {
        super(make, model, year, color, numberOFGears, topSpeed, direction, gear, speed);
        this.numberOfDoors = numberOfDoors;
        this.seatPosition = seatPosition;
        this.radioStation = radioStation;
        this.sunroof = sunroof;
    }
}
