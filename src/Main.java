import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vehicle vehicle = null;
        while (true){
            System.out.println("Enter vehicle name: ");
            System.out.println("Cawr"
            );
            System.out.println("bike");
            System.out.println("exit");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    vehicle=new Car(20);
                    break;
                case 2:
                    vehicle = new Bike("londo", 10,true);
                    break;
                case 3:
                    System.out.println("exit");
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            while(true){
                System.out.println("Enter vehicle type: ");
                System.out.println("Cawr");
                int action = sc.nextInt();
                switch(action){
                    case 1:
                        vehicle.displayInfo();
                        break;
                    case 2:
                        vehicle.fuelUp();
                        break;
                    case 3:
                        vehicle.travelDistance();
                        break;

                }
            }

        }
    }
}