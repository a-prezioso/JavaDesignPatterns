package com.alex.com;

import com.alex.com.controller.EmployeeController;
import com.alex.com.model.Employee;
import com.alex.com.view.EmployeeDashboardView;

public class Main {

    public static void main(String[] args) {

        Employee employee = retrieveEmployeeFromServer();

        //Create our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Create our controller
        EmployeeController controller = new EmployeeController(employee, view);



//        controller.setEmployee(employee.getFirstName(), employee.getLastName());

        controller.updateDashboardView();



    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("32765523");
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSalary(125000);

        return employee;

    }
}
