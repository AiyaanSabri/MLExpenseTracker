public class Expense{

    private double amount;
    private String category;
    private String date;
    private String note;

    public Expense(double amountIn, String categoryIn, String dateIn, String noteIn){
        amount = amountIn;
        category = categoryIn;
        date = dateIn;
        note = noteIn;

    }

    public double getAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }
    public String getDate(){
        return date;
    }
    public String getNote(){
        return note;
    }

    public void setDate(String dateIn){
        date = dateIn;
    }
    public void setAmount(double amountIn){
        amount = amountIn;
    }
    public void setCategory(String categoryIn){
        category = categoryIn;
    }
    public void setNote(String noteIn){
        note = noteIn;
    }

    public String toString() {
        return "You have spent $" + amount + " on " + category + " on " + date + ". Note: " + note;
    }
    
}