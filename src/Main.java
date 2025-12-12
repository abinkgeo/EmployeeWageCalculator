import employeewagecal.CompanyEmpWage;
import employeewagecal.Employee;
import employeewagecal.EmployeeWageBuilder;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
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