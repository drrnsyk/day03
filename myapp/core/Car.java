package myapp.core;

// Class
public class Car implements Controllable {

    // properties or members
    private String colour;
    private String make;
    private int engineCapacity;
    private boolean started = false;
    public long startedSince;

    // default constructor - notice there is nothing between public and Car, no return type, Name is same as class name
    public Car() {
        System.out.println("*** Instantiating Car object");
        this.colour = "red"; // when i create a car, construct it to red (like setting a predefine value)
    }
    // constructor with input field
    public Car(int capacity) {
        this.engineCapacity = capacity;
    }
    // constructor with more than 1 input field
    public Car(String colour, String make) {
        this.colour = colour;
        this.make = make;
    }
 



    // setter method
    public void setColour(String c) {
        this.colour = c;
    }

    public void setEngineCapacity(int capacity) {
        this.engineCapacity = capacity;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean isStarted() {
        return started;
    }


    // getter method
    public String getColour() {
        return this.colour;
    }
    public int getEngineCapacity() {
        return this.engineCapacity;
    }

    public String getMake() {
        return this.make;
    }

    public Boolean getStarted() {
        return started;
    }

    public Long getDrivingDuration() {
        if (this.isStarted())
            // Convert to ms -> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        return (long)-1;
    }



    // behaviour
    public void start() {
        if (this.started) {
            System.out.println("Your car is running");
        }
        else {
            System.out.println("Vroom...");
            this.started = true;
            // Since 0000 Jan 1 1970
            this.startedSince = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("Your car is not running");
        } else
        {
            System.out.println("Splutter..stop");
            this.started = false;
        }
    }

    
}