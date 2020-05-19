package employees;

import fieldlengthlimitexception.FieldLengthLimitException;

import incorrectsalaryexception.IncorrectSalaryException;
import manager.Manager;

import javax.security.sasl.SaslServer;

public class Employee
{

    public Employee()
    {



    }

    public Employee(int id, String name,double salary)
    {
        try {

            this.id = id;

            if (name.length() > 20 || name.length() <= 1) {

                throw new FieldLengthLimitException("Недопустима кількість символів!");

            }

            this.name = name;

            if (salary < 0)
            {

                throw new IncorrectSalaryException("Зарплата не може бути від'ємною!");

            }

            this.salary = salary;

        }
        catch(FieldLengthLimitException ex)
        {

            System.out.println(ex.getMessage());

        }
        catch (IncorrectSalaryException ex)
        {

            System.out.println(ex.getMessage());

        }
    }

    public int getID()
    {

        return this.id;

    }

    public void setID(int id)
    {

        this.id = id;

    }

    public String getName()
    {

        return this.name;

    }

    public void setName(String name)
    {

        this.name = name;

    }

    public double getSalary()
    {

        return this.salary;

    }

    public void setSalary(double salary)
    {

        this.salary = salary;

    }

    final public Manager getManager()
    {

        return this.manager;

    }

    public void setManager(Manager manager)
    {

        this.manager = manager;

    }

    final public void increaseSalary(double percent)
    {

        this.salary = this.salary * (1 - (percent / 100));

    }

    @Override
    public String toString ()
    {

        return "Employee " + this.id + "\n" + "Name: " + this.name + "\n" + "Salary: " + this.salary + "\n" + "Manager " + this.manager.getName();

    }

    private int id;

    private String name;

    private double salary;

    private Manager manager;

}
