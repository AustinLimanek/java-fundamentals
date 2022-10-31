package inheritance;

public class Review {
    private String body;
    private int rating;
    private String author;

    public String getBody() {
        return body;
    }

    public Review(String body, int rating, String author) {
        this.body = body;
        this.rating = rating;
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "User: " + this.author + "\n" + "Review: " + this.body + "\n" + "Number of stars: " + this.rating;
    }

}
