public class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    
    @Override
    public void accelerate() {
        speed += 20;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }
    
    @Override
    public void stop() {
        speed = 0;
        System.out.println(brand + " has stopped.");
    }
    
    @Override
    public void gas() {
        System.out.println(brand + " is refueling.");
    }
}