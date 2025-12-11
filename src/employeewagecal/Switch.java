package employeewagecal;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DailyWages dailyWages=new DailyWages();
        PartTime pt=new PartTime();

        while(true){

        System.out.println("Enter the type of employement");
        System.out.println("1.PartTime");
        System.out.println("2.Full Time");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println(dailyWages.fullTime());
                break;
            case 2:
                System.out.println( pt.partTime());
                break;
            default:
                System.out.println("Enter the correct choice");
        }
        }
    }

}
