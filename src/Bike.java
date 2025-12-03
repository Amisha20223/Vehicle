public class Bike extends Vehicle {
    boolean hasCarrier;
    Bike(String brand,  double seats,  boolean hasCarrier) {
        super(brand,fuel);
        this.hasCarrier = hasCarrier;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println();
    }

}
