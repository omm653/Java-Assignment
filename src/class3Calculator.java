import java.util.*;
public class class3Calculator {
    public static void main(String[] args){
        System.out.println("Click 1 for addition \nClick 2 for subtraction \nClick 3 for multiplication\nClick 4 for division \nClick 5 for modulus");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        if(n == 1){
            System.out.println("the addition of a and b is " + (a+b));
        }
        else if(n == 2){
            System.out.println("the subtraction of a and b is " + (a-b));
        }
        else if(n == 3){
            System.out.println("the multiplication of a and b is " + a*b);
        }
        else if(n == 4){
            if((a==0) || (b==0)){
                System.out.println("no division can perform");
            }
            else {
                System.out.println("the division of a and b = " + a / b);
            }
        }
        else if(n == 5){
            if((a==0) || (b==0)){
                System.out.println("no division can perform");
            }
            else {
                System.out.println(a % b);
            }
        }
        else {
            System.out.println("calculator has reach its limit of operations");
        }
    }

}
