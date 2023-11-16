package com.example.Payroll;

/**
 * EmployeeNotFoundException
 */
class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id){
        super("Could not find employee " + id);
    }
}