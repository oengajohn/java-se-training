package com.systechafrica.part2.interfaces;

import java.util.UUID;

import com.systechafrica.part2.accessmodifiers.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return employee;
    }

}
