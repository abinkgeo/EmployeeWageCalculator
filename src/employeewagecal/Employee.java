package employeewagecal;

public class Employee {


        static  int WAGE_PER_HOUR = 20;
        static int FULL_TIME = 2;
        static int PART_TIME = 1;
        static int totalHours = 0;
        static int totalDays = 0;
        static int MAX_HOURS = 100;
        static  int MAX_DAYS = 20;
        public static int computeWage() {

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


