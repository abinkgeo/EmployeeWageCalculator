package employeewagecal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeWageBuilder implements WageInterface {

    public HashMap<String, Integer> wageMap = new HashMap<>();

    @Override
    public int computeWages(String company, int wagePerHour, int maxHours, int maxDays) {

        int hours = 0;
        int days = 0;

        while (hours < maxHours && days < maxDays) {
            days++;
            int emp = (int)(Math.random() * 3);
            int empHours = 0;
            switch(emp) {
                case 1:
                    hours = 4;
                    break;
                case 2:
                    hours = 8;
                    break;

                default:
                    hours = 0;
            }

            hours += empHours;
        }

        int total = hours * wagePerHour;
        wageMap.put(company, total);
        return total;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        EmployeeWageBuilder ewb=new EmployeeWageBuilder();

        CompanyEmpWage companyEmpWage=new CompanyEmpWage();


        ArrayList<CompanyEmpWage> arr=new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("Enter the Company name");
            String company=scanner.nextLine();
            System.out.println("Enter the wage per hour ");
            int wagePerHour=scanner.nextInt();
            System.out.println("Enter the max hours ");
            int maxHours=scanner.nextInt();
            System.out.println("Enter the maxdays ");
            int maxDays=scanner.nextInt();
            scanner.nextLine();
            int totalWage=ewb.computeWages(company,wagePerHour,maxHours,maxDays);



            arr.add(new CompanyEmpWage(company,wagePerHour,maxHours,maxDays,totalWage));




        }


        for(CompanyEmpWage c:arr){
            System.out.println(c);
        }
    }



}

