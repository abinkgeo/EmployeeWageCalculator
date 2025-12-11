package employeewagecal;

import java.util.Stack;

public class DailyWages {

    static int WAGE_PER_HOUR=20;
    static int FULL_DAY_HOUR=8;
    public int  fullTime(){

        int wage=WAGE_PER_HOUR*FULL_DAY_HOUR;

        return  wage;
    }
}
