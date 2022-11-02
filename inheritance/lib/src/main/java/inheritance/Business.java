package inheritance;

import java.util.ArrayList;

public abstract class Business {
    private String name;
    private Integer expense;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Business(String name, Integer expense) {
        this.name = name;
        this.expense = expense;
    }

    public Business(String name) {
        this.name = name;
    }

    public void addReview (Review review){
        this.reviews.add(review);
        setRating();
    }

    public Double getRating() {
        double rating = 0.0;
        if(this.reviews.size() == 0) return 3.0;
        for( Review el : this.reviews){
            rating += el.getRating();
        }
        rating = rating / this.reviews.size();
        return rating;
    }

    public void setRating() {
        getRating();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }
}
