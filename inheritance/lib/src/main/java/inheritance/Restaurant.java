package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private Double rating = 3.0;
    private Integer expense;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, Integer expense) {
        this.name = name;
        this.expense = expense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        this.rating = 0.0;
        for( Review el : this.reviews){
            this.rating += el.getRating();
        }
        this.rating = this.rating / this.reviews.size();
        return this.rating;
    }

    public void setRating() {
        this.rating = getRating();
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    @Override
    public String toString(){
        return this.name + " is rated " + String.format("%.1f", this.rating) + " stars and has an expense of " + this.expense;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview (Review review){
        this.reviews.add(review);
        setRating();
    }
}
