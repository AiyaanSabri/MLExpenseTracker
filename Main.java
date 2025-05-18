import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        Boolean running = true;
        while(running){
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1.AddExpense");
            System.out.println("2.View Expense");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter Category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
    
                    System.out.print("Enter note: ");
                    String note = scanner.nextLine();

                    Expense expense = new Expense(amount, category, date, note);
                    user.addExpense(expense);
                    user.saveExpensesToFile(expense);
                    break;

                case 2:
                    user.viewExpenses();
                    break;

                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }scanner.close();
    }
    
}