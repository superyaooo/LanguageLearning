import java.util.*;

class Employee
{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
        hireDay = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay()
    {
        // return hireDay;    
        // always use clone whenever you need to return a copy of a mutable data field
        return hireDay.clone();
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary*byPercent/100;
        salary += raise;
    }
}

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Dougen Nash", 50000, 2016, 11, 3);
        staff[1] = new Employee("Hooly Woolio", 35000, 2015, 1, 5);

        for(Employee e:staff)
            e.raiseSalary(5);

        for(Employee e:staff)
        {
            System.out.println("name = " + e.getName() + " salary = $" + e.getSalary() + " hire day = " + e.getHireDay());
        }
    }
}