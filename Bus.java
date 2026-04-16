class Bus extends Vehicle{

    Bus (String brand){
        super(brand, 0);
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(brand + " is accelerating. Current speed: " + speed + " km/h");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(brand + " has stopped.");
    }

    @Override
    public void gas() {
        System.out.println(brand + " is refuelling.");
    }
}