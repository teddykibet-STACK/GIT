abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void accelerate();
    public abstract void stop();
    public abstract void gas();
    
    public Vehicle(String brand) {
        this(brand, 0);
    }
    
    void accelerate (int increment){
        speed += increment;
        System.out.println(brand + " accelerating by " + increment + " current speed is " + speed);
    }
}