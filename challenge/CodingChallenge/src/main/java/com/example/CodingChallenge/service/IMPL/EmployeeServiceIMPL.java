package com.example.CodingChallenge.service.IMPL;



import com.example.CodingChallenge.dto.EmployeeDetailsDTO;
import com.example.CodingChallenge.entity.Employees;
import com.example.CodingChallenge.repository.EmployeeRepository;
import com.example.CodingChallenge.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceIMPL implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String saveDetails(com.example.CodingChallenge.EmployeeDetailsDTO employeeDetailsDTO) {
      Employees employees = new Employees(
             employeeDetailsDTO.getId(),
             employeeDetailsDTO.getName(),
            employeeDetailsDTO.getAddress(),
             employeeDetailsDTO.getDepartment(),
            employeeDetailsDTO.getEmail(),
            employeeDetailsDTO.getContact_number()
        );
        employeeRepository.save(employees);
        return "saved success";
    }


    @Override
    public String saveDetails(EmployeeDetailsDTO developerDetailsDTO) {
        return null;
    }
}
