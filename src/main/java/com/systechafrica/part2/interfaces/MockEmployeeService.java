package com.systechafrica.part2.interfaces;

import com.systechafrica.part2.accessmodifiers.Employee;

public class MockEmployeeService implements EmployeeService {

    @Override
    public Employee createEmployee(Employee employee) {
        return employee;
    }

}
