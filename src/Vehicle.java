
class Vehicle
{
    String brand;
    double fuel;
    Vehicle(String brand,double fuel){
        this.brand=brand;
        this.fuel=fuel;
    }



    public void displayInfo() {

        System.out.println(brand);
        System.out.println(fuel);
        //show
    }

    public void fuelUp() {
        //adds 10 liters
        fule = fuel+10;
        System.out.println("fuel up");


    }

    public void fuelUp(double liters) {
        fuel = fuel+liters;
        //add given number of liters
        System.out.println("fuel up");

    }

    public double travelDistance(double efficiency) {
        //return
        //double efficiency
    }
}
