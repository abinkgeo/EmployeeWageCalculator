package employeewagecal;

public class CompanyWage {


        public static int computeWage(String company, int wagePerHour, int maxHours, int maxDays) {
            int totalHours = 0;
            int totalDays = 0;

            while(totalHours < maxHours && totalDays < maxDays) {
                totalDays++;
                int emp = (int)(Math.random() * 3);

                int hours = 0;
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

                totalHours += hours;
            }

            int totalWage = totalHours * wagePerHour;
            System.out.println(company + " = Total Wage: " + totalWage);
            return totalWage;
        }

        public static void main(String[] args) {
            computeWage("Bridge Labz", 20, 100, 20);
            computeWage("Infosys", 25, 120, 24);
            computeWage("Google", 30, 150, 26);
        }


}
