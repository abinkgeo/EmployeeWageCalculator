package employeewagecal;

public class WageTillCondition {

public void wage(int hours, int days){
    int maxHours=100;
    int maxDays=20;

    DailyWages dw=new DailyWages();
    int totalWage=0;
    if(hours<maxHours && days<maxDays ){

        totalWage=hours*DailyWages.WAGE_PER_HOUR;

    }
    else {
        totalWage=dw.fullTime()*maxDays;
    }
    System.out.println(totalWage);
}



}
