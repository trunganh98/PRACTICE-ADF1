package Practice;

public class TestSalaryPolicy {
    public static void main(String[] args) {
        SalaryPolicy s1 = new EmployeeFullTime(10);
        System.out.println(s1);

        SalaryPolicy s2 = new EmployeePartime(15);
        System.out.println(s2);
    }

}
