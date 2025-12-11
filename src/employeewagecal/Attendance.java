package employeewagecal;

public class Attendance {

    public static void main(String[] args) {
        int isPresent=1;
        int emp=(int)(Math.random()*2);

        if(isPresent==emp){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
