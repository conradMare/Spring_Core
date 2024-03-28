package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class is able to handle HTTP requests
@AllArgsConstructor // Instead of adding all the constructors manually
@RestController
@RequestMapping("/api/employees") // Able to define the base url for all the REST API's
public class EmployeeController {

    // Inject the dependencies
    private EmployeeService employeeService;


    // Build Add Employee REST API
    @PostMapping // Map the incoming HTTP POST request to this method
    // @RequestBody -> Will extract the JSON from the HTTP request, and convert that request into an object
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
