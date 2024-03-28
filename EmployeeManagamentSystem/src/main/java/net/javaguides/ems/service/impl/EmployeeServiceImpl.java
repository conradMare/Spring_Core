package net.javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;
import net.javaguides.ems.mapper.EmployeeMapper;
import net.javaguides.ems.repository.EmployeeRepository;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service  // Creates Spring Bean
@AllArgsConstructor // Instead of creating the constructor manually
public class EmployeeServiceImpl implements EmployeeService {

    // Inject the dependencies
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        // Create Employee method - stores the Employee into a database
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        // Save Employee JPA entity in the database
        Employee savedEmployee = employee.save(employee);
        // Return Employee entity to client
        return  EmployeeMapper.mapToEmployeeDto(savedEmployee);

        return null;
    }
}
