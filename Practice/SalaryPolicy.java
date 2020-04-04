package Practice;

abstract public class SalaryPolicy {
    private float baseSalary;

    public SalaryPolicy(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return  baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    abstract float getSalary();


    public String toString() {
        return "SalaryPolicy[baseSalary=" + baseSalary + "]";
    }


}
