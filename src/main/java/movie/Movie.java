package main.java.movie;

public class Movie extends Video
{
    private String director;
    private int rating;
    public Movie(String title, int length, String director, int rating)
    {
        super(title, length);
        this.director = director;
        this.rating = rating;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("Director: " + director + ", rating: " + rating);
    }
}
