class Sedan extends Vehicle implements autoMobile {

    Sedan(String brand) {
        super(brand);
    }

    @Override
    public void accelerate() {
        speed += 15;
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

    @Override
    public void openDoor() {
        System.out.println(brand + " door is opening.");
    }

    @Override
    public void closeDoor() {
        System.out.println(brand + " door is closing.");
    }
}