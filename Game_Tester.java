import java.util.Scanner;

public class Game_Tester{
    public static void main(String[] args) {
        FullTime fullTime = new FullTime("Enter Your Name:");
        PartTime partTime = new PartTime("Enter Your Name:");
        int choice;
        int HOURS;
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER WHICH TYPE OF GAMETESTER YOU ARE: FULLTIME[1] / PARTIME[2]");
        choice = sc.nextInt();
        System.out.println("ENTER NUMBER OF WORKING HOURS: ");
        HOURS = sc.nextInt();

        if(choice == 1 ){
            System.out.println("FEES TO BE PAID BY FULLTIME STUDENT IS: " + fullTime.Determine_fee(HOURS));
        }
        else if(choice == 2){
            System.out.println("FEES TO BE PAID BY PARTTIME STUDENT IS: " + partTime.Determine_fee(HOURS));
        }
        else {
            System.out.println("PLEASE CHOOSE CORRECT OPTIONS!");
        }
    }
}