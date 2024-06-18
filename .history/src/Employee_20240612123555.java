public class Employee {
    private String name;
    private String lastname;
    private double salary;

    /**
     * 1 = m, 2 = f, 3 = o
     */
    private int genre;

    private DateEmployee birthDate;
    private DateEmployee initDate;

    public void changeSalary(double newSalary)
    {
        salary = newSalary;
    }

    public double showSalary()
    {
        return salary;
    }

    public double calculateBenefits()
    {
        return salary;
    }

    public void increaseSalary(double porcentIncrease)
    {
        salary = porcentIncrease * salary;
    }
}
