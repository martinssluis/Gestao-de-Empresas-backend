package com.aceleradev.backend.services;

import com.aceleradev.backend.model.UserType;
import com.aceleradev.backend.model.entities.Client;
import com.aceleradev.backend.model.entities.Employee;
import com.aceleradev.backend.repositories.ClientRepository;
import com.aceleradev.backend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Object authenticate(String email, String password, UserType userType){
        switch (userType){
            case CLIENT:
                Client client = clientRepository.findByEmail(email);
                if (client != null && client.getPassword().equals(password)){
                    return client;
                }
                break;
            case EMPLOYEE:
                Employee employee = employeeRepository.findByEmail(email);
                if (employee != null && employee.getPassword().equals(password)){
                    return employee;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
        throw new IllegalArgumentException("Invalid email or password");
    }
}
