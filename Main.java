public class Main {
    public static void main(String[] args) {
        Sedan s=new Sedan("Toyota");
         s.accelerate();
         s.stop();
         s.gas();

         s.accelerate(25);
        
         s.openDoor();
         s.closeDoor();
         Motorcycle bike = new Motorcycle("Yamaha");
         bike.accelerate();
         
         Bus bus = new Bus("Isuzu");
         bus.accelerate();
         
         SportsCar car = new SportsCar("Ferrari");
         car.accelerate();

    }
}