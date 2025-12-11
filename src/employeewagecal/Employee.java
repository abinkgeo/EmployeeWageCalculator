package employeewagecal;

public class Employee {


        public static int computeWage() {
            int WAGE_PER_HOUR = 20;
            int FULL_TIME = 2;
            int PART_TIME = 1;
            int totalHours = 0;
            int totalDays = 0;
            int MAX_HOURS = 100;
            int MAX_DAYS = 20;

            while(totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
                totalDays++;
                int empCheck = (int)(Math.random() * 3);
                int hours = switch(empCheck) {
                    case 2 -> 8;
                    case 1 -> 4;
                    default -> 0;
                };
                totalHours += hours;
            }
            return totalHours * WAGE_PER_HOUR;
        }

        public static void main(String[] args) {
            System.out.println("Total Wage = " + computeWage());
        }
    }


