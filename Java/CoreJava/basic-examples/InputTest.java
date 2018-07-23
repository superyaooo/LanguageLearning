import java.util.*;

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.printf("Hello %s, you will be %d years old next year.", name, age+1);
        System.out.println();
    }
}