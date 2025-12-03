//public class Car extends Vehicle{
//    int seats;
////    public Car(int seats) {
////        this.seats = seats;
//public Car(int seats) {
//    super("max" ,5.0);
//   // this.seats=seats;
//
//
//
//   void displayInfo(){
//        super.displayInfo();
//        System.out.println("Seats: ");
//    }
////    this.seats = seats;
//    }
//
//}

class Car extends Vehicle {
    int seats;

    Car(String brand, double fuel, int seats) {
        super(brand, fuel);
        this.seats = seats;
    }

//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Seats: " + seats);
//    }
}
