public class SportsCar extends Vehicle implements autoMobile {
    public SportsCar(String brand) {
        super(brand);
    }
    @Override
    public void accelerate() {
        speed += 30;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(brand + " has stopped.");
    }
    @Override
    public void gas() {
        System.out.println(brand + " is refueling");
    }
    @Override
    public void openDoor() {
        System.out.println("Opening the door of the sports car");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing the door of the sports car");
    }
}