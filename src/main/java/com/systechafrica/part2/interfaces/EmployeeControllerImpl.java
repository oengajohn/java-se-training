package com.systechafrica.part2.interfaces;

import com.systechafrica.part2.accessmodifiers.Employee;

public class EmployeeControllerImpl implements EmployeeController {

    EmployeeService employeeService;

    public EmployeeControllerImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

}
