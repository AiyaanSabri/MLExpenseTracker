import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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
}