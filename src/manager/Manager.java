package manager;

import employees.Employee;

import java.util.ArrayList;

public class Manager extends Employee
{

    public Manager()
    {



    }


    public Manager(double bonus,int id, String name,double salary)
    {

        super(id, name,salary);

        employees = new ArrayList<Employee>();

        this.bonus = bonus;

    }

    @Override
    public double getSalary()
    {

        return super.getSalary() + this.bonus;

    }

    public void addEmployee(Employee employee)
    {

        employees.add(employee);

    }

    @Override
    public String toString()
    {

        StringBuilder allemployees = new StringBuilder();

        for (Employee value:employees)
        {

            allemployees.append(value.toString() + "\n");

        }

        if (this.getManager() != null)
        {

            System.out.println(allemployees.toString() + "\n" + "Bonus = " + this.bonus + "\n" + "Manager of " + this.getName() + " is " + this.getManager().getName() + "\n");

            return this.getManager().toString();

            //return allemployees.toString() + "\n" + "Bonus = " + this.bonus + "\n" + "Manager of " + this.getName() + " is " + this.getManager().getName() + "\n";
        }
        else
        {

            return allemployees.toString() + "\n" + "Bonus = " + this.bonus + "\n" + "Manager of " + this.getName() + " is " + "none" + "\n";

        }

    }

    public void setBonus(double bonus)
    {

        this.bonus = bonus;

    }

    public double getBonus()
    {

        return this.bonus;

    }

    ArrayList <Employee> employees;

    private double bonus;

}
