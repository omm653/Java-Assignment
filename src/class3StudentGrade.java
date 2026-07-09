import java.util.*;
public class class3StudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the English Marks");
        int english = sc.nextInt();
        System.out.println("Enter the Hindi Marks");
        int hindi = sc.nextInt();
        System.out.println("Enter the Maths Marks");
        int maths = sc.nextInt();
        System.out.println("Enter the Science Marks");
        int science = sc.nextInt();
        System.out.println("the total is: ");
        int total = english+hindi+maths+science;
        System.out.println(total);

        if(total/4>90){
            System.out.println("Grade A");
        }
        if(total/4>75 && total/4<90){
            System.out.println("Grade B");
        }
        if(total/4>60 && total/4<74){
            System.out.println("Grade C");
        }
        if(total/4<60){
            System.out.println("Grade D");
        }

    }
}
