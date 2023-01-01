package main.java.movieTest;

import main.java.movie.Video;
import main.java.movie.Movie;


public class MovieTest
{
    public static void main(String[] args)
    {
        Video gentlemen_v = new Video("The Gentlemen", 113);
        Movie gentlemen_m = new Movie(gentlemen_v.getTitle(), gentlemen_v.getLength(),
                               "Guy Ritchie", 8);
        gentlemen_v.show();
        System.out.println("-------------------------------------------");
        gentlemen_m.show();
    }
}
