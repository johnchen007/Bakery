import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatBot {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> messages = new ArrayList<>();
        CarInfo carInfo = new CarInfo();

        System.out.println("Welcome to BMW Dealership, please tell me your name:");
        messages.add("Name: " + scanner.nextLine());

        System.out.println("Please enter your zip code:");
        messages.add("Zip Code: " + scanner.nextLine());

        System.out.println("Please enter your state:");
        messages.add("State: " + scanner.nextLine());

        System.out.println("Please enter your city:");
        messages.add("City: " + scanner.nextLine());
        
        System.out.println("Please enter your email address:");
        messages.add("Email: " + scanner.nextLine());
        
        System.out.println("What is your number");
        messages.add("Number: " + scanner.nextLine());

        System.out.println("We have 3 models for sale, X3, X5, X7. Which car would you like to buy?");
        System.out.println("Type x3 to choose x3");
        System.out.println("Type x5 to choose x5");
        System.out.println("Type x7 to choose x7");
        String model = scanner.nextLine().toLowerCase();
        carInfo.setCarModel(model); 
        messages.add("Model: " + model);


        carInfo.setModelInfo(model); 

        if (carInfo.getCarModel().equals("x3") || carInfo.getCarModel().equals("x5") || carInfo.getCarModel().equals("x7")) {
            System.out.println("The MSRP for this car is " + carInfo.getMSRP() + ", if you buy today price is " + carInfo.getPrice() + ". Do you want to proceed with this price?");
            messages.add("Interested: " + scanner.nextLine().toLowerCase());
        }
        else {
        	String notAvailable = "Sorry, we do not have that model, we will call you when we have it";
            System.out.println(notAvailable);
            messages.add("Result: " + notAvailable);
        }
        if (messages.toString().contains("yes")) 
        {
        	System.out.println("How do you want to pay?"); 
            String paymentMethod = scanner.nextLine().toLowerCase();
            messages.add("Payment Method: " + paymentMethod);

            switch (paymentMethod) {
                case "cash":
                    System.out.println("Great! You have chosen to pay in cash.");
                    System.out.println("Please come to our dealership location to make the payment");
                    System.out.println("Let me book an appointment for you");
                    
                    System.out.println("1. Monday 3 PM");
                    System.out.println("2. Wednesday 5 PM");
                    System.out.println("3. Friday 6 PM");

                    System.out.print("Please enter the number of your preferred appointment: ");
                    
                    int choice = scanner.nextInt();
                    switch (choice) {
                    case 1:
                        System.out.println("You have chosen Monday 3 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Monday 3 PM");
                        break;
                    case 2:
                        System.out.println("You have chosen Wednesday 5 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Wednesday 5 PM");

                        break;
                    case 3:
                        System.out.println("You have chosen Friday 6 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Friday 6 PM");

                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid appointment option.");
                }


                    break;
                case "finance":
                    Finance finance  = new Finance();
                    System.out.println("You have chosen to finance. Please enter your finance details.");
                    System.out.println("How much are you down payment");
                    finance.setDownPayment(scanner.nextDouble());
                    messages.add("Down Payment " + finance.getDownPayment());
                    System.out.println("How long do you want to pay, 36 months,48 months or 60 months");
                    finance.setTerms(scanner.nextInt());
                    messages.add("Terms " + finance.getTerms());
                    String monthlyPayment = "you payment is " + finance.calculateMonthlyPayment(carInfo.getPrice(),6.0,finance.getDownPayment(),finance.getTerms());
                    messages.add("monthly Payment is " + monthlyPayment);
                    System.out.println(monthlyPayment);
                    // Add logic for finance payment here
                    System.out.println("Please come to our dealership location to make the payment");
                    System.out.println("Let me book an appointment for you");
                    
                    System.out.println("1. Monday 3 PM");
                    System.out.println("2. Wednesday 5 PM");
                    System.out.println("3. Friday 6 PM");

                    System.out.print("Please enter the number of your preferred appointment: ");
                    
                    int choice1 = scanner.nextInt();
                    switch (choice1) {
                    case 1:
                        System.out.println("You have chosen Monday 3 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Monday 3 PM");
                        break;
                    case 2:
                        System.out.println("You have chosen Wednesday 5 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Wednesday 5 PM");

                        break;
                    case 3:
                        System.out.println("You have chosen Friday 6 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Friday 6 PM");

                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid appointment option.");
                }

                    break;
                case "lease":
                    Lease lease  = new Lease();
                    System.out.println("You have chosen to lease. Please enter your lease details.");
                    System.out.println("How much are you down payment");
                    lease.setDownPayment(scanner.nextDouble());
                    messages.add("Down Payment " + lease.getDownPayment());
                    System.out.println("How long do you want to pay, 36 months,48 months or 60 months");
                    lease.setTerms(scanner.nextInt());
                    messages.add("Terms " + lease.getTerms());
                    String LeaseMonthlyPayment = "you payment is " + lease.calculateMonthlyPayment(carInfo.getPrice(),6.0,lease.getDownPayment(),lease.getTerms());
                    messages.add("monthly Payment is " + LeaseMonthlyPayment);
                    System.out.println(LeaseMonthlyPayment);    
                    System.out.println("Please come to our dealership location to make the payment");
                    System.out.println("Let me book an appointment for you");
                    
                    System.out.println("1. Monday 3 PM");
                    System.out.println("2. Wednesday 5 PM");
                    System.out.println("3. Friday 6 PM");

                    System.out.print("Please enter the number of your preferred appointment: ");
                    
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                    case 1:
                        System.out.println("You have chosen Monday 3 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Monday 3 PM");
                        break;
                    case 2:
                        System.out.println("You have chosen Wednesday 5 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Wednesday 5 PM");

                        break;
                    case 3:
                        System.out.println("You have chosen Friday 6 PM. Your appointment is booked.");
                        messages.add("appointment time is " + "Friday 6 PM");

                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid appointment option.");
                }

                    break;
                default:
                    System.out.println("Invalid payment method. Please choose cash, finance, or lease.");
                    break;
            }

            
        }
        else {
            System.out.println("Please come back if you decided to buy");
        }
        System.out.println("============================================");

        for (String message : messages) {
            System.out.println(message);
        }
        System.out.println("============================================");

        scanner.close();
    }
    


}
