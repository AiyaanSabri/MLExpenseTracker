import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User{
    private ArrayList<Expense> expenses;
    
    public User(){
        expenses= new ArrayList<Expense>();
    }

    public void addExpense(Expense e){
        expenses.add(e);
    }
    public void viewExpenses(){
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.println("Your Expenses:");
        for (Expense e : expenses) {
            System.out.println(e);  // calls Expense.toString()
        }
    }

    public static void saveExpensesToFile(Expense ex){
        try(FileWriter writer = new FileWriter("expenses.csv",true)){
            writer.append(ex.getAmount() + "," + ex.getCategory() + "," + ex.getDate() + "," + ex.getNote() + "\n");
        }catch (IOException e){
            System.out.println("the file was not created");
        } 
    }
    public void loadExpenses(){
        try(BufferedReader br = new BufferedReader(new FileReader("expenses.csv"))){;
        
        String newLine;
        while ((newLine = br.readLine())!=null){
            String[] parts = newLine.split(",");
            Double amount = Double.parseDouble(parts[0]);
            String category = parts[1];
            String date = parts[2];
            String notes = parts[3];

            Expense e = new Expense(amount, category, date, notes);
            expenses.add(e);
        }
    }catch (IOException e){
        System.out.println("Data not loaded properly");
    }
    }
}