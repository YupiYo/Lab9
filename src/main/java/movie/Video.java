package main.java.movie;

public class Video
{
    protected String title;
    protected int length;
    private boolean available;
    public Video(String title)
    {
        this.title = title;
        this.length = 90;
        this.available = true;
    }
    public Video(String title, int length)
    {
        this.title = title;
        this.length = length;
        this.available = true;
    }
    public int getLength()
    {
        return length;
    }
    public String getTitle()
    {
        return title;
    }
    public void show()
    {
        System.out.println(getTitle() + ", length: " + getLength() + ", available: " + available);
    }
}
