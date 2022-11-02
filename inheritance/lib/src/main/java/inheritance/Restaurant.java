package inheritance;

public class Restaurant extends Business {

    public Restaurant(String name, Integer expense) {
        super(name, expense);
    }

    @Override
    public String toString(){
        return this.getName() + " is rated " + String.format("%.1f", this.getRating()) + " stars and has an expense of " + this.getExpense();
    }

}
