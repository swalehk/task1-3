
package divisibility;

import java.util.Scanner;
public class Divisibility5 {

    
    public static void main(String[] args) {
       int number;
        Scanner s = new Scanner(System.in);
    System.out.print("Enter any number:");
    number = s.nextInt();
    if(number % 9 ==0)
    {
        System.out.print(number+ " is divisible by 9 ");
    }
    else
    {
        System.out.print(number+ " is not divisible by 9 ");
    }