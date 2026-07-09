import java.util.*;
public class class3CheckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to check: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("no is positive");
        }
        else if (a==0) {
            System.out.println("no is zero");
        }
        else{
            System.out.println("no is negative");
        }
    }
}
