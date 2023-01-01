package main.java.movieTest;

import main.java.movie.Video;

public class VideoTest
{
    public static void main(String[] args)
    {
        Video revolver = new Video("Revolver");
        Video gentlemen = new Video("The Gentlemen", 113);
        revolver.show();
        gentlemen.show();
    }
}
