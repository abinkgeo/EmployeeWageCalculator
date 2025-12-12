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

    @Override
    public int dailyWage(String company, int wagePerHour, int maxHours, int maxDays) {

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

        int dailyWage = hours*wagePerHour;


        return dailyWage;
    }

    @Override
    public int getCompanyWage(String company) {

        if(wageMap.containsKey(company)){
            return wageMap.get(company);
        }
        return 0;
    }


}

