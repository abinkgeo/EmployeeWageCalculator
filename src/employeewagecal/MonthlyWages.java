package employeewagecal;

public class MonthlyWages {


    public  int monthlyWages(){
    int  monthDays=20;

    DailyWages dw=new DailyWages();


    return dw.fullTime()*monthDays;
    }
}
