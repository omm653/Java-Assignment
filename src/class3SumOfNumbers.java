import java.util.Scanner;

public class class3SumOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers limit you want to add");
        int n = sc.nextInt();
        int a = 0;
        int i = 0;
        while(i<=n){
            a = a+i;
            i++;
        }
        System.out.println("the sum of numbers are: " + a);
    }
}
