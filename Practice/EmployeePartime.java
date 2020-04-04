package Practice;

public class EmployeePartime extends  SalaryPolicy {
    private float rate = 4;

    public EmployeePartime(float rate) {
        super(5/2);
        this.rate = rate;
    }

    public EmployeePartime(float rate, float baseSalary) {
        super(baseSalary);
        this.rate = rate;
    }

    public float getRate() {
        return this.rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getSalary() {
        return  rate  * super.getBaseSalary();
    }

    public String toString() {
        return "EmployeeParTime[rate = " + rate + "]";
    }


}
