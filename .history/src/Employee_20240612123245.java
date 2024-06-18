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

    public void changeSalary (double newSalary)
    {
        Employee.salary = newSalary;
    }
}
