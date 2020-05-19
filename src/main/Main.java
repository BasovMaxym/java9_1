package main;

import employees.Employee;

import manager.Manager;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("Введіть ім'я першого працівника: ");

        String name = new String(in.nextLine());

        Employee first = new Employee(1, name ,100);

        Employee second = new Employee(2, "Bohdan",300);

        System.out.println("Введіть зарплату для третього працівника: ");

        double salary = in.nextDouble();

        Employee third = new Employee(3, "Misha", salary);

        Employee fourth = new Employee(4,"Yura",60);

        Manager firstmang = new Manager(400,1,"Donald",100);

        Manager secondmang = new Manager(200,2,"Frenk",200);

        Manager thirdmang = new Manager(500,3,"Flash",300);

        firstmang.addEmployee(third);

        secondmang.setManager(firstmang);

        secondmang.addEmployee(first);

        secondmang.addEmployee(second);

        first.setManager(secondmang);

        second.setManager(secondmang);

        third.setManager(firstmang);

        String result = secondmang.toString();

        System.out.println(result);

        Manager fourthmang = new Manager(500,4,"Andrey",200);

        Manager fifthmang = new Manager(500,5,"Ehor",300);

        Manager sixthmang = new Manager(500,6,"Clark",100);

        fourth.setManager(sixthmang);

        sixthmang.addEmployee(fourth);

        sixthmang.setManager(fifthmang);

        fifthmang.setManager(fourthmang);

        fourthmang.setManager(thirdmang);

        result = sixthmang.toString();

        System.out.println(result);

    }

}
