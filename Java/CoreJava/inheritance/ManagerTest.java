package inheritance;

import java.lang.System;

public class ManagerTest
{
    public static void main(String[] args)
    {
        // constuct a manager object
        Manager boss = new Manager("Dougen Nash", 80000, 2013, 1, 1);
        boss.SetBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff array with manager and employee objects
        staff[0] = boss;
        staff[1] = new Employee("Putin", 60000, 2011, 1, 23);
        staff[2] = new Employee("Johny Walker", 55000, 2015, 7, 1);

        // print out information about all employee objects
        for(Employee e:staff)
        {
            out.println("Employee name: " + e.getName() + ", Salary: " + e.getSalary());
        }
    }
}