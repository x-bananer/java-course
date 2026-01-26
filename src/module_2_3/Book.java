package module_2_3;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public void setRating(double selectedRating) {
        rating = selectedRating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
}