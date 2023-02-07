import java.util.Scanner;
public class IntegerSum {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int input = 1;
    int sum = 0;
    int count = 1;
    
while (input != 0 && count < 10){
    System.out.print("Please enter your number: " );
    input= scan.nextInt();

  if(input !=0){
    sum += input;
    count++;
  }
  }
    
    
    System.out.println("The sum of the numbers is " + sum);
  }
}