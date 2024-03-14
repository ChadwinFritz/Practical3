package za.ac.cput;

import java.util.*;
import javax.swing.*;

public class TestEmployee {

    public static void main(String[] args) {

        ArrayList <Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee("Saton", "Shade", 5000);

        employees.add(emp1);
        employees.add(new Employee("Natheer", "Shade", 9000));
        employees.add(new Employee("Zaheer", "March", 5000));
        employees.add(new Employee("Zeenat", "Blommetjie", 8000));
        employees.add(new Employee("Soraya", "May", 4000));
        employees.add(new Employee("Abdullah", "Daniels", 1000));
        employees.add(new Employee("Imraan", "Weghourst", 10000));
        employees.add(new Employee("Immrah", "Jesus", 6000));
        employees.add(new Employee("Yakeen", "Saka", 6500));
        employees.add(new Employee("Tauriq", "Partey", 20000));

        JOptionPane.showMessageDialog(null, employees);

        //ArrayList<Employee> employeesM = new ArrayList<>(); Creatte new arraylist for employees that surnames start with a M
        String emp = "";

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSurname().startsWith("M")) {
                //JOptionPane.showMessageDialog(null, employees.get(i).getName() + " " + employees.get(i).getSurname()); Display each employee seperately
                //employeesM.add(employees.get(i));
                emp += employees.get(i).getName() + " " + employees.get(i).getSurname() + "\n";

            }
        }

        //JOptionPane.showMessageDialog(null, employeesM); display the new arraylist
        JOptionPane.showMessageDialog(null, emp);

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getSalary() <= 5000) {
                employees.remove(i);
            }
        }

        JOptionPane.showMessageDialog(null, employees);

    }

}
