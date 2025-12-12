package employeewagecal;

public interface WageInterface {

     int computeWages(String company, int wagePerHour, int maxHours, int maxDays);
     int dailyWages(String company, int wagePerHour, int maxHours, int maxDays);
}
