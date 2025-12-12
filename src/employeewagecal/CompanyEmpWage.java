package employeewagecal;

public class CompanyEmpWage {


       private String company;
        private int wagePerHour;
       private int maxHours;
        private int maxDays;
       private int totalWage;

    public CompanyEmpWage(String company, int wagePerHour, int maxHours, int maxDays, int totalWage) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxHours = maxHours;
        this.maxDays = maxDays;
        this.totalWage = totalWage;
    }

    public CompanyEmpWage() {
    }

    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxHours() {
        return maxHours;
    }

    public int getMaxDays() {
        return maxDays;
    }

    public int getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", maxHours=" + maxHours +
                ", maxDays=" + maxDays +
                ", totalWage=" + totalWage +
                '}';
    }
}

