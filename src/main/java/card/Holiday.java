package main.java.card;

public class Holiday extends Card
{
    public Holiday(String recipient)
    {
        this.recipient = recipient;
    }

    @Override
    public void greeting()
    {
        System.out.println("Dear " + recipient + ", ");
        System.out.println("Season's Greetings!");
    }

}
