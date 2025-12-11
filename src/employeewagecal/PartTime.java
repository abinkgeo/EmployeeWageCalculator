package employeewagecal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PartTime {

    static  int PART_TIME_HOURS=4;


    public int partTime() {

    return PART_TIME_HOURS*DailyWages.WAGE_PER_HOUR;
    }
}
