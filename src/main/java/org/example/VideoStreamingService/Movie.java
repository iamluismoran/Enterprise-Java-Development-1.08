package org.example.VideoStreamingService;

public class Movie extends Video{
    private double rating;

    public Movie(String tittle, int duration, double rating) {
        super(tittle, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Rating: " + rating;
    }
}
