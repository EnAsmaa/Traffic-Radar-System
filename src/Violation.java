
public class Violation{

    private String description;
    private int amount;

    public Violation(String description, int amount){
        this.description = description;
        this.amount = amount;
    }

    public String getDescription(){
        return description;
    }

    public int getAmount(){
        return amount;
    }
}