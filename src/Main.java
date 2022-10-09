import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random rand = new Random();
        int number = rand.nextInt(1, 10);
        System.out.println("Your lucky number today is " + number);
    }
}