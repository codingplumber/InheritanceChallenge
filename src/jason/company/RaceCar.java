package jason.company;

public class RaceCar extends Car {
    private boolean turbo;

    public RaceCar(boolean turbo) {
        this.turbo = turbo;
    }

    public RaceCar(int numberOfDoors, boolean turbo) {
        super(numberOfDoors);
        this.turbo = turbo;
    }

    public RaceCar(int numberOfDoors, int seatPosition, double radioStation, boolean sunroof, boolean turbo) {
        super(numberOfDoors, seatPosition, radioStation, sunroof);
        this.turbo = turbo;
    }

    public RaceCar(int numberOfGears, int topSpeed, int numberOfDoors, int seatPosition, double radioStation, boolean sunroof, boolean turbo) {
        super(numberOfGears, topSpeed, numberOfDoors, seatPosition, radioStation, sunroof);
        this.turbo = turbo;
    }
}
