package employeewagecal;

public interface WageInterface {

     int computeWages(String company, int wagePerHour, int maxHours, int maxDays);
     int dailyWage(String company, int wagePerHour, int maxHours, int maxDays);
     int getCompanyWage(String company);
}
