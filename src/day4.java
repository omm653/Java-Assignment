
  public class day4 {
 /*   public static void startAttendance(){
        System.out.println("attendence is start");
    }

    public static void main(String[] args){
        int i = 1;
        for(startAttendance();i<=10;i++){
            System.out.println("The first ten Roll numbers are: " + i);
        }

    }
} */
    public static void showProgress(int i) {
            System.out.println("progress tracked: " +i);

    }
    public static void main(String[] args){
        int i = 1;
        while(i<=5){
            System.out.println(i);
            showProgress(i);
            i++;
        }
    }
}
