import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int blackCurrent = 0;
        int whiteForest = 0;
        int chocolate = 0;
        int redVelvet = 0;
        double blackCurrentPrice = 0.5;
        double whiteForestPrice = 0.3;
        double chocolatePrice = 0.4;
        double redVelvetPrice = 0.45;
        

        System.out.println("Enter no of Black Current (minimum 1): ");
        while (!scanner.hasNextInt() || (blackCurrent = scanner.nextInt()) < 1) {
            System.out.println("Invalid input. Please enter an integer (minimum 1) for Black Current: ");
            if (!scanner.hasNextInt()) {
                scanner.next(); 
            }
        }

        System.out.println("Enter no of White Forest (minimum 1): ");
        while (!scanner.hasNextInt() || (whiteForest = scanner.nextInt()) < 1) {
            System.out.println("Invalid input. Please enter an integer (minimum 1) for White Forest: ");
            if (!scanner.hasNextInt()) {
                scanner.next(); 
            }
        }

        System.out.println("Enter no of Chocolate (minimum 1): ");
        while (!scanner.hasNextInt() || (chocolate = scanner.nextInt()) < 1) {
            System.out.println("Invalid input. Please enter an integer (minimum 1) for Chocolate: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
            }
        }

        System.out.println("Enter no of Red Velvet (minimum 1): ");
        while (!scanner.hasNextInt() || (redVelvet = scanner.nextInt()) < 1) {
            System.out.println("Invalid input. Please enter an integer (minimum 1) for Red Velvet: ");
            if (!scanner.hasNextInt()) {
                scanner.next(); 
            }
        }

        System.out.println("===================================================");
        System.out.printf("%-15s %10s %10s %10s%n", "Menu item", "Price", "Qty", "Payable");
    	System.out.println("===================================================");
    	
    	double totalCost = 0;
    	
    	totalCost += calculatecost("Black Current",blackCurrentPrice,blackCurrent);
    	totalCost += calculatecost("White Forest",whiteForestPrice,whiteForest);
    	totalCost += calculatecost("Chocolate",chocolatePrice,chocolate);
    	totalCost += calculatecost("Red Velvet",redVelvetPrice,redVelvet);
    	System.out.println("===================================================");
    	
    	String formattedValue = String.format("%.2f", totalCost);

        System.out.println("Total:" + "                                      "  +  formattedValue);
    	System.out.println("===================================================");

        scanner.close();
    }
    
    public static double calculatecost(String item,  double price, int qty)
    {
    	double cost =  price*qty;
        System.out.printf("%-15s %10.2f %10d %10.2f%n", item, price, qty, cost);
    	return cost;
    }
}

