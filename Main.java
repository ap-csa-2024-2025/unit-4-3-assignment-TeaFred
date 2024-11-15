import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Type in an integer: ");
    int num1 = 1;
    System.out.println("Type in an integer greater than the previous: ");
    int num2 = 25;

    for (int i = 0; i <= 25; i++)
    {
      if (i % 2 == 1)
      {
        System.out.println(i);
      }
    }
  }
}