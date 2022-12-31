package main.java.card;

public class Birthday extends Card
{
    private int age;
    public Birthday(String recipient, int age)
    {
        this.recipient = recipient;
        this.age = age;
    }
    @Override
    public void greeting()
    {
        System.out.println("Dear " + recipient + ", ");
        System.out.println("Happy " + age + "th Birthday!");
    }
}
