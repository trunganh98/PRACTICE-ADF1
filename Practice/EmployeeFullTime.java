package Practice;

public class EmployeeFullTime extends SalaryPolicy {
    private float rate;


    public EmployeeFullTime(float rate) {
        super(4);
        this.rate = rate;
    }

    public EmployeeFullTime(float rate, float baseSalary) {
        super(baseSalary);
        this.rate = rate;
    }

    public float getRate() {
        return this.rate;
    }

    public void setRate(float rate) {
        this.rate =rate;
    }


    public float getSalary() {
        return  rate  * super.getBaseSalary();
    }

    public String toString() {
        return "EmployeeFullTime[rate =" + rate + "]";
    }

}
