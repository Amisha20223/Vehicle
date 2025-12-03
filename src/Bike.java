public class Bike extends Vehicle {
    boolean hasCarrier;
    Bike(String brand,  double seats,  boolean hasCarrier) {
        super("moto",5.0);
        this.hasCarrier = hasCarrier;
    }
    @Override
   public void displayInfo(){
        super.displayInfo();
        System.out.println();
    }

}
