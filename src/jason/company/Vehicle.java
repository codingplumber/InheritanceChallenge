package jason.company;

public class Vehicle {
    private String make;
    private String model;
    private String year;
    private String color;
    private int numberOfGears;
    private int topSpeed;
    private int gear;
    private int speed;
    private String direction;
    
    public Vehicle() {
        this("Default Make", "Default Model", "Default Year", "Default Color", 5, 100, "straight", 1, 0);
    }

    public Vehicle(int numberOfGears, int topSpeed) {
        this("Default Make", "Default Model", "Default Year", "Default Color", 5, 100 , "straight", 1, 0);
    }

    public Vehicle(String make, String model, String year, String color) {
        this(make, model, year, color, 5, 100, "straight", 1, 0);
    }

    public Vehicle(String make, String model, String year, String color, int numberOFGears, int topSpeed, String direction, int gear, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.numberOfGears = numberOFGears;
        this.topSpeed = topSpeed;
        this.direction = direction;
        this.gear = gear;
        this.speed = speed;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeGears(int gear) {
        if (gear > getNumberOfGears() || gear > 0) {
            System.out.println("Grinding gears......!!");
        } else {
            this.gear = gear;
            System.out.println("You are in " + this.gear + getOrdinalIndicator(gear));
        }
    }

    public void drive(int speed) {
        String message;

        if (speed < 0) {
            this.speed = 0;
            message = "You are standing still";
        } else if (speed > getTopSpeed()) {
            this.speed = 0;
            message = "Too fast!!! Your engine blew......";
        } else {
            this.speed = speed;
            message = "Your speed is " + this.speed + " mph";
        }

        System.out.println(message);
    }

    public void brake() {
        speed = 0;
        System.out.println("You hit the brakes! Your speed is now " + speed);
    }

    public void turn(String direction) {
        switch (direction.toLowerCase()) {
            case "l":
                this.direction = "left";
                break;

            case "r":
                this.direction = "right";
                break;

            case "s":
                this.direction = "straight";
                break;

            default:
                break;
        }

        String message = isValidDirection(direction) ? "You went " + this.direction : "Invalid direction. Enter either 'l' for left, 'r' for right, or 's' for straight." ;

        System.out.println(message);
    }

    // checks if direction is valid
    private boolean isValidDirection(String direction) {
        switch (direction) {
            case "l": case "r": case "s":
                return true;
            default:
                return false;
        }
    }

    // gets the correct ordinal indicator for the gear for the display message
    private String getOrdinalIndicator(int gear) {
        String ordinalIndicator;

        switch (gear) {
            case 0:
                ordinalIndicator = "";
                break;
            case 1:
                ordinalIndicator = "st";
                break;
            case 2:
                ordinalIndicator = "nd";
                break;
            case 3:
                ordinalIndicator = "rd";
                break;
            default:
                ordinalIndicator = "th";
        }

        return ordinalIndicator;
    }
}
