import employeewagecal.Employee;
import employeewagecal.EmployeeWageBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeWageBuilder e=new EmployeeWageBuilder();
            e.computeWages("BridgeLabz", 20, 100, 20);
            e.computeWages("Infosys", 25, 120, 22);

            System.out.println("Stored Wage of BridgeLabs = " + e.wageMap.get("BridgeLabz"));

    }
}