package com.task.lab5;

import com.task.lab5.employee.Employee;
import com.task.lab5.manager.Manager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager(1, "Artem", "Meniak", 10000);
        Manager manager2 = new Manager(2, "Maxim", "Basow", 8000, manager1);
        Manager manager3 = new Manager(3, "Dasha", "Kozlova", 7000);
        Manager manager4 = new Manager(4, "Aliona", "Tenytskaya", 6500, manager3);
        Manager manager5 = new Manager(5, "Ehor", "Shum", 10000, manager4);
        Manager manager6 = new Manager(6, "Ivan", "Ivanov", 5000, manager5);

        Employee employee1 = new Employee(1, "Maxim", "Mikitchenko", 4000, manager2);
        Employee employee2 = new Employee(2, "Katerina", "Zarudnaya", 5000, manager2);
        Employee employee3 = new Employee(3, "Bohdan", "Vasilyev", 6000, manager1);
        Employee employee4 = new Employee(4, "Nikita", "Chernenkiy", 6000, manager6);

        ArrayList<Employee> company = new ArrayList<>();
        company.add(manager1);
        company.add(employee3);
        company.add(manager2);
        company.add(employee1);
        company.add(employee2);
        company.add(manager3);
        company.add(manager4);
        company.add(manager5);
        company.add(manager6);
        company.add(employee4);

        for (Employee human : company) {
            System.out.println(human.toString());
        }

        System.out.println(employee4.getTopManager().toString());
    }
}
