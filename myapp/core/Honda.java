package myapp.core;

// inherits from the Car Class, Honda is a child or subclass
public class Honda extends Car {

    public Honda() {
        this.setMake("Honda");
        // this.make() // cannot be used because it is a private method unless it is changed to protected
    }

    // new method that other cars doesnt have
    public void accelerate() {
        System.out.println("Accelerating..");
    }

    // use @Override to let java tell you when the signature is different
    //@Override
    public void stop(int count) {
        System.out.println("Honda stopping...stop");
    }
}
