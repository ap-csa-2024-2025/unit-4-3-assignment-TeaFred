import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //Problem 1
    
    for (int i = 1; i <= 25; i++)
    {
      if (i % 2 == 1)
      {
        System.out.println(i);
      }
    }

    //Problem 2
    for (int i = 17; i <= 73; i++)
    {
      System.out.print(i + " ");
      if (i % 10 == 6)
      {
        System.out.print("\n");
      }
    }

    //Problem 3
    System.out.println("Please enter an integer: ");
    int num1 = sc.nextInt();
    if ((num1 <= 0)|| (num1 >= 50))
    {
      System.out.println("Error");
    }
    else
    {
      for (int i = num1; i <= 50; i++)
      {
        System.out.print(i + " ");
        if (i%5 == (num1%10 -1) || i%5 == (num1%10 +4))  //Or i%5 == (num1+4) % 5 = if the modulus of i is equal to the original number incremented by 4 and taking the modulus of it, if the end numbers are the same every 5 increments, it'll break the line
        {
          System.out.println();
        }
      }
    }
    //Problem 4
    System.out.println("Please enter an integer: ");
    int num2 = sc.nextInt();
    if (num2 <= 0)
    {
      System.out.println("Error");
    }
    else
    {
      for (int i = num2; i >=0; i--)
      {
        if (i%3 == 0)
        {
          System.out.print(i + " ");
        }
      }
    }

  }
}