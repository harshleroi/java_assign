package java_assignment;
import java.util.*;
public class part1_3 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int num1,num2,num3,sum,average,product,largest,smallest;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
         num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        product = num1 * num2 * num3;

        System.out.println(sum);
        System.out.println(average);
        System.out.println(product);
        
        largest = num1;smallest = num1;
        if(num2 > largest) largest = num2;
        if(num3 > largest) largest = num3;
        if(num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        
        System.out.println("Largest of three integers is " + largest + " and the smallest is "+ smallest + ".");
        
    }
}
