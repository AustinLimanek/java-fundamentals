package inheritance;

public class Shop extends Business{

    private String description;

    public Shop(String name, Integer expense, String description) {
        super(name, expense);
        this.description = description;
    }

    @Override
    public String toString(){
        return "Description: " + this.description + "\n" + this.getName() + " is rated " + String.format("%.1f", this.getRating()) + " stars and has an expense of " + this.getExpense();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
